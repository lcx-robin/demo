package com.ms.app.base.listener

import android.view.View

class OnSingleClickListener(
    private val mDelayTime: Int = 500,
    private val mListener: (v: View) -> Unit
) : View.OnClickListener {

    /**
     * 上次有效点击的时间
     */
    private var mLastClickTime = 0L

    override fun onClick(v: View) {
        val currentTimeMillis = System.currentTimeMillis()
        if (currentTimeMillis - mLastClickTime >= mDelayTime) {
            mLastClickTime = currentTimeMillis
            mListener.invoke(v)
        }
    }

}