package com.nishantsapplication.app.modules.interests.`data`.model

import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletext: String? = MyApp.getInstance().resources.getString(R.string.msg_what_are_you_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletextOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_are_you_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptiontes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_or_edit_top)

)
