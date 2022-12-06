package com.nishantsapplication.app.modules.notifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.base.BaseActivity
import com.nishantsapplication.app.databinding.ActivityNotificationsBinding
import com.nishantsapplication.app.modules.notifications.`data`.viewmodel.NotificationsVM
import kotlin.String
import kotlin.Unit

class NotificationsActivity :
    BaseActivity<ActivityNotificationsBinding>(R.layout.activity_notifications) {
  private val viewModel: NotificationsVM by viewModels<NotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
