package com.geniusvjr.retrofitdemo.data.api;

import com.geniusvjr.retrofitdemo.data.api.response.GetIpInfoResponse;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;


/**
 * Created by dream on 16/5/13.
 */
public interface ApiService {

    /*  @GET("service/getIpInfo.php")
    Call<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);*/

    @GET("service/getIpInfo.php")
    Observable<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);
}
