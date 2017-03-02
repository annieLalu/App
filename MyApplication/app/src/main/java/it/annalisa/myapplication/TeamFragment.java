package it.annalisa.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/**
 * Created by Annalisa on 24/02/2017.
 */
public class TeamFragment extends Fragment {
    boolean hiddenlayout = false;
    boolean hiddenlayout2 = false;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_team,container, false);

        final ImageButton btnhide = (ImageButton) v.findViewById(R.id.btnhide);
        final ImageButton btnhide2 = (ImageButton) v.findViewById(R.id.btnhide2);
        final RelativeLayout layout_to_hide = (RelativeLayout) v.findViewById(R.id.field_layout);
        final View view = v.findViewById(R.id.teamlist);

        btnhide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!hiddenlayout){
                    layout_to_hide.setVisibility(View.GONE);
                    btnhide.setImageResource(R.mipmap.ic_keyboard_arrow_down_black_24dp);
                    hiddenlayout = true;
                }
                else{
                    layout_to_hide.setVisibility(View.VISIBLE);
                    btnhide.setImageResource(R.mipmap.ic_keyboard_arrow_up_black_24dp);
                    hiddenlayout = false;
                }

            }
        });
        btnhide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!hiddenlayout2){
                    //layout_to_hide.setVisibility(View.GONE);
                    view.setVisibility(View.GONE);
                    btnhide2.setImageResource(R.mipmap.ic_keyboard_arrow_down_black_24dp);
                    hiddenlayout2 = true;
                }
                else{
                    //layout_to_hide.setVisibility(View.VISIBLE);
                    view.setVisibility(View.VISIBLE);
                    btnhide2.setImageResource(R.mipmap.ic_keyboard_arrow_up_black_24dp);
                    hiddenlayout2 = false;
                }

            }
        });
        return v;
    }

}

