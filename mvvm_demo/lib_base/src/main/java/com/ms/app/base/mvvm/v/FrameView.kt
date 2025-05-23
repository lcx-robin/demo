package com.ms.app.base.mvvm.v

import androidx.lifecycle.LiveData
import androidx.viewbinding.ViewBinding

interface FrameView<VB: ViewBinding> {

    /**
     * 创建 [ViewBinding] 实例
     */
    fun createVB(): VB

    /**
     * 初始化 View
     */
    fun VB.initView()

    /**
     * 订阅 [LiveData]
     */
    fun initObserve()

    /**
     * 用于在页面创建时进行请求接口
     */
    fun initRequestData()

}