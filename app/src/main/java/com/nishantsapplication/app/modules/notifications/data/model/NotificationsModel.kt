package com.nishantsapplication.app.modules.notifications.`data`.model

import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bezaleel_nwabia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_catalunha_mj_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTisanthanpanch: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tisanthan_panch)

)
