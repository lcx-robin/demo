package com.ms.app.base

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.multidex.MultiDexApplication
import com.ms.app.base.utils.SpUtils

class BaseApplication : MultiDexApplication() {
    private val TAG = "ActivityLifecycle"

    companion object {
        lateinit var context: Context
        lateinit var instance: BaseApplication
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        instance = this

        initMMKV()

        registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityCreated......")
                ActivityStackManager.addActivityToStack(activity)
            }

            override fun onActivityStarted(activity: Activity) {
                Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityStarted......")
            }

            override fun onActivityResumed(activity: Activity) {
                Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityResumed......")
            }

            override fun onActivityPaused(activity: Activity) {
                Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityPaused......")
            }

            override fun onActivityStopped(activity: Activity) {
                Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityStopped......")
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                Log.e(TAG, "${activity.javaClass.simpleName} --> onActivitySaveInstanceState......")
            }

            override fun onActivityDestroyed(activity: Activity) {
                Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityDestroyed......")
                ActivityStackManager.popActivityToStack(activity)
            }
        })
    }

    private fun initMMKV(): String {
        val result = SpUtils.initMMKV(context)
        return "MMKV -->> $result"
    }

}