package com.mitelcel.pack.bean.api.response;

import com.google.gson.annotations.Expose;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by sudhanshut on 11/6/15.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BeanRequestPinResponse extends BeanGenericResponse {

    @Expose
    private boolean result;

    @Override
    public String toString() {
        return super.toString();
    }
}
