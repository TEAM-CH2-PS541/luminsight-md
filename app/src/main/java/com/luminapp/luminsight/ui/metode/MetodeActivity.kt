package com.luminapp.luminsight.ui.metode

import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.luminapp.luminsight.R
import com.luminapp.luminsight.databinding.ActivityMetodeBinding
import com.luminapp.luminsight.databinding.PopupPredictBinding
import com.luminapp.luminsight.network.ApiConfig
import com.squareup.picasso.Picasso
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import pl.aprilapps.easyphotopicker.DefaultCallback
import pl.aprilapps.easyphotopicker.EasyImage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File

class MetodeActivity : AppCompatActivity() {

    lateinit var binding:ActivityMetodeBinding
    lateinit var imageFile:File
    var namaFile =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMetodeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        main()
    }

    private fun main(){
        supportActionBar?.hide()
        binding.imgBack.setOnClickListener {
            deletePhoto()
            onBackPressedDispatcher.onBackPressed()
        }
        binding.btnCari.setOnClickListener {
            if (namaFile != ""){
                predict()
            }else{
                Toast.makeText(this@MetodeActivity,"Masukkan gambar terlebih dahulu",Toast.LENGTH_SHORT).show()
            }
        }
        binding.imgAdd.setOnClickListener {
            deletePhoto()
            clear()
            EasyImage.openChooserWithGallery(this,"Pilih Gambar", 1)
        }
    }

    private fun predict() {
        val requestFile = RequestBody.create("multipart/form-data".toMediaTypeOrNull(), imageFile)
        val body = MultipartBody.Part.createFormData("file", namaFile, requestFile)

        val dialog = ProgressDialog.show(this, "Loading ...", "", true)
        ApiConfig.getInstanceRetrofit().predict(body)
            .enqueue(object : Callback<ResponseBody> {
                override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                    dialog.dismiss()
                    if (response.isSuccessful) {
                        if (response.body() != null){
                            val a = response.body()?.string()
                            //deletePhoto()
                            dialogPredict("$a")
                            //Toast.makeText(this@MetodeActivity,a,Toast.LENGTH_SHORT).show()
                        }

                    }
                }

                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    dialog.dismiss()
                    Toast.makeText(this@MetodeActivity,t.message.toString(),Toast.LENGTH_SHORT).show()
                }
            })
    }

    private fun dialogPredict(penyakit:String) {
        val dialog = AlertDialog.Builder(this)
        val layoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = PopupPredictBinding.inflate(layoutInflater)
        dialog.setCancelable(false)
        dialog.setView(view.root)

        val alertDialog = dialog.create()
        //alertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        //val lebar = resources.displayMetrics.widthPixels * 0.80
        //val tinggi = WindowManager.LayoutParams.WRAP_CONTENT

        view.tvDiagnosa.text = penyakit

        view.lyOk.setOnClickListener {
            deletePhoto()
            clear()
            alertDialog.dismiss()
        }

        if (!isFinishing) {
            //show dialog
            alertDialog.show()
            //alertDialog.window?.setLayout(lebar.toInt(),tinggi)
        }
    }

    private fun deletePhoto(){
        if (namaFile != "" ){
            val file = File(imageFile.path)
            if (file.exists()) {
                file.canonicalFile.delete()
                if (file.exists()) {
                    applicationContext.deleteFile(file.name)
                }
            }
        }
    }
    private fun clear(){
        binding.imgAdd.setImageResource(R.drawable.addimage)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        EasyImage.handleActivityResult(requestCode, resultCode, data,
            this,
            object : DefaultCallback() {
                override fun onImagePickerError(e: Exception?, source: EasyImage.ImageSource?,
                                                type: Int) {
                    super.onImagePickerError(e, source, type)
                    Log.d("errorpoto", "" + e!!.message)
                    if (source == EasyImage.ImageSource.CAMERA_IMAGE) {
                        val path = EasyImage.lastlyTakenButCanceledPhoto(this@MetodeActivity)
                        path?.delete()
                    }
                    Toast.makeText(applicationContext, "" + e.message, Toast.LENGTH_SHORT).show()
                }

                override fun onCanceled(source: EasyImage.ImageSource?, type: Int) {
                    super.onCanceled(source, type)
                    if (source == EasyImage.ImageSource.CAMERA_IMAGE) {
                        val path = EasyImage.lastlyTakenButCanceledPhoto(this@MetodeActivity)
                        path?.delete()
                        Toast.makeText(applicationContext, "cancel", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onImagesPicked(
                    imageFiles: MutableList<File>, source: EasyImage.ImageSource?, type: Int) {
                    imageFile = File(imageFiles[0].path)
                    Log.d("pathhh", imageFile.path)
                    namaFile = imageFile.name
                    Picasso.get().load(imageFile).into(binding.imgAdd)
                }
            })
    }
}