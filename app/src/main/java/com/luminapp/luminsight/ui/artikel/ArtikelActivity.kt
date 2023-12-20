package com.luminapp.luminsight.ui.artikel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.luminapp.luminsight.R
import com.luminapp.luminsight.adapter.AdapterArtikel
import com.luminapp.luminsight.databinding.ActivityArtikelBinding
import com.luminapp.luminsight.model.ArtikelModel
import com.luminapp.luminsight.model.InsertArtikel
import com.luminapp.luminsight.ui.artikel.detail.DetailArtikelActivity

class ArtikelActivity : AppCompatActivity() {

    lateinit var binding:ActivityArtikelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtikelBinding.inflate(layoutInflater)
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
        val artikelAdapter = AdapterArtikel()
        val list = InsertArtikel().dataArtikel()
        artikelAdapter.setData(this,list)
        with(binding.rvArtikel){
            this.layoutManager = LinearLayoutManager(this@ArtikelActivity)
            this.adapter = artikelAdapter
        }
    }

    fun gotoDetail(data:ArtikelModel){
        val i = Intent(this,DetailArtikelActivity::class.java)
        i.putExtra(DetailArtikelActivity.DATA,data)
        startActivity(i)
    }
}