package com.company.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.company.informationbook.fragments.FragmentAlbert;
import com.company.informationbook.fragments.FragmentAnokhi;
import com.company.informationbook.fragments.FragmentJaisalmerWar;
import com.company.informationbook.fragments.FragmentJaisingh;
import com.company.informationbook.fragments.FragmentMahaRajaSurajMal;
import com.company.informationbook.fragments.FragmentMaharanaPartap;
import com.company.informationbook.fragments.FragmentRaoBika;

public class ViewPageAdapterMuseums extends FragmentStateAdapter {
    public ViewPageAdapterMuseums(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPageAdapterMuseums(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPageAdapterMuseums(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0 :
                fragment= FragmentAlbert.newInstance();
                break;
            case 1 :
                fragment= FragmentAnokhi.newInstance();
                break;

            case 2 :
                fragment= FragmentJaisalmerWar.newInstance();
                break;



            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
