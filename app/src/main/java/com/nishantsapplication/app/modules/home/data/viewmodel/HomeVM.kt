package com.nishantsapplication.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nishantsapplication.app.modules.home.`data`.model.HomeModel
import com.nishantsapplication.app.modules.home.`data`.model.HomeRowModel
import com.nishantsapplication.app.modules.itemdrawermenu.`data`.model.DrawerItemDrawerMenuModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  public var includedModel: MutableLiveData<DrawerItemDrawerMenuModel> =
      MutableLiveData(DrawerItemDrawerMenuModel())

  val homeList: MutableLiveData<MutableList<HomeRowModel>> = MutableLiveData(mutableListOf())
}
