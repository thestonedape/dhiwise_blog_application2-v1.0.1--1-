package com.nishantsapplication.app.modules.interests.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nishantsapplication.app.modules.interests.`data`.model.InterestsModel
import com.nishantsapplication.app.modules.interests.`data`.model.InterestsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class InterestsVM : ViewModel(), KoinComponent {
  val interestsModel: MutableLiveData<InterestsModel> = MutableLiveData(InterestsModel())

  var navArguments: Bundle? = null

  val interestsList: MutableLiveData<MutableList<InterestsRowModel>> =
      MutableLiveData(mutableListOf())
}
