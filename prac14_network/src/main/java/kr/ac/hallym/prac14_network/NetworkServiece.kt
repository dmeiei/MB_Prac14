package kr.ac.hallym.prac14_network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkServiece {
    @GET("/v2/everything")
    fun getList(
        @Query("q") q: String?,
        @Query("apiKey") apiKey: String?,
        @Query("page") page: Long,
        @Query("pageSize") pageSize: Int
    ):Call<PageListModel>

}