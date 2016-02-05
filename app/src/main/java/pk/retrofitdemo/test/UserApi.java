package pk.retrofitdemo.test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author wzj
 * @version 2015/11/19
 * @Mark
 */
public interface UserApi {

    @GET("/homelifeinterface/product/getProducts.do")
    Call<Entity> testRequest(@Query("username") String u, @Query("password") String p);

}
