package com.example.karwal.fragments;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_foo extends Fragment {

    onSelectedListner mListner;

    static  interface onSelectedListner{
         void onClicked(int value);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mListner=(onSelectedListner)context;
    }

    public Fragment_foo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_foo, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        Button btn=(Button)view.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mListner!=null){
                    mListner.onClicked(1);
                }
            }
        });
    }





}
