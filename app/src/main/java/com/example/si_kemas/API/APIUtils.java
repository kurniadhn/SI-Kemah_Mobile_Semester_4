package com.example.si_kemas.API;

public class APIUtils {

    private APIUtils(){

    }

    public static final String API_URL = "http://192.168.1.22:8080/";
    public static APIRequestKegiatan getReqKegiatan(){
        return RetrofitClient.getClient(API_URL).create(APIRequestKegiatan.class);
    }

}