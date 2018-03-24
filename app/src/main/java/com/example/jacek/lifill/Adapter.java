package com.example.jacek.lifill;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jacek.lifill.Data.ProductDto;

import java.util.List;

/**
 * Created by maciej on 24.03.2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ProductDto> listOfProducts;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.itemName.setText(listOfProducts.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return listOfProducts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemName;
        ImageView itemPhoto;

        public ViewHolder(View v) {
            super(v);
            itemName = v.findViewById(R.id.item_name);
//            itemPhoto
        }
    }

    public Adapter(List<ProductDto> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }


}