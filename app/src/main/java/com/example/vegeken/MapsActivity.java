package com.example.vegeken;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private void moveMap(LatLng place){
        CameraPosition cameraPosition = new CameraPosition.Builder().target(place).zoom(17).build();

        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }

    private void setUpMap(){
        LatLng place = new LatLng(22.336191, 114.263601);//move to HKUST
        moveMap(place);
    }

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
        LatLng caritas = new LatLng(22.341483, 114.153187);
        mMap.addMarker(new MarkerOptions().position(caritas).title("Caritas Medical Centre"));
        LatLng kw = new LatLng(22.315187, 114.172416);
        mMap.addMarker(new MarkerOptions().position(kw).title("Kwong Wah Hospital"));
        LatLng nd = new LatLng(22.496748, 114.124646);
        mMap.addMarker(new MarkerOptions().position(nd).title("North District Hospital"));
        LatLng nl = new LatLng(22.282041, 113.939272);
        mMap.addMarker(new MarkerOptions().position(nl).title("North Lantau Hospital"));
        LatLng margaret = new LatLng(22.340958, 114.134718);
        mMap.addMarker(new MarkerOptions().position(margaret).title("Princess Margaret Hospital"));
        LatLng po = new LatLng(22.445426, 114.041905);
        mMap.addMarker(new MarkerOptions().position(po).title("Pok Oi Hospital"));
        LatLng wales = new LatLng(22.379964, 114.201887);
        mMap.addMarker(new MarkerOptions().position(wales).title("Prince of Wales Hospital"));
        LatLng pyn = new LatLng(22.269609, 114.236259);
        mMap.addMarker(new MarkerOptions().position(pyn).title("Pamela Youde Nethersole Eastern Hospital"));
        LatLng elizabeth = new LatLng(22.308906, 114.174628);
        mMap.addMarker(new MarkerOptions().position(elizabeth).title("Queen Elizabeth Hospital"));
        LatLng mary = new LatLng(22.270269, 114.131377);
        mMap.addMarker(new MarkerOptions().position(mary).title("Queen Mary Hospital"));
        LatLng ruttonjee = new LatLng(22.275825, 114.175333);
        mMap.addMarker(new MarkerOptions().position(ruttonjee).title("Ruttonjee Hospital"));
        LatLng john = new LatLng(22.208057, 114.031518);
        mMap.addMarker(new MarkerOptions().position(john).title("St John Hospital"));
        LatLng tm = new LatLng(22.408245, 113.975859);
        mMap.addMarker(new MarkerOptions().position(tm).title("Tuen Mun Hospital"));
        LatLng tsw = new LatLng(22.458482, 113.995833);
        mMap.addMarker(new MarkerOptions().position(tsw).title("Tin Shui Wai Hospital"));
        LatLng uc = new LatLng(22.323373, 114.227027);
        mMap.addMarker(new MarkerOptions().position(uc).title("United Christian Hospital"));
        LatLng yc = new LatLng(22.369718, 114.119595);
        mMap.addMarker(new MarkerOptions().position(yc).title("Yan Chai Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tko_hospital));

//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        setUpMap();

    }
}
