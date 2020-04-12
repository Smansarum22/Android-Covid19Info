package id.ac.unhas.infocovid19.network

import id.ac.unhas.infocovid19.model.DataHarian
import id.ac.unhas.infocovid19.model.DataProvinsi
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndPoint {
    //base URL + value = https://indonesia-covid-19.mathdro.id/api/provinsi
    @GET("provinsi")
    fun getDataProvinsi() : Call<DataProvinsi>
    @GET("harian")
    fun getDataHarian() : Call<DataHarian>
}