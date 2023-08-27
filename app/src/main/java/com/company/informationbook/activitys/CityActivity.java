package com.company.informationbook.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.adapters.ViewPageAdapterCity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CityActivity extends AppCompatActivity {

    private TabLayout tabLayoutCountries;
    private ViewPager2 viewPagerCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tabLayoutCountries=findViewById(R.id.tabLayoutWonders);
        viewPagerCountries=findViewById(R.id.viewPagerWonders);

        ViewPageAdapterCity adpater=new ViewPageAdapterCity(getSupportFragmentManager(),getLifecycle());
        viewPagerCountries.setAdapter(adpater);

        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayoutCountries, viewPagerCountries        , true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){

                    case 0 :
                        tab.setText("Jaipur");
                        break;

                    case 1 :
                        tab.setText("Udaipur");
                        break;

                    case 2 :
                        tab.setText("Jaisalmer");
                        break;

                    case 3 :
                        tab.setText("Bikaner");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}