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

public class BeachesFragment extends Fragment {

    public BeachesFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> beaches = new ArrayList<>();

        beaches.add(new Place(R.string.tolip_beach_name, R.string.tolip_beach_address,
                R.drawable.tolip, 4.1));
        beaches.add(new Place(R.string.paradise_name, R.string.paradies_address,
                R.drawable.paradise, 3.9));
        beaches.add(new Place(R.string.montazah_name, R.string.motazah_address,
                R.drawable.montazah, 4.6));
        beaches.add(new Place(R.string.stanley_name, R.string.stanley_address,
                R.drawable.stanli, 4.3));
        beaches.add(new Place(R.string.tolip_hotel_name, R.string.tolip_hotel_address,
                R.drawable.tolip, 4.2));
        beaches.add(new Place(R.string.four_name, R.string.four_address,
                R.drawable.fourseasons,4.6));
        beaches.add(new Place(R.string.helnan_name, R.string.helnan_address,
                R.drawable.helnan, 4.4));
        beaches.add(new Place(R.string.hilton_name, R.string.hilton_address,
                R.drawable.hilton, 4.4));

        placeAdapter adapter = new placeAdapter(getActivity(), beaches, R.color.category_beaches);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }
}
