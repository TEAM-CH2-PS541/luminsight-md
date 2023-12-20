package com.luminapp.luminsight.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.jaeger.library.StatusBarUtil
import com.luminapp.luminsight.R
import com.luminapp.luminsight.databinding.ActivitySplashBinding
import com.luminapp.luminsight.helper.HelperClass
import com.luminapp.luminsight.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    lateinit var binding:ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        main()
    }

    private fun main(){
        HelperClass().hideBar(this)
        StatusBarUtil.setColor(this, ContextCompat.getColor(this, R.color.bg_pink),0)
        binding.tvMulai.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }
    }
}