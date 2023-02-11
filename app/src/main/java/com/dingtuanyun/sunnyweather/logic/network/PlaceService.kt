package com.dingtuanyun.sunnyweather.logic.network

import com.dingtuanyun.sunnyweather.SunnyWheatherApplication
import com.dingtuanyun.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWheatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}