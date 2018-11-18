package com.example.mohaned.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mohaned on 4/22/2018.
 */

public class EventsFragment extends Fragment {

    public EventsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> events = new ArrayList<>();

        events.add(new Place(R.string.laseronics_name, R.string.laseronics_address,
                R.drawable.ic_event_black_24dp, 4.5));
        events.add(new Place(R.string.go_name, R.string.go_address,
                R.drawable.ic_event_black_24dp, 5.0));
        events.add(new Place(R.string.qig_name, R.string.qig_address,
                R.drawable.ic_event_black_24dp, 5.0));
        events.add(new Place(R.string.db_name, R.string.db_address,
                R.drawable.ic_event_black_24dp, 3.2));

        placeAdapter adapter = new placeAdapter(getActivity(), events, R.color.category_events);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
