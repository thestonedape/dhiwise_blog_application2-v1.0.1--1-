package com.nishantsapplication.app.modules.intereststopics.`data`.model

import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListthumbnailRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEasytoUse: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)

)
