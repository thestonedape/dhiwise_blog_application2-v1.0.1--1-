package com.nishantsapplication.app.modules.interests.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.base.BaseActivity
import com.nishantsapplication.app.databinding.ActivityInterestsBinding
import com.nishantsapplication.app.modules.interests.`data`.model.InterestsRowModel
import com.nishantsapplication.app.modules.interests.`data`.viewmodel.InterestsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InterestsActivity : BaseActivity<ActivityInterestsBinding>(R.layout.activity_interests) {
  private val viewModel: InterestsVM by viewModels<InterestsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val interestsAdapter = InterestsAdapter(viewModel.interestsList.value?:mutableListOf())
    binding.recyclerInterests.adapter = interestsAdapter
    interestsAdapter.setOnItemClickListener(
    object : InterestsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : InterestsRowModel) {
        onClickRecyclerInterests(view, position, item)
      }
    }
    )
    viewModel.interestsList.observe(this) {
      interestsAdapter.updateData(it)
    }
    binding.interestsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerInterests(
    view: View,
    position: Int,
    item: InterestsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INTERESTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InterestsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
