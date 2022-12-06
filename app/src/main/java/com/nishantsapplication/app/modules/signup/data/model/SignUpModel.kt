package com.nishantsapplication.app.modules.signup.`data`.model

import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletext: String? = MyApp.getInstance().resources.getString(R.string.lbl_register_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupwithFa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupwithTw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_tw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupwithAp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_ap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_by_signing_up)

)
