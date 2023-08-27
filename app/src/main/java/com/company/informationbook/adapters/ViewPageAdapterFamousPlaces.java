package com.company.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.company.informationbook.fragments.FragmentAlbert;
import com.company.informationbook.fragments.FragmentAnokhi;
import com.company.informationbook.fragments.FragmentBrahmaMandir;
import com.company.informationbook.fragments.FragmentJaisalmerWar;
import com.company.informationbook.fragments.FragmentJaisingh;
import com.company.informationbook.fragments.FragmentKhatuShyam;
import com.company.informationbook.fragments.FragmentRamBagh;

public class ViewPageAdapterFamousPlaces extends FragmentStateAdapter {
    public ViewPageAdapterFamousPlaces(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPageAdapterFamousPlaces(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPageAdapterFamousPlaces(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0 :
                fragment= FragmentRamBagh.newInstance();
                break;
            case 1 :
                fragment= FragmentKhatuShyam.newInstance();
                break;


            case 2 :
                fragment= FragmentBrahmaMandir.newInstance();
                break;

            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3 ;
    }
}
