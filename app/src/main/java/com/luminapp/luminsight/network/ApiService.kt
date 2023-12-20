package com.luminapp.luminsight.network

import com.luminapp.luminsight.helper.Config
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {

    @Multipart
    @POST(Config.PREDICT)
    fun predict(
        @Part photo: MultipartBody.Part
    ): Call<ResponseBody>
}