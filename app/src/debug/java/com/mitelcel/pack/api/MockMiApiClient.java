package com.mitelcel.pack.api;

import android.content.SharedPreferences;

import com.mitelcel.pack.FakeData;
import com.mitelcel.pack.bean.api.request.BeanConfirmPin;
import com.mitelcel.pack.bean.api.request.BeanDeleteFrequentNumber;
import com.mitelcel.pack.bean.api.request.BeanGetAccountInfo;
import com.mitelcel.pack.bean.api.request.BeanGetCurrentBalance;
import com.mitelcel.pack.bean.api.request.BeanGetFrequentNumbers;
import com.mitelcel.pack.bean.api.request.BeanGetOfferList;
import com.mitelcel.pack.bean.api.request.BeanGetRecentActivity;
import com.mitelcel.pack.bean.api.request.BeanGetServiceList;
import com.mitelcel.pack.bean.api.request.BeanLogin;
import com.mitelcel.pack.bean.api.request.BeanLogout;
import com.mitelcel.pack.bean.api.request.BeanRechargeAccount;
import com.mitelcel.pack.bean.api.request.BeanRequestPin;
import com.mitelcel.pack.bean.api.request.BeanSetFrequentNumber;
import com.mitelcel.pack.bean.api.request.BeanSubmitAppInfo;
import com.mitelcel.pack.bean.api.request.BeanTransferBalance;
import com.mitelcel.pack.bean.api.request.BeanUpdateUserInfo;
import com.mitelcel.pack.bean.api.response.BeanConfirmPinResponse;
import com.mitelcel.pack.bean.api.response.BeanDeleteFrequentNumberResponse;
import com.mitelcel.pack.bean.api.response.BeanGetAccountInfoResponse;
import com.mitelcel.pack.bean.api.response.BeanGetCurrentBalanceResponse;
import com.mitelcel.pack.bean.api.response.BeanGetFrequentNumbersResponse;
import com.mitelcel.pack.bean.api.response.BeanGetOfferListResponse;
import com.mitelcel.pack.bean.api.response.BeanGetRecentActivityResponse;
import com.mitelcel.pack.bean.api.response.BeanGetServiceListResponse;
import com.mitelcel.pack.bean.api.response.BeanLoginResponse;
import com.mitelcel.pack.bean.api.response.BeanLogoutResponse;
import com.mitelcel.pack.bean.api.response.BeanRechargeAccountResponse;
import com.mitelcel.pack.bean.api.response.BeanRequestPinResponse;
import com.mitelcel.pack.bean.api.response.BeanSetFrequentNumberResponse;
import com.mitelcel.pack.bean.api.response.BeanSubmitAppInfoResponse;

import com.google.gson.Gson;
import com.mitelcel.pack.bean.api.response.BeanTransferBalanceResponse;
import com.mitelcel.pack.bean.api.response.BeanUpdateUserInfoResponse;

import java.util.Collections;

import javax.inject.Inject;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.mime.TypedByteArray;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by sudhanshu.thanedar on 10/26/2015.
 */
public class MockMiApiClient implements MiApiClient {

