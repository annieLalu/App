package it.annalisa.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

/**
 * Created by Annalisa on 24/02/2017.
 */
public class ProfileFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_profile, container,false);


        return v;
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        //add item
        super.onPrepareOptionsMenu(menu);
    }
}
