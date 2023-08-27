package com.company.informationbook.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.adapters.ViewPageAdapterMuseums;
import com.company.informationbook.adapters.ViewPageAdapterMuseums;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MuseumsActivity extends AppCompatActivity {

    private TabLayout tabLayoutMuseums;
    private ViewPager2 viewPagerMuseums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        tabLayoutMuseums=findViewById(R.id.tabLayoutWonders);
        viewPagerMuseums=findViewById(R.id.viewPagerWonders);

        ViewPageAdapterMuseums adpater= new ViewPageAdapterMuseums(getSupportFragmentManager(),getLifecycle());
        viewPagerMuseums.setAdapter(adpater);

        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayoutMuseums, viewPagerMuseums        , true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){

                    case 0 :
                        tab.setText("Albert Hall");
                        break;

                    case 1 :
                        tab.setText("Anokhi");
                        break;

                    case 2 :
                        tab.setText("Jaisalmer War");
                        break;

                }
            }
        });
        tabLayoutMediator.attach();

    }
}