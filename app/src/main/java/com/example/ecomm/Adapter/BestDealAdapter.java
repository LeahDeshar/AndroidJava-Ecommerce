package com.example.ecomm.Adapter;


import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BestDealAdapter extends RecyclerView.Adapter<BestDealAdapter.Viewholder>{
    ArrayList<BestDealDomain> items;
    Context context;

    public BestDealAdapter(ArrayList<BestDealDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public BestDealAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ViewholderBestDealBinding binding = ViewholderBestDealBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BestDealAdapter.Viewholder holder, int position) {

    }


    public class Viewholder extends RecyclerView.ViewHolder {

        ViewholderBestDealBinding binding;
        public Viewholder(ViewholderBestDealBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
