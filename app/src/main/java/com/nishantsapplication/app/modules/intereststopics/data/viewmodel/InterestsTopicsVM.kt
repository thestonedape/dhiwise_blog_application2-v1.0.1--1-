package com.nishantsapplication.app.modules.intereststopics.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nishantsapplication.app.modules.intereststopics.`data`.model.InterestsTopicsModel
import com.nishantsapplication.app.modules.intereststopics.`data`.model.ListthumbnailRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class InterestsTopicsVM : ViewModel(), KoinComponent {
  val interestsTopicsModel: MutableLiveData<InterestsTopicsModel> =
      MutableLiveData(InterestsTopicsModel())

  var navArguments: Bundle? = null

  val listthumbnailList: MutableLiveData<MutableList<ListthumbnailRowModel>> =
      MutableLiveData(mutableListOf())
}
