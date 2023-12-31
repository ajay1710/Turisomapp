package com.company.informationbook.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.adapters.ViewPageAdapterFamousPlaces;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WondersActivity extends AppCompatActivity {

    private TabLayout tabLayoutWonders;
    private ViewPager2 viewPagerWonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        tabLayoutWonders=findViewById(R.id.tabLayoutWonders);
        viewPagerWonders=findViewById(R.id.viewPagerWonders);

        ViewPageAdapterFamousPlaces adapter=new ViewPageAdapterFamousPlaces(getSupportFragmentManager(),getLifecycle());

        viewPagerWonders.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayoutWonders, viewPagerWonders, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){

                    case 0 :
                        tab.setText("Ram Bagh");
                        break;

                    case 1 :
                        tab.setText("Khatu shyam");
                        break;

                    case 2 :
                        tab.setText("Brahma mandir");
                        break;

                    case 3 :
                        tab.setText("Maharaja Suraj mal");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();


    }
}