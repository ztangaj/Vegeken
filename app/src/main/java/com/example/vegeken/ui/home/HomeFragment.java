package com.example.vegeken.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.vegeken.HospitalChoosing;
import com.example.vegeken.Info;
import com.example.vegeken.MapsActivity;
import com.example.vegeken.R;
import com.example.vegeken.SOSActivity;

import android.widget.ImageButton;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ImageButton sos_button = null;
    private ImageButton map_button = null;
    private ImageButton hc_button = null;
    private ImageButton info_button = null;

    public class sos_OnClickListener implements View.OnClickListener {
        public void onClick(View view){
            OpenSOSActivity();
        }
    }
    public void OpenSOSActivity(){
//        Intent intent = new Intent(HomeFragment.this.getActivity(),SOSActivity.class);
        Intent intent = new Intent(HomeFragment.this.getActivity(), SOSActivity.class);
        startActivity(intent);
    }

    public class map_OnClickListener implements View.OnClickListener {
        public void onClick(View view){
            OpenMapActivity();
        }
    }
    public void OpenMapActivity(){
        Intent intent = new Intent(HomeFragment.this.getActivity(), MapsActivity.class);
        startActivity(intent);
    }

    public class hc_OnClickListener implements View.OnClickListener {
        public void onClick(View view){
            OpenHCActivity();
        }
    }
    public void OpenHCActivity(){
//        Intent intent = new Intent(HomeFragment.this.getActivity(),SOSActivity.class);
        Intent intent = new Intent(HomeFragment.this.getActivity(), HospitalChoosing.class);
        startActivity(intent);
    }

    public class info_OnClickListener implements View.OnClickListener {
        public void onClick(View view){
            OpenInfoActivity();
        }
    }
    public void OpenInfoActivity(){
//        Intent intent = new Intent(HomeFragment.this.getActivity(),SOSActivity.class);
        Intent intent = new Intent(HomeFragment.this.getActivity(), Info.class);
        startActivity(intent);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        setContentView(R.layout.fragment_home);
//        View view = inflater.inflate(R.layout.fragment_home,null);
        sos_button = (ImageButton) root.findViewById(R.id.imageButton2);
        sos_button.setOnClickListener(new sos_OnClickListener());
        map_button = (ImageButton) root.findViewById(R.id.imageButton3);
        map_button.setOnClickListener(new map_OnClickListener());
        hc_button = (ImageButton) root.findViewById(R.id.imageButton4);
        hc_button.setOnClickListener(new hc_OnClickListener());
        info_button = (ImageButton) root.findViewById(R.id.imageButton);
        info_button.setOnClickListener(new info_OnClickListener());
        return root;
    }
}