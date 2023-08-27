package com.company.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.company.informationbook.fragments.FragmentBikaner;
import com.company.informationbook.fragments.FragmentJaipur;
import com.company.informationbook.fragments.FragmentJaisalmer;
import com.company.informationbook.fragments.FragmentJaisingh;
import com.company.informationbook.fragments.FragmentMahaRajaSurajMal;
import com.company.informationbook.fragments.FragmentMaharanaPartap;
import com.company.informationbook.fragments.FragmentRaoBika;
import com.company.informationbook.fragments.FragmentUdaipur;

public class ViewPageAdapterLeaders extends FragmentStateAdapter {
    public ViewPageAdapterLeaders(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPageAdapterLeaders(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPageAdapterLeaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0 :
                fragment= FragmentJaisingh.newInstance();
                break;
            case 1 :
                fragment= FragmentMaharanaPartap.newInstance();
                break;

            case 2 :
                fragment= FragmentRaoBika.newInstance();
                break;

            case 3 :
                fragment= FragmentMahaRajaSurajMal.newInstance();
                break;


            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
