package com.nishantsapplication.app.modules.termsandconditions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.base.BaseActivity
import com.nishantsapplication.app.databinding.ActivityTermsAndConditionsBinding
import com.nishantsapplication.app.modules.termsandconditions.`data`.viewmodel.TermsAndConditionsVM
import kotlin.String
import kotlin.Unit

class TermsAndConditionsActivity :
    BaseActivity<ActivityTermsAndConditionsBinding>(R.layout.activity_terms_and_conditions) {
  private val viewModel: TermsAndConditionsVM by viewModels<TermsAndConditionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.termsAndConditionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TERMS_AND_CONDITIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TermsAndConditionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
