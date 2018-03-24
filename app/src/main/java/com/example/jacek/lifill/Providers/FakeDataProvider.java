package com.example.jacek.lifill.Providers;

import com.example.jacek.lifill.Data.Place;
import com.example.jacek.lifill.Data.ProductDto;
import com.example.jacek.lifill.R;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jacek on 24.03.18.
 */

public class FakeDataProvider {
    private List<ProductDto> products;
    private Place place;

    public FakeDataProvider(Place place) {
        this.place = place;
        products = new LinkedList<>();
    }

    protected void init (){
                switch (place) {
            case Bathroom:
                products.add(new ProductDto("Pasta do zębów",R.drawable.pasta, System.currentTimeMillis()-1000 ));
                products.add(new ProductDto("Gąbka",R.drawable.gabka, System.currentTimeMillis()-1000 ));
                products.add(new ProductDto("Szampon",R.drawable.szampon, System.currentTimeMillis()-1000 ));
                products.add(new ProductDto("Szczoteczka", R.drawable.szczoteczka, System.currentTimeMillis()-1000));
                break;
            case Hall:
                products.add(new ProductDto("Gąbka",R.drawable.gabka, System.currentTimeMillis()-1000 ));
                break;
            case Garage:
                products.add(new ProductDto("Szampon do auta",R.drawable.szampon, System.currentTimeMillis()-1000 ));
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

    public List<ProductDto> getProducts() {
        return products;
    }
}
