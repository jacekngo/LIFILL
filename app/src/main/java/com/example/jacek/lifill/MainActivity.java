package com.example.jacek.lifill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.jacek.lifill.Data.Place;


public class MainActivity extends AppCompatActivity {

    private Place currentLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        switch (sensorInfo) {
            case Bathroom:
                //code
                break;
            case Hall:
                //code
                break;
            case Garage:
                //code
                break;
            case Kithen:
                //code
                break;
            case Toilet:
                //code
                break;
            case Bedroom:
                //code
                break;
            case LivingRoom:
                //code
                break;
            default:
                //code
        }


    }
}
