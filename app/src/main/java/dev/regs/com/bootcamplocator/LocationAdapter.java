package dev.regs.com.bootcamplocator;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by cicct on 8/15/2017.
 */

public class LocationAdapter extends RecyclerView.Adapter<LocationsViewHolder>{
    private ArrayList<LocationModel> locations;
    public LocationAdapter(ArrayList<LocationModel> locations) {
        this.locations = locations;
    }
    @Override
    public void onBindViewHolder(LocationsViewHolder holder, int position) {
        final LocationModel location = locations.get(position);
        holder.updateUI(location);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Load details page
            }
        });
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    @Override
    public LocationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_location, parent, false);
        return new LocationsViewHolder(card);
    }
}
