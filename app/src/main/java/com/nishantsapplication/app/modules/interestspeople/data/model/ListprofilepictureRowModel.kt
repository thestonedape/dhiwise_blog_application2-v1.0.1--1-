package com.nishantsapplication.app.modules.interestspeople.`data`.model

import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListprofilepictureRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)

)
