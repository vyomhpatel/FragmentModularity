package b12app.vyom.com.multifrag1activitytest.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import b12app.vyom.com.multifrag1activitytest.R;
import b12app.vyom.com.multifrag1activitytest.networkutils.Constants;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductNameFragment extends Fragment {

    TextView tvProductTitle;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View productNameView = inflater.inflate(R.layout.frg_product_name,container,false);
        tvProductTitle = productNameView.findViewById(R.id.tvProductTitle);

        return productNameView;
    }

    public void setTvProductName(String name){
        tvProductTitle.setText(name);
    }
}
