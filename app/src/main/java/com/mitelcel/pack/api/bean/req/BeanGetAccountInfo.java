package com.mitelcel.pack.api.bean.req;

import android.content.Context;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mitelcel.pack.api.bean.BeanGenericApi;
import com.mitelcel.pack.bean.GenericBean;
import com.mitelcel.pack.utils.MiUtils;

/**
 * Created by sudhanshut on 11/3/15.
 */
public class BeanGetAccountInfo extends BeanGenericApi {

    public static final String NAME = "submit_app_info";
    @Expose
    private Params params;

    public BeanGetAccountInfo (Context context) {
        this.id = System.currentTimeMillis();
        this.method = NAME;
        this.params = new Params(context);
    }

    public class Params extends GenericBean {

        @SerializedName("session_id")
        @Expose
        private String sessionId;

        public Params(Context context) {
            this.sessionId = MiUtils.MiAppPreferences.getSessionId(context);
        }
    }
}
