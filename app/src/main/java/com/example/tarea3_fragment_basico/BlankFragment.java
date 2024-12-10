package com.example.tarea3_fragment_basico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "parametroo1";
    private String parametro1;

    public BlankFragment() {
    }

    public static BlankFragment nuevaInstancia(String parametroo1, String parametroo2) {
        BlankFragment fragmento = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, parametroo1);
        fragmento.setArguments(args);
        return fragmento;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            parametro1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vistaRaiz = inflater.inflate(R.layout.fragment_blank, container, false);
        TextView textView = vistaRaiz.findViewById(R.id.TextView);
        if (parametro1 != null) {
            textView.setText(parametro1);
        }

        return vistaRaiz;
    }
}
