package com.example.jacek.lifill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.jacek.lifill.Data.Place;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    private Place currentLocation;
    private Integer counter;

    @BindView(R.id.tv_location)
    protected TextView locationTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.bt_test)
    protected void locationProvider() {
        if (counter == null) {
            counter = 0;
        } else {
            counter++;
        }
        Place[] allLocations = Place.values();

        if (counter>=allLocations.length) {
            counter=0;}
        onChangeLocation(allLocations[counter]);
    }



    protected void onChangeLocation (Place sensorInfo){
        if (sensorInfo==null){
            Log.e("Location", "no location data received");
            // TODO function to check if user leaved home (check wifi or gps info)
        }

        if (sensorInfo.equals(currentLocation)){
            Log.e("Location", "received sensor info match current location " + sensorInfo );
            return;
        }

        currentLocation = sensorInfo;
        locationTv.setText(currentLocation.toString());


//        switch (sensorInfo) {
//            case Bathroom:
//                //code
//                break;
//            case Hall:
//                //code
//                break;
//            case Garage:
//                //code
//                break;
//            case Kithen:
//                //code
//                break;
//            case Toilet:
//                //code
//                break;
//            case Bedroom:
//                //code
//                break;
//            case LivingRoom:
//                //code
//                break;
//            default:
//                //code
//        }


    }
}
