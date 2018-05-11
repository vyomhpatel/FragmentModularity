package b12app.vyom.com.multifrag1activitytest.activities;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import b12app.vyom.com.multifrag1activitytest.R;
import b12app.vyom.com.multifrag1activitytest.fragments.ProductDetailsFragment;
import b12app.vyom.com.multifrag1activitytest.fragments.ProductImageFragment;
import b12app.vyom.com.multifrag1activitytest.fragments.ProductNameFragment;
import b12app.vyom.com.multifrag1activitytest.model.Food;
import b12app.vyom.com.multifrag1activitytest.model.Product;
import b12app.vyom.com.multifrag1activitytest.model.User;
import b12app.vyom.com.multifrag1activitytest.networkutils.ApiService;
import b12app.vyom.com.multifrag1activitytest.networkutils.RetrofitInstance;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContainerActivity extends AppCompatActivity {


    private static final String TAG = "container tag" ;


    private ApiService apiService;
    private Food food;
    private Food.FoodBean foodBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        ButterKnife.bind(this);
        
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.INTERNET)!= PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.INTERNET,},1);
        } else{

            apiService = RetrofitInstance.getRetrofitInstance().create(ApiService.class);
            getFoodDetails();

        }
    }

    private void getFoodDetails() {

       apiService.getFoodDetails("delhi").enqueue(new Callback<Food>() {
           @Override
           public void onResponse(Call<Food> call, Response<Food> response) {

               food = response.body();
               foodBean = food.getFood().get(0);
               Log.i(TAG, "onResponse: "+foodBean.getFoodName());
               if(food.getFood().size()>0) {
                   initFragments(foodBean);
               }
           }

           @Override
           public void onFailure(Call<Food> call, Throwable t) {

           }
       });


    }

    private void initFragments(Food.FoodBean foodBean) {

        FragmentManager fragmentManager = getSupportFragmentManager();

        //initializing frame 1:
        ProductNameFragment productNameFragment = (ProductNameFragment) getSupportFragmentManager().findFragmentById(R.id.fragName);
        productNameFragment.setTvProductName(foodBean.getFoodName());
        Log.i(TAG, "initFragments: "+foodBean.getFoodName());
        //initializing frame 2:
        ProductDetailsFragment productDetailsFragment = (ProductDetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragDesc);
        productDetailsFragment.setTvProductDesc(foodBean.getFoodRecepiee());

        //initializing frame 3:
        ProductImageFragment productImageFragment = (ProductImageFragment) getSupportFragmentManager().findFragmentById(R.id.fragImage);
        productImageFragment.setTvProductImage(foodBean.getFoodThumb());

    }
}
