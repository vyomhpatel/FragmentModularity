package b12app.vyom.com.multifrag1activitytest.networkutils;

import b12app.vyom.com.multifrag1activitytest.model.Food;
import b12app.vyom.com.multifrag1activitytest.model.Product;
import b12app.vyom.com.multifrag1activitytest.model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("fos_food_loc.php?")
    Call<Food>getFoodDetails(@Query("city")String city);


}
