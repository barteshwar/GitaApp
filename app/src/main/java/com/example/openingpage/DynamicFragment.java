package com.example.openingpage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class DynamicFragment extends Fragment {

    View view;
    /*
    public static DynamicFragment newInstance(int val) {
        DynamicFragment fragment = new DynamicFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", val);
        fragment.setArguments(args);
        return fragment;
    }
    */

    public static DynamicFragment newInstance(String val) {
        DynamicFragment fragment = new DynamicFragment();
        Bundle args = new Bundle();
        args.putString("someInt", val);
        fragment.setArguments(args);
        return fragment;
    }
    /*
    int val;
    TextView c;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list, container, false);
        val = getArguments().getInt("someInt", 0);
        c = view.findViewById(R.id.c);
        c.setText("" + val);
        return view;
    }
    */
    String val;
    TextView c;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list, container, false);
        val = getArguments().getString("someInt", "empty");
        c = view.findViewById(R.id.c);
        c.setText(val);
        return view;
    }
}


