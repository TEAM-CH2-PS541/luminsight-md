package com.luminapp.luminsight.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.luminapp.luminsight.databinding.RowArtikelBinding
import com.luminapp.luminsight.helper.HelperClass
import com.luminapp.luminsight.model.ArtikelModel
import com.luminapp.luminsight.ui.artikel.ArtikelActivity
import com.squareup.picasso.Picasso

class AdapterArtikel: RecyclerView.Adapter<AdapterArtikel.Holder>() {

    lateinit var list:ArrayList<ArtikelModel>
    lateinit var context: Context

    fun setData(context: Context,list:ArrayList<ArtikelModel>){
        this.list = list
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = RowArtikelBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list[position])
    }

    inner class Holder(private val binding:RowArtikelBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data:ArtikelModel){
            binding.tvJudul.text = data.judul
            binding.tvTanggal.text = HelperClass().convertDate(data.tanggal)
            Picasso.get().load(data.cover).into(binding.imgCover)
            binding.root.setOnClickListener {
                (context as ArtikelActivity).gotoDetail(data)
            }
        }
    }
}