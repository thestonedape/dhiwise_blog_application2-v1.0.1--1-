package com.nishantsapplication.app.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.nishantsapplication.app.R
import com.nishantsapplication.app.appcomponents.base.BaseActivity
import com.nishantsapplication.app.appcomponents.facebookauth.FacebookHelper
import com.nishantsapplication.app.appcomponents.googleauth.GoogleHelper
import com.nishantsapplication.app.databinding.ActivitySignInBinding
import com.nishantsapplication.app.modules.explore.ui.ExploreActivity
import com.nishantsapplication.app.modules.signin.`data`.viewmodel.SignInVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
  private val viewModel: SignInVM by viewModels<SignInVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = ExploreActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
      googleLogin = GoogleHelper(this,
      { accountInfo ->
        },{ error -> 

        })
      }

      override fun setUpClicks(): Unit {
        binding.linearRowfacebookone.setOnClickListener {
          LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
          facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
            override fun onSuccess(result: LoginResult?) {
            }
            override fun onError(error: FacebookException?) {
            }
            override fun onCancel() {
            }
            })
          }
          binding.linearRowgoogleone.setOnClickListener {
            googleLogin.login()
          }
        }

        companion object {
          const val TAG: String = "SIGN_IN_ACTIVITY"


          fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, SignInActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
          }
        }
      }
