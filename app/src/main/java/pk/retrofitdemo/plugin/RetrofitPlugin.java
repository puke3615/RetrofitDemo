package pk.retrofitdemo.plugin;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * @author zijiao
 * @version 2016/2/4
 * @Mark
 */
public class RetrofitPlugin {

    private Retrofit mRetrofit;
    private static final String BASE_URL = "http://www.baidu.com";

    public RetrofitPlugin() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }

}
