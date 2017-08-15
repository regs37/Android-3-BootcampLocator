package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.regs.com.bootcamplocator.DataService;
import dev.regs.com.bootcamplocator.LocationAdapter;
import dev.regs.com.bootcamplocator.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocationListFragment extends Fragment {


    public LocationListFragment() {
        // Required empty public constructor
    }
    public static LocationListFragment newInstance() {
        LocationListFragment fragment = new LocationListFragment();

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_location_list, container, false);

        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_locations);
        recyclerView.setHasFixedSize(true);

        LocationAdapter adapter = new LocationAdapter(DataService.getInstance().getBootcampLocationsWithin10MilesOfZip(92284));
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

}
