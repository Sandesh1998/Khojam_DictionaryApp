package com.example.khojam.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.khojam.R;

public class MeaningViewHolder extends RecyclerView.ViewHolder {
    TextView textView_partsOfSpeech;
    RecyclerView recycler_definition;
    public MeaningViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_partsOfSpeech = itemView.findViewById(R.id.textView_definition);
        recycler_definition = itemView.findViewById(R.id.recycler_definition);
    }
}
