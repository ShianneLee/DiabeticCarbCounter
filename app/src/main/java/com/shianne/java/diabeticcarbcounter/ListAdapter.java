package com.shianne.java.diabeticcarbcounter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView dateCreated;
        public TextView grossUnitsTextView;
        public TextView correctionUnitsTextView;
        public TextView finalUnitsTextView;

        public ViewHolder(View itemView) {

            super(itemView);

            dateCreated =  (TextView) itemView.findViewById(R.id.dateCreated);
            grossUnitsTextView = (TextView) itemView.findViewById(R.id.grossUnitsTextView);
            correctionUnitsTextView = (TextView) itemView.findViewById(R.id.correctionUnitsTextView);
            finalUnitsTextView = (TextView) itemView.findViewById(R.id.finalUnitsTextView);
        }

    }
}
