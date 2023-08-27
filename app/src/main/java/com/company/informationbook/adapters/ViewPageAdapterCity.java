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
import com.company.informationbook.fragments.FragmentUdaipur;

public class ViewPageAdapterCity extends FragmentStateAdapter {
    public ViewPageAdapterCity(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPageAdapterCity(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPageAdapterCity(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0 :
                fragment= FragmentJaipur.newInstance();
                break;
            case 1 :
                fragment= FragmentUdaipur.newInstance();
                break;

            case 2 :
                fragment= FragmentJaisalmer.newInstance();
                break;

            case 3 :
                fragment= FragmentBikaner.newInstance();
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
