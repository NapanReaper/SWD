package duydtn.testretrofit2.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "http://202.78.227.93:7777/api/";

    @GET("promotions")
    Call<Promotions> getPromotions();

}
