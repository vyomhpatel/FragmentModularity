package b12app.vyom.com.multifrag1activitytest.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import b12app.vyom.com.multifrag1activitytest.R;
import b12app.vyom.com.multifrag1activitytest.networkutils.Constants;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductDetailsFragment extends Fragment {

    private static final String TAG ="ProductDetailsFragment" ;
    public static final String RECIPE = "Recipe: ";
    TextView tvProductDesc;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View productDetailsView = inflater.inflate(R.layout.frg_product_details,container,false);

        tvProductDesc = productDetailsView.findViewById(R.id.tvProductDesc);

        return productDetailsView ;
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    public void setTvProductDesc(String desc){
        tvProductDesc.setText(RECIPE +desc);

    }

}
