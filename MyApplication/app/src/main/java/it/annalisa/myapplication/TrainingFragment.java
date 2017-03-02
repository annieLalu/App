package it.annalisa.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Annalisa on 02/03/2017.
 */
public class TrainingFragment extends Fragment {

    String MESSAGE = "Fragment Allenamenti";
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_training, container, false);

        /*TextView textView = (TextView) v.findViewById(R.id.text);
        textView.setText(MESSAGE);*/
        return v;
    }
}
