package com.nishantsapplication.app.modules.intereststopics.`data`.model

import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsTopicsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArtEntertain: String? = MyApp.getInstance().resources.getString(R.string.msg_arts_entertai)

)