    @Inject
    public MockMiApiClient(){}

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    public void confirm_pin(@Body BeanConfirmPin beanInput, Callback<BeanConfirmPinResponse> callback) {
        BeanConfirmPinResponse beanResponse = new Gson().fromJson(FakeData.RESP_LOGOUT, BeanConfirmPinResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_LOGOUT.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void delete_frequent_number(@Body BeanDeleteFrequentNumber beanInput, Callback<BeanDeleteFrequentNumberResponse> callback) {
        BeanDeleteFrequentNumberResponse beanResponse = new Gson().fromJson(FakeData.RESP_LOGOUT, BeanDeleteFrequentNumberResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_LOGOUT.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void get_account_info(@Body BeanGetAccountInfo beanInput, Callback<BeanGetAccountInfoResponse> callback) {
        BeanGetAccountInfoResponse beanResponse = new Gson().fromJson(FakeData.RESP_GET_ACCOUNT_INFO, BeanGetAccountInfoResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_GET_ACCOUNT_INFO.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void get_current_balance(@Body BeanGetCurrentBalance beanInput, Callback<BeanGetCurrentBalanceResponse> callback) {
        BeanGetCurrentBalanceResponse beanResponse = new Gson().fromJson(FakeData.RESP_CURRENT_BALANCE, BeanGetCurrentBalanceResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_CURRENT_BALANCE.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void get_frequent_numbers(@Body BeanGetFrequentNumbers beanInput, Callback<BeanGetFrequentNumbersResponse> callback) {
        BeanGetFrequentNumbersResponse beanResponse = new Gson().fromJson(FakeData.RESP_GET_FREQUENT_NUMBERS, BeanGetFrequentNumbersResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_GET_FREQUENT_NUMBERS.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public BeanGetOfferListResponse get_offer_list_async(@Body BeanGetOfferList beanInput) {
        BeanGetOfferListResponse beanResponse = new Gson().fromJson(FakeData.RESP_GET_OFFER_LIST, BeanGetOfferListResponse.class);
        return beanResponse;
    }

    @Override
    public void get_offer_list(@Body BeanGetOfferList beanInput, Callback<BeanGetOfferListResponse> callback) {
        BeanGetOfferListResponse beanResponse = new Gson().fromJson(FakeData.RESP_GET_OFFER_LIST, BeanGetOfferListResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_GET_OFFER_LIST.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void get_recent_activity(@Body BeanGetRecentActivity beanInput, Callback<BeanGetRecentActivityResponse> callback) {
        BeanGetRecentActivityResponse beanResponse = new Gson().fromJson(FakeData.RESP_GET_RECENT_ACTIVITY, BeanGetRecentActivityResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_GET_RECENT_ACTIVITY.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void get_service_list(@Body BeanGetServiceList beanInput, Callback<BeanGetServiceListResponse> callback) {
        BeanGetServiceListResponse beanResponse = new Gson().fromJson(FakeData.RESP_GET_OFFER_LIST, BeanGetServiceListResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_GET_OFFER_LIST.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void login(@Body BeanLogin beanInput, Callback<BeanLoginResponse> callback) {
        BeanLoginResponse beanResponse = new Gson().fromJson(FakeData.RESP_LOGIN, BeanLoginResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_LOGIN.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void logout(@Body BeanLogout beanInput, Callback<BeanLogoutResponse> callback) {
        BeanLogoutResponse beanResponse = new Gson().fromJson(FakeData.RESP_LOGOUT, BeanLogoutResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_LOGOUT.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void recharge_account(@Body BeanRechargeAccount beanInput, Callback<BeanRechargeAccountResponse> callback) {
        BeanRechargeAccountResponse beanResponse  = new Gson().fromJson(FakeData.RESP_RECHARGE_ACCOUNT, BeanRechargeAccountResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_RECHARGE_ACCOUNT.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void request_pin(@Body BeanRequestPin beanInput, Callback<BeanRequestPinResponse> callback) {
        BeanRequestPinResponse beanResponse = new Gson().fromJson(FakeData.RESP_LOGOUT, BeanRequestPinResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_LOGOUT.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void set_frequent_number(@Body BeanSetFrequentNumber beanInput, Callback<BeanSetFrequentNumberResponse> callback) {
        BeanSetFrequentNumberResponse beanResponse = new Gson().fromJson(FakeData.RESP_LOGOUT, BeanSetFrequentNumberResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_LOGOUT.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void submit_app_info(@Body BeanSubmitAppInfo beanInput, Callback<BeanSubmitAppInfoResponse> callback) {
        BeanSubmitAppInfoResponse beanResponse = new Gson().fromJson(FakeData.RESP_SUBMIT_APP_INFO, BeanSubmitAppInfoResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_SUBMIT_APP_INFO.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void transfer_balance(@Body BeanTransferBalance beanInput, Callback<BeanTransferBalanceResponse> callback) {
        BeanTransferBalanceResponse beanResponse = new Gson().fromJson(FakeData.RESP_RECHARGE_ACCOUNT, BeanTransferBalanceResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_RECHARGE_ACCOUNT.getBytes()));
        callback.success(beanResponse, response);
    }

    @Override
    public void update_user_info(@Body BeanUpdateUserInfo beanInput, Callback<BeanUpdateUserInfoResponse> callback) {
        BeanUpdateUserInfoResponse beanResponse = new Gson().fromJson(FakeData.RESP_RECHARGE_ACCOUNT, BeanUpdateUserInfoResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_RECHARGE_ACCOUNT.getBytes()));
        callback.success(beanResponse, response);
    }

    /*@Override
    public void authenticate(@Body BeanAuthenticate beanAuthenticate, Callback<BeanAuthenticateResponse> callback) {
        BeanAuthenticateResponse beanAuthenticateResponse = new Gson().fromJson(FakeData.RESP_AUTHENTICATE, BeanAuthenticateResponse.class);
        Response response = new Response("http://fake", 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json",FakeData.RESP_AUTHENTICATE.getBytes()));
        callback.success(beanAuthenticateResponse, response);
    }*/

    @Override
    public Observable<BeanSubmitAppInfoResponse> submit_app_info(@Body BeanSubmitAppInfo beanInput) {
        return Observable.create(new Observable.OnSubscribe<BeanSubmitAppInfoResponse>() {
            @Override
            public void call(Subscriber<? super BeanSubmitAppInfoResponse> subscriber) {
                BeanSubmitAppInfoResponse beanResponse = new Gson().fromJson(FakeData.RESP_SUBMIT_APP_INFO, BeanSubmitAppInfoResponse.class);
                subscriber.onNext(beanResponse);
                subscriber.onCompleted();
            }
        });
    }

    @Override
    public Observable<BeanGetCurrentBalanceResponse> get_current_balance(@Body BeanGetCurrentBalance beanInput) {
        return Observable.create(new Observable.OnSubscribe<BeanGetCurrentBalanceResponse>() {
            @Override
            public void call(Subscriber<? super BeanGetCurrentBalanceResponse> subscriber) {
                BeanGetCurrentBalanceResponse beanResponse = new Gson().fromJson(FakeData.RESP_CURRENT_BALANCE, BeanGetCurrentBalanceResponse.class);
                subscriber.onNext(beanResponse);
                subscriber.onCompleted();
            }
        });
    }

    /*@Override
    public Observable<BeanAuthenticateResponse> authenticate(@Body BeanAuthenticate beanAuthenticate) {
        return Observable.create(new Observable.OnSubscribe<BeanAuthenticateResponse>() {
            @Override
            public void call(Subscriber<? super BeanAuthenticateResponse> subscriber) {
                BeanAuthenticateResponse beanAuthenticateResponse = new Gson().fromJson(FakeData.RESP_AUTHENTICATE, BeanAuthenticateResponse.class);
                subscriber.onNext(beanAuthenticateResponse);
                subscriber.onCompleted();
            }
        });
    }*/

}
