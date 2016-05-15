package com.geniusvjr.rxjavaretrofit.http;

import com.geniusvjr.rxjavaretrofit.entity.HttpResult;
import com.geniusvjr.rxjavaretrofit.entity.Subject;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by dream on 16/5/15.
 */
public interface MovieService {

    @GET("top250")
    Observable<HttpResult<List<Subject>>> getTopMovie(@Query("start") int start, @Query("count") int count);

}

