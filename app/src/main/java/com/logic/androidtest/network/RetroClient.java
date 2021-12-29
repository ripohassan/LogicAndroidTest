package com.logic.androidtest.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class RetroClient {
    public static Retrofit retrofit = null;

    public static Retrofit getClient(String bsURL) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(bsURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        } else {
            if (!retrofit.baseUrl().equals(bsURL)) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(bsURL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
        }
        return retrofit;
    }

    private static Retrofit anotherRetrofit = null;

    public static Retrofit getAnotherClient(String baseUrl) {
        if (anotherRetrofit == null) {
            anotherRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return anotherRetrofit;
    }
    private static Retrofit rssRetrofit = null;

    public static Retrofit getRssClient(String baseUrl) {
        if (rssRetrofit == null) {
            rssRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(SimpleXmlConverterFactory.create())
                    .build();
        }
        return rssRetrofit;
    }
}
