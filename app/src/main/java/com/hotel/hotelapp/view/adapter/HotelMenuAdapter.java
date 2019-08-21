package com.hotel.hotelapp.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hotel.hotelapp.R;

import java.util.List;

public class HotelMenuAdapter extends RecyclerView.Adapter<HotelMenuAdapter.MenuViewHolder> {
    private final List<String> mList;

    public HotelMenuAdapter(List<String> list) {
        mList = list;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TextView view = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.menu_item, viewGroup, false);

        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder menuViewHolder, int i) {
        menuViewHolder.mView.setText("" + i);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class MenuViewHolder extends RecyclerView.ViewHolder {
        public TextView mView;

        public MenuViewHolder(@NonNull TextView itemView) {
            super(itemView);
            mView = itemView;
        }
    }
}