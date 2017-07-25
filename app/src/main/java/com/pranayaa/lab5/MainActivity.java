package com.pranayaa.lab5;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = new ExchangeRateListFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

    }
}
