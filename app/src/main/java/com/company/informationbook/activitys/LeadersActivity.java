package com.company.informationbook.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.adapters.ViewPageAdapterLeaders;
import com.company.informationbook.adapters.ViewPageAdapterLeaders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LeadersActivity extends AppCompatActivity {

    private TabLayout tabLayoutLeaders;
    private ViewPager2 viewPagerLeaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);

        tabLayoutLeaders=findViewById(R.id.tabLayoutWonders);
        viewPagerLeaders=findViewById(R.id.viewPagerWonders);

        ViewPageAdapterLeaders adpater= new ViewPageAdapterLeaders(getSupportFragmentManager(),getLifecycle());
        viewPagerLeaders.setAdapter(adpater);

        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayoutLeaders, viewPagerLeaders        , true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){

                    case 0 :
                        tab.setText("sawai jai singh");
                        break;

                    case 1 :
                        tab.setText("maharana pratap");
                        break;

                    case 2 :
                        tab.setText("Rao Bika");
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