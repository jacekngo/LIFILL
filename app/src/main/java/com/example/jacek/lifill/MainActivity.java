package com.example.jacek.lifill;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.jacek.lifill.Data.Place;
import com.example.jacek.lifill.Data.ProductDto;
import com.example.jacek.lifill.Providers.FakeDataProvider;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    private RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    Context context;
    private Place currentLocation;
    private Integer counter;
List<ProductDto> listOfProducts;
    @BindView(R.id.tv_location)
    protected TextView locationTv;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
recyclerView = new RecyclerView(this);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
//        Adapter adapter = new Adapter(n);
        listOfProducts = new ArrayList<>();
        adapter = new Adapter(listOfProducts);
        recyclerView.setAdapter(adapter);
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

        FakeDataProvider dataToDisplay = new FakeDataProvider(currentLocation);
        dataToDisplay.init();
       listOfProducts = dataToDisplay.getProducts();
//        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();



    }
}
