package com.example.khojam.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.khojam.Models.Meanings;
import com.example.khojam.R;
import com.example.khojam.ViewHolders.MeaningViewHolder;

import java.util.List;

public class MeaningAdapter extends RecyclerView.Adapter<MeaningViewHolder> {
    private Context context;
    private List<Meanings> meaningsList;

    public MeaningAdapter(Context context, List<Meanings> meaningsList) {
        this.context = context;
        this.meaningsList = meaningsList;
    }

    @NonNull
    @Override
    public MeaningViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MeaningViewHolder(LayoutInflater.from(context).inflate(R.layout.meanings_ltem, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MeaningViewHolder holder, int position) {
        holder.textView_partsOfSpeech.setText("Parts of Speech: " + meaningsList.get(position).getPartOfSpeech());

        holder.recycler_definitions.setHasFixedSize(true);
        holder.recycler_definitions.setLayoutManager(new GridLayoutManager(context, 1));
        DefinitionAdapter definitionAdapter = new DefinitionAdapter(context, meaningsList.get(position).getDefinitions());
        holder.recycler_definitions.setAdapter(definitionAdapter);
    }


    @Override
    public int getItemCount() {
        return meaningsList.size();
    }
}