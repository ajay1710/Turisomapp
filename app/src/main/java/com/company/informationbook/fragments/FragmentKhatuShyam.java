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

public class FragmentKhatuShyam extends Fragment {
    public static FragmentKhatuShyam newInstance(){
        return new FragmentKhatuShyam();
    }

    private ImageView imageViewTajMahal;
    private ProgressBar progressBarTajMahal;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_khatu_shyam,container,false);

        imageViewTajMahal=view.findViewById(R.id.imageViewTajMahal);
        progressBarTajMahal=view.findViewById(R.id.progressBarTajMahal);

        imageViewTajMahal.setImageResource(R.drawable.khatu);
        progressBarTajMahal.setVisibility(View.INVISIBLE);



        return view;
    }
}
