package com.nishantsapplication.app.modules.explore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nishantsapplication.app.modules.explore.`data`.model.ExploreModel
import com.nishantsapplication.app.modules.explore.`data`.model.ExploreRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExploreVM : ViewModel(), KoinComponent {
  val exploreModel: MutableLiveData<ExploreModel> = MutableLiveData(ExploreModel())

  var navArguments: Bundle? = null

  val exploreList: MutableLiveData<MutableList<ExploreRowModel>> = MutableLiveData(mutableListOf())
}
