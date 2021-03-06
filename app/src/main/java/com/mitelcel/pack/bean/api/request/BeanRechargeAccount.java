package com.mitelcel.pack.bean.api.request;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mitelcel.pack.bean.GenericBean;
import com.mitelcel.pack.utils.MiUtils;

/**
 * Created by sudhanshu.thanedar on 11/17/15.
 */
public class BeanRechargeAccount extends BeanGenericApi {

    public static final String NAME = "recharge_account";
    @Expose
    private Params params;

    public BeanRechargeAccount(float amount) {
        this.id = System.currentTimeMillis();
        this.method = NAME;
        this.params = new Params(amount);
    }

    public BeanRechargeAccount(float amount, String password) {
        this.id = System.currentTimeMillis();
        this.method = NAME;
        this.params = new Params(amount, password);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public class Params extends GenericBean {

        @Expose
        private float amount;

        @SerializedName("app_token")
        @Expose
        private String appToken;

        @SerializedName("session_id")
        @Expose
        private String sessionId;

        @Expose
        private BeanCredentials credentials;

        public Params(float amount) {
            this.amount = amount;
            this.appToken = MiUtils.MiAppPreferences.getToken();
            this.sessionId = MiUtils.MiAppPreferences.getSessionId();

            this.credentials = new BeanCredentials();
        }

        public Params(float amount, String password) {
            this.amount = amount;
            this.appToken = MiUtils.MiAppPreferences.getToken();
            this.sessionId = MiUtils.MiAppPreferences.getSessionId();

            String msisdn = MiUtils.MiAppPreferences.getMsisdn();
            this.credentials = new BeanCredentials(msisdn, password);
        }
    }
}
