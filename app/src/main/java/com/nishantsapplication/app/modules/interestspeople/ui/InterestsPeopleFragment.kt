package com.nishantsapplication.app.modules.interestspeople.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.base.BaseFragment
import com.nishantsapplication.app.databinding.FragmentInterestsPeopleBinding
import com.nishantsapplication.app.modules.interestspeople.`data`.model.ListprofilepictureRowModel
import com.nishantsapplication.app.modules.interestspeople.`data`.viewmodel.InterestsPeopleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InterestsPeopleFragment :
    BaseFragment<FragmentInterestsPeopleBinding>(R.layout.fragment_interests_people) {
  private val viewModel: InterestsPeopleVM by viewModels<InterestsPeopleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listprofilepictureAdapter =
    ListprofilepictureAdapter(viewModel.listprofilepictureList.value?:mutableListOf())
    binding.recyclerListprofilepicture.adapter = listprofilepictureAdapter
    listprofilepictureAdapter.setOnItemClickListener(
    object : ListprofilepictureAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListprofilepictureRowModel) {
        onClickRecyclerListprofilepicture(view, position, item)
      }
    }
    )
    viewModel.listprofilepictureList.observe(requireActivity()) {
      listprofilepictureAdapter.updateData(it)
    }
    binding.interestsPeopleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListprofilepicture(
    view: View,
    position: Int,
    item: ListprofilepictureRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INTERESTS_PEOPLE_FRAGMENT"

  }
}
