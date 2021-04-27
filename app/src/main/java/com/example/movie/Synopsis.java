package com.example.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Synopsis extends Fragment {
    private TextView textView;

    public Synopsis() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_synopsis, container, false);
        textView = view.findViewById(R.id.sys);
        textView.setText("Ebi dikisahkan sebagai pria naif berusia 27 tahun yang belum memiliki pekerjaan tetap. Ia pun masih bergantung pada ibunya. Untuk mengisi waktu luangnya, Ebi kerap mengisi acara stand up comedy. Sikap Ebi ini sangat berbeda jauh dengan adiknya, Alva (Frederik Alexander).\n" +
                "\n" +
                "Alva memiliki pencapaian hidup yang jauh lebih sukses dibanding Ebi. Bahkan, Alva akan melompati Ebi untuk menikah dengan pujaan hatinya. Di sisi lain, Ebi justru belum pernah pacaran dengan seorang wanita pun dalam hidupnya. Hal ini disebabkan karena Ebi kurang percaya diri saat berbicara dengan wanita.");

        return view;
    }
}

