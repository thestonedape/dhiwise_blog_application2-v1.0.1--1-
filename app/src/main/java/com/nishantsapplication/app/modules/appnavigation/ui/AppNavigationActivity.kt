package com.nishantsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.base.BaseActivity
import com.nishantsapplication.app.databinding.ActivityAppNavigationBinding
import com.nishantsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.nishantsapplication.app.modules.blog.ui.BlogActivity
import com.nishantsapplication.app.modules.explore.ui.ExploreActivity
import com.nishantsapplication.app.modules.home.ui.HomeActivity
import com.nishantsapplication.app.modules.interests.ui.InterestsActivity
import com.nishantsapplication.app.modules.notifications.ui.NotificationsActivity
import com.nishantsapplication.app.modules.privacypolicy.ui.PrivacyPolicyActivity
import com.nishantsapplication.app.modules.searchtopics.ui.SearchTopicsActivity
import com.nishantsapplication.app.modules.signin.ui.SignInActivity
import com.nishantsapplication.app.modules.signup.ui.SignUpActivity
import com.nishantsapplication.app.modules.termsandconditions.ui.TermsAndConditionsActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearExplore.setOnClickListener {
      val destIntent = ExploreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearchTopics.setOnClickListener {
      val destIntent = SearchTopicsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignIn.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotifications.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBlog.setOnClickListener {
      val destIntent = BlogActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPrivacyPolicy.setOnClickListener {
      val destIntent = PrivacyPolicyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInterests.setOnClickListener {
      val destIntent = InterestsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTermsAndConditions.setOnClickListener {
      val destIntent = TermsAndConditionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
