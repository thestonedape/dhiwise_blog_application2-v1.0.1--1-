package com.nishantsapplication.app.modules.blog.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.base.BaseActivity
import com.nishantsapplication.app.databinding.ActivityBlogBinding
import com.nishantsapplication.app.modules.blog.`data`.viewmodel.BlogVM
import kotlin.String
import kotlin.Unit

class BlogActivity : BaseActivity<ActivityBlogBinding>(R.layout.activity_blog) {
  private val viewModel: BlogVM by viewModels<BlogVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.blogVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BLOG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BlogActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
