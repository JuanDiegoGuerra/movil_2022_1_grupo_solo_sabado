package com.cibertec.proyecto.service;

import com.cibertec.proyecto.entity.Editorial;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface ServiceEditorial {

    @POST("editorial")
    public abstract Call<Editorial> registraEditorial(@Body Editorial obj);

}
