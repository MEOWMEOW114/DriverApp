package com.easydeliver.driverapp.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.afollestad.materialdialogs.MaterialDialog;
import com.easydeliver.driverapp.App;

/**
 * Created by tomlee on 30/11/15.
 */
public class BaseFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        App application = (App) getActivity().getApplication();


        progressDialog = showIndeterminateProgressDialog(false);
    }


    protected MaterialDialog progressDialog;

    private MaterialDialog showIndeterminateProgressDialog(boolean horizontal) {
        return  new MaterialDialog.Builder(getActivity())
//                .title(R.string.progress_dialog)
                .content("Please Wait")
                .progress(true, 0)
                .cancelable(false)
                .progressIndeterminateStyle(horizontal)
                .build();
    }


}
