package com.nishantsapplication.app.modules.interests.`data`.model

import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArt: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCryptocurrency: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cryptocurrency)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScience: String? = MyApp.getInstance().resources.getString(R.string.lbl_science)

)
