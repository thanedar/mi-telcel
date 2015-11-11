package com.mitelcel.pack.api.bean.resp;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by sudhanshut on 11/6/15.
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class BeanLogoutResponse extends BeanGenericResponse {

    @Expose
    private boolean result;

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }}