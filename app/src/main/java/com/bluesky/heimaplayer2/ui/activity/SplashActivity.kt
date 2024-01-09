package com.bluesky.heimaplayer2.ui.activity

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.widget.ImageView
import com.bluesky.heimaplayer2.R
import com.bluesky.heimaplayer2.base.BaseActivity

/**
 *
 * @author BlueSky
 * @date 24.1.8
 * Description:
 */
class SplashActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        val girl = findViewById<ImageView>(R.id.iv_girl)
        //val animator = ObjectAnimator.ofFloat(girl,)

        //animator.duration = 3000
        //animator.start()

    }
}