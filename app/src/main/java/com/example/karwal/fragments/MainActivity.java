package com.example.karwal.fragments;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Fragment_foo.onSelectedListner {
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.place_holder,new Fragment_foo());
        ft.commit();

    }

    @Override
    public void onClicked(int value) {
        if(value==1){
            ft=getFragmentManager().beginTransaction();
            ft.replace(R.id.place_holder,new Fragment_boo());
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }

    }
}
