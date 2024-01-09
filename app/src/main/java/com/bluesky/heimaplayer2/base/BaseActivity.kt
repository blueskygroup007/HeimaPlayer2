package com.bluesky.heimaplayer2.base

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 *
 * @author BlueSky
 * @date 24.1.8
 * Description:
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }


    open fun initData() {

    }

    /*protected比public要好,private的话呢?*/
    protected fun initListener() {

    }

    abstract fun getLayoutId(): Int

    private fun myToast(msg: String) {
        Toast.makeText(baseContext.applicationContext, msg, Toast.LENGTH_SHORT).show()
    }

    private fun myLog(tag: String, log: String) {
        Log.d(tag, log)
    }

}