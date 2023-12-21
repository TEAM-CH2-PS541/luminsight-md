package com.luminapp.luminsight.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ArtikelModel(
    var judul:String,
    var tanggal:String,
    var isi:String,
    var cover:String,
):Parcelable

class InsertArtikel{

    fun dataArtikel():ArrayList<ArtikelModel>{
        val list = ArrayList<ArtikelModel>()
        list.add(ArtikelModel("Tentang Katarak","2023-12-16","Penyakit mata ini cukup sering terjadi di berbagai belahan dunia. Katarak membuat penderitanya seperti memiliki penglihatan berawan. Pasalnya, cahaya yang masuk tidak bisa masuk dengan mudah sehingga membuat penglihatan kabur.\n" +
                "\n" +
                "Penderita katarak akan makin sulit melihat pada malam hari atau cahaya yang minim. Katarak pun terbentuk secara perlahan. Penyakit mata ini tidak menyebabkan rasa nyeri, mata merah, atau jaringan yang rusak.\n" +
                "\n" +
                "Katarak termasuk salah satu penyakit mata yang bisa bisa disembuhkan dengan prosedur pembedahan. Penderitanya bisa mengembalikan penglihatan menjadi normal.","https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2021/06/23030719/Katarak.jpg"))
        list.add(ArtikelModel("Tentang Glaukoma","2023-12-16","Penyakit mata glaukoma juga cukup sering muncul. Penyakit ini bisa menyebabkan gangguan penglihatan hingga kebutaan. Glaukoma merupakan kondisi saat bola mata mengalami peningkatan tekanan akibat adanya timbunan cairan dalam mata.\n" +
                "\n" +
                "Biarpun lebih banyak dialami oleh lansia, penyakit glaukoma juga bisa menyerang siapa saja. Gejala awal dari penyakit ini pun hampir tidak terasa. Penggunaan obat tetes mata dan pembedahan bisa membantu menyembuhkan penyakit mata glaukoma.","https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/01/26092539/X-Jenis-Penyakit-Glaukoma-yang-Perlu-Diketahui.jpg"))
        list.add(ArtikelModel("Tentang Bulging eyes","2023-12-16","\n" +
                "Bulging eyes atau mata yang menonjol adalah kondisi di mana mata seseorang terlihat menonjol keluar dari rongga mata. Ini bisa menjadi gejala dari berbagai masalah kesehatan, termasuk gangguan kelenjar tiroid seperti penyakit Graves, cedera pada mata, infeksi, atau masalah di dalam tengkorak. Penting untuk mencari bantuan medis jika mengalami gejala ini untuk diagnosis dan perawatan yang sesuai.","https://www.msdmanuals.com/-/media/manual/home/images/7/5/g/75_graves_disease_slide_22_springer_high-1.jpg?mw=350&amp;thn=0&amp;sc_lang=en"))
        list.add(ArtikelModel("Tentang Crossed eyes","2023-12-16","\n" +
                "Crossed eyes, atau strabismus, adalah kondisi di mana mata tidak sejajar satu sama lain, membuat mereka melihat ke arah yang berbeda. Kondisi ini dapat disebabkan oleh ketidakseimbangan otot mata atau masalah pada saraf yang mengontrol gerakan mata. Strabismus dapat memengaruhi penglihatan dan dapat memerlukan perawatan seperti kacamata, terapi oklusi, atau pembedahan untuk memulihkan keseimbangan mata dan mencegah gangguan penglihatan lebih lanjut. Jika Anda atau seseorang yang Anda kenal mengalami gejala crossed eyes, segera berkonsultasi dengan dokter mata untuk diagnosis dan perawatan yang tepat.","https://www.eyeqindia.com/wp-content/uploads/2018/08/crossed-eye.png"))
        list.add(ArtikelModel("Tentang Uveitis","2023-12-16","\n" +
                "Uveitis adalah kondisi peradangan pada lapisan tengah mata, yang disebut uvea. Ini dapat mempengaruhi iris, koroid, dan badan siliar. Gejalanya meliputi mata merah, sensitivitas terhadap cahaya, penglihatan kabur, dan nyeri mata. Uveitis dapat disebabkan oleh infeksi, gangguan autoimun, atau trauma mata. Pengobatannya melibatkan perawatan medis oleh dokter mata dengan menggunakan obat antiinflamasi atau kortikosteroid.","https://rsmatapermanasari.com/images/layanan/rs-mata-permana-sari-uveitis-10.jpeg"))
        return list
    }

}