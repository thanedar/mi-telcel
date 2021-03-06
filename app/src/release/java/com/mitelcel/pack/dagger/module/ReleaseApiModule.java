package com.mitelcel.pack.dagger.module;

import com.mitelcel.pack.api.MiApiClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Endpoint;
import retrofit.Endpoints;
import retrofit.RestAdapter;

/**
 * Created by sudhanshu.thanedar on 10/26/2015.
 */
@Module(includes = ApiModule.class)
public class ReleaseApiModule {

    public static String KEY_IS_DEBUG = "key_is_debug";

    @Singleton
    @Provides
    Endpoint provideEndpoint(){
        return Endpoints.newFixedEndpoint(MiApiClient.URL_LIVE);
    }

    @Singleton
    @Provides
    MiApiClient provideMiApiClient(RestAdapter restAdapter){
        restAdapter.setLogLevel(RestAdapter.LogLevel.BASIC);

        return restAdapter.create(MiApiClient.class);
    }

}
