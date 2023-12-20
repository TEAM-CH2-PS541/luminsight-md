package com.luminapp.luminsight.ui.artikel.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luminapp.luminsight.R
import com.luminapp.luminsight.databinding.ActivityDetailArtikelBinding
import com.luminapp.luminsight.helper.HelperClass
import com.luminapp.luminsight.model.ArtikelModel
import com.squareup.picasso.Picasso

class DetailArtikelActivity : AppCompatActivity() {

    companion object{
        const val DATA = "data"
    }
    lateinit var binding:ActivityDetailArtikelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailArtikelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        main()
    }

    private fun main(){
        supportActionBar?.hide()
        intent.getParcelableExtra<ArtikelModel>(DATA).let {
            binding.tvJudul.text = it?.judul
            binding.tvIsi.text = it?.isi
            binding.tvTanggal.text = HelperClass().convertDate(it?.tanggal?:"")
            Picasso.get().load(it?.cover).into(binding.imgCover)
        }
        binding.imgBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}