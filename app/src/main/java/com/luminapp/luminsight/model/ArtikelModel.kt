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
        list.add(ArtikelModel("Konjungtivitis","2023-12-16","Penyakit mata ini terjadi akibat adanya peradangan yang membuat mata merah, perih, gatal, dan berair. Konjungtivitis bisa disebabkan oleh alergi atau iritasi pada mata. Namun, bisa juga disebabkan oleh infeksi bakteri yang membuat konjungtiva mengeluarkan nanah.\n" +
                "\n" +
                "Penanganan konjungtivitis bisa menyesuaikan dengan penyebabnya. Konjungtivitis yang disebabkan oleh alergi bisa ditangani dengan menjauhkan dari alergen. Di sisi lain, konjungtivitis karena infeksi perlu diobati dengan obat mata yang tepat, seperti tetes mata atau salep mata antibiotik.","https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2021/06/27101534/Konjungtivitis.jpg"))
        return list
    }

}