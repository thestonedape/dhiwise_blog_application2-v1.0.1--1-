package com.nishantsapplication.app.modules.interestspeople.`data`.model

import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsPeopleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_see_all_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMorepeopleto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_more_people_to)

)
