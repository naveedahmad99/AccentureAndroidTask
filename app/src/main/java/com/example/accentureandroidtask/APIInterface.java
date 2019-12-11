package com.example.accentureandroidtask;

import com.example.accentureandroidtask.pojo.WeatherDataResponse;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by Mahmoud Zahran on 10/12/2019.
 */
public interface APIInterface {
    @GET(ApiUrls.API_FEEDS_URL)
    Observable<WeatherDataResponse> getApiData();

    @POST(".")
    Observable<String> getApiDataPost();
}