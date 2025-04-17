package com.ms.app.mvvmdemo

import androidx.activity.viewModels
import com.ms.app.base.mvvm.v.BaseActivity
import com.ms.app.mvvmdemo.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {
    /**
     * 通过 viewModels() + Hilt 获取 ViewModel 实例
     */
    override val mViewModel by viewModels<HomeViewModel>()

    override fun createVB() = ActivityHomeBinding.inflate(layoutInflater)

    override fun ActivityHomeBinding.initView() {}

    override fun initObserve() {}

    override fun initRequestData() {}

}
