package com.company.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.company.informationbook.R;

public class FragmentJaisalmerWar extends Fragment {
    public static FragmentJaisalmerWar newInstance(){
        return new FragmentJaisalmerWar();
    }

    private ImageView imageViewIndia;
    private ProgressBar progressBarIndia;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_jaisalmer_war,container,false);

        imageViewIndia=view.findViewById(R.id.imageViewTajMahal);
        progressBarIndia=view.findViewById(R.id.progressBarTajMahal);


        imageViewIndia.setImageResource(R.drawable.jaisalmer);
        progressBarIndia.setVisibility(View.INVISIBLE);



        return view;
    }
}
