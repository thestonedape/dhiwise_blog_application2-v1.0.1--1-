package com.nishantsapplication.app.modules.intereststopics.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.base.BaseFragment
import com.nishantsapplication.app.databinding.FragmentInterestsTopicsBinding
import com.nishantsapplication.app.modules.intereststopics.`data`.model.ListthumbnailRowModel
import com.nishantsapplication.app.modules.intereststopics.`data`.viewmodel.InterestsTopicsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InterestsTopicsFragment :
    BaseFragment<FragmentInterestsTopicsBinding>(R.layout.fragment_interests_topics) {
  private val viewModel: InterestsTopicsVM by viewModels<InterestsTopicsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listthumbnailAdapter =
    ListthumbnailAdapter(viewModel.listthumbnailList.value?:mutableListOf())
    binding.recyclerListthumbnail.adapter = listthumbnailAdapter
    listthumbnailAdapter.setOnItemClickListener(
    object : ListthumbnailAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListthumbnailRowModel) {
        onClickRecyclerListthumbnail(view, position, item)
      }
    }
    )
    viewModel.listthumbnailList.observe(requireActivity()) {
      listthumbnailAdapter.updateData(it)
    }
    binding.interestsTopicsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListthumbnail(
    view: View,
    position: Int,
    item: ListthumbnailRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INTERESTS_TOPICS_FRAGMENT"

  }
}
