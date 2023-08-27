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

public class FragmentJaipur extends Fragment {
    public static FragmentJaipur newInstance(){
        return new FragmentJaipur();
    }

    private ImageView imageViewIndia;
    private ProgressBar progressBarIndia;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_india,container,false);

        imageViewIndia=view.findViewById(R.id.imageViewJaysingh);
        progressBarIndia=view.findViewById(R.id.progressBarIndia);

        imageViewIndia.setImageResource(R.drawable.jaipur);
        progressBarIndia.setVisibility(View.INVISIBLE);



        return view;
    }
}