package com.example.vegeken;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng tko_hospital = new LatLng(22.318339, 114.269767);
        mMap.addMarker(new MarkerOptions().position(tko_hospital).title("Tseung Kwan O Hospital"));
        LatLng alice = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice).title("Alice Ho Miu Ling Nethersole Hospital"));
        LatLng alice1 = new LatLng(22.341483, 114.153187);
        mMap.addMarker(new MarkerOptions().position(alice1).title("Caritas Medical Centre"));
        LatLng alice2 = new LatLng(22.315187, 114.172416);
        mMap.addMarker(new MarkerOptions().position(alice2).title("Kwong Wah Hospital"));
        LatLng alice3 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice3).title("North District Hospital"));
        LatLng alice4 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice4).title("North Lantau Hospital"));
        LatLng alice5 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice5).title("Princess Margaret Hospital"));
        LatLng alice6 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice6).title("Pok Oi Hospital"));
        LatLng alice7 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice7).title("Prince of Wales Hospital"));
        LatLng alice8 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice8).title("Pamela Youde Nethersole Eastern Hospital"));
        LatLng alice9 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice9).title("Queen Elizabeth Hospital"));
        LatLng alice0 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice0).title("Queen Mary Hospital"));
        LatLng alice11 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice11).title("Ruttonjee Hospital"));
        LatLng alice12 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice12).title("St John Hospital"));
        LatLng alice13 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice13).title("Tuen Mun Hospital"));
        LatLng alice14 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice14).title("Tin Shui Wai Hospital"));
        LatLng alice15 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice15).title("United Christian Hospital"));
        LatLng alice16 = new LatLng(22.458743, 114.174861);
        mMap.addMarker(new MarkerOptions().position(alice16).title("Yan Chai Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tko_hospital));
    }
}
