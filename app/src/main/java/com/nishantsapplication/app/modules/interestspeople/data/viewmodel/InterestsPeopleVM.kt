package com.nishantsapplication.app.modules.interestspeople.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nishantsapplication.app.modules.interestspeople.`data`.model.InterestsPeopleModel
import com.nishantsapplication.app.modules.interestspeople.`data`.model.ListprofilepictureRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class InterestsPeopleVM : ViewModel(), KoinComponent {
  val interestsPeopleModel: MutableLiveData<InterestsPeopleModel> =
      MutableLiveData(InterestsPeopleModel())

  var navArguments: Bundle? = null

  val listprofilepictureList: MutableLiveData<MutableList<ListprofilepictureRowModel>> =
      MutableLiveData(mutableListOf())
}
