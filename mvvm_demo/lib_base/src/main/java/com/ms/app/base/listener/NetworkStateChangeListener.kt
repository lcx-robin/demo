package com.ms.app.base.listener

interface NetworkStateChangeListener {

    /**
     * 网络类型更改回调
     * @param type NetworkTypeEnum 网络类型
     * @return Unit
     */
    fun networkTypeChange(type: Int)

    /**
     * 网络连接状态更改回调
     * @param isConnected Boolean 是否已连接
     * @return Unit
     */
    fun networkConnectChange(isConnected: Boolean)

}