package b12app.vyom.com.multifrag1activitytest.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import b12app.vyom.com.multifrag1activitytest.R;
import b12app.vyom.com.multifrag1activitytest.networkutils.Constants;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductImageFragment extends Fragment {

    ImageView productImage;
    String TAG="ProductImageFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View productImageView = inflater.inflate(R.layout.frg_product_image,container,false);

            productImage = productImageView.findViewById(R.id.ivProduct);



        return productImageView;
    }

    public void setTvProductImage(String url){
        Glide.with(getActivity()).load(url).into(productImage);
    }
}
