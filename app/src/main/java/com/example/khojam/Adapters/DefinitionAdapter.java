package com.example.khojam.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.khojam.Models.Definitions;
import com.example.khojam.R;
import com.example.khojam.ViewHolders.DefinitionViewHolder;

import java.util.List;

public class DefinitionAdapter extends RecyclerView.Adapter<DefinitionViewHolder> {
    private Context context;
    private List<Definitions> definitionsList;

    public DefinitionAdapter(Context context, List<Definitions> definitionsList) {
        this.context = context;
        this.definitionsList = definitionsList;
    }

    @NonNull
    @Override
    public DefinitionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DefinitionViewHolder(LayoutInflater.from(context).inflate(R.layout.defination_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DefinitionViewHolder holder, int position) {
        holder.textView_definitions.setText("Definition: " + definitionsList.get(position).getDefinition());
        holder.textView_example.setText("Example: " + definitionsList.get(position).getExample());
        StringBuilder synonyms = new StringBuilder();
        StringBuilder antonyms = new StringBuilder();

//        for (int i=0 ; i<definitionsList.get(position).getSynonyms().size(); i++){
//            synonyms.append(definitionsList.get(position).getSynonyms());
//        }
        synonyms.append(definitionsList.get(position).getSynonyms());
        antonyms.append(definitionsList.get(position).getAntonyms());
        holder.textView_synonyms.setText(synonyms);
        holder.textView_antonyms.setText(antonyms);

        holder.textView_synonyms.setSelected(true);
        holder.textView_antonyms.setSelected(true);
    }

    @Override
    public int getItemCount() {
        return definitionsList.size();
    }
}