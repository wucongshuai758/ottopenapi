package com.youku.ott.openapi.sdk.util;

import okhttp3.*;
import okhttp3.OkHttpClient.Builder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * http工具
 *
 * @author 吴聪帅 2019年10月21日 上午9:58:30
 */
@SuppressWarnings("Duplicates")
public class HttpUtil {
    private static final OkHttpClient okHttpClient = new Builder().connectionPool(new ConnectionPool(5, 5, TimeUnit.MINUTES)).addNetworkInterceptor(
        chain -> {
            chain.connection().socket().setKeepAlive(true);
            return chain.proceed(chain.request());
        }).connectTimeout(10,TimeUnit.SECONDS).readTimeout(20, TimeUnit.SECONDS).build();


    public static String doOkHttpPostJson(String serverUrl,String json) throws IOException {


        //MediaType  设置Content-Type 标头中包含的媒体类型值
        RequestBody requestBody = FormBody.create(MediaType.parse("application/json; charset=utf-8")
            , json);

        Request request = new Request.Builder()
            .url(serverUrl)//请求的url
            .post(requestBody)
            .build();

        //创建/Call
        Response response = okHttpClient.newCall(request).execute();


        if (response.isSuccessful()) {
            if (response.code() == 200 || response.code() == 201) {
                String resp = response.body().string();
                return resp;
            }
        }
        return null;
    }
}
