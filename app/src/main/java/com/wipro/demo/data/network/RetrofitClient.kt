package com.wipro.demo.data.network


import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory


class RetrofitClient {
    companion object{
        private const val BASE_URL="https://api.stackexchange.com/2.2/"
        private var retrofit:Retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        fun getRetrofitApi():RetrofitApi{
            return retrofit.create(RetrofitApi::class.java)
        }
    }
}