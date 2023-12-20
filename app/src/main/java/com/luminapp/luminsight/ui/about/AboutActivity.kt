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
        val a = "LuminSight: Eye Disease Detection App addresses health concerns with a focus on early detection in the diagnosis of eye diseases. Access to specialized eye care is often limited, especially in underserved areas, making it important to provide innovative solutions. Our project focuses on creating an easy-to-use mobile application that utilizes a camera or uploaded images to facilitate early detection of common eye conditions.\n" +
                "\n" +
                "Through image analysis, LuminSight aims to identify eye diseases such as Blemishes, Pimples, Cataracts, and more and alert users to seek immediate solutions and further treatment. Our team is highly motivated by the desire to use technology to address pressing health challenges. Eye diseases disproportionately affect vulnerable populations, and we believe that accessible early detection tools can make a huge impact in preventing various eye diseases.\n" +
                "\n" +
                "LuminSight is our commitment to utilizing our technical skills to create solutions that can make a positive impact on eye health, ensuring that individuals at risk of developing eye diseases before it's too late get the timely care they need."
        binding.tvAbout.text = a
    }
}