package com.example.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Deskripsi extends Fragment {
    private TextView textView;

    public Deskripsi() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_desc, container, false);
        textView = view.findViewById(R.id.desc);
        textView.setText("Perusahaan Produksi : Soraya Intercine Films \nKararakter : Wawan, Johan, Victor, Vina, Alfa, Jasmine's Mother, Angel, LAINNYA \nSutradara: Raditya Dika");

        return view;
    }
}
