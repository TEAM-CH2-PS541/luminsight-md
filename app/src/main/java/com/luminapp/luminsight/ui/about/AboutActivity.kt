package com.luminapp.luminsight.ui.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luminapp.luminsight.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding:ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        main()
    }

    private fun main(){
        supportActionBar?.hide()
        binding.imgBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        setData()
    }

    private fun setData(){
        val a = "LuminSight, an application produced by our Capstone team, TEAM-CH2-PS541, is an innovative solution for early detection of various eye conditions. With a focus on eye health, LuminSight makes it easy for Android users to detect diseases such as bulging eyes, cataract, crossed eyes, glaucoma, uveitis, and normal eye conditions.\n" +
                "\n" +
                "The app offers an intuitive experience by leveraging advanced camera technology on Android devices to take detailed images of the eye or retrieve existing images. With its multi-detection feature, LuminSight allows users to monitor their eye conditions comprehensively on one platform. The high analysis speed provides accurate results, while the user-friendly interface makes it easy for everyone to use.\n" +
                "\n" +
                "LuminSight is not just an application, but also a loyal partner in caring for your eye health. With the latest technology and our commitment to user welfare, LuminSight is here as a reliable friend to keep your vision optimal."
        binding.tvAbout.text = a
    }
}