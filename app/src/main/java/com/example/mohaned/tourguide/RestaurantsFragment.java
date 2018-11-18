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

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment(){
        // it requires an empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.string.samakmak_name,R.string.samakmak_address,
                R.drawable.samakmak, 4.2));
        places.add(new Place(R.string.tejanos_name, R.string.tejanos_address,
                R.drawable.tejanos, 4.5));
        places.add(new Place(R.string.balbaa_name, R.string.balbaa_address,
                R.drawable.balbaa, 4.2));
        places.add(new Place(R.string.sea_gull_name, R.string.sea_gull_address,
                R.drawable.seagull, 4.3));
        places.add(new Place(R.string.ole_name, R.string.ole_address,
                R.drawable.olecafe, 4.2));
        places.add(new Place(R.string.wahab_name, R.string.wahab_address,
                R.drawable.abdelwahab, 4.2));
        places.add(new Place(R.string.byblos_name, R.string.byblos_address,
                R.drawable.balbaa, 4.5));
        places.add(new Place(R.string.aroos_name, R.string.aroos_address,
                R.drawable.arooselbahr, 4.2));
        places.add(new Place(R.string.pablo_name, R.string.pablo_address,
                R.drawable.pablo, 4.1));
        places.add(new Place(R.string.delices_name, R.string.delices_address,
                R.drawable.delices, 4.4));
        places.add(new Place(R.string.fish_market_name, R.string.fish_matket_address,
                R.drawable.fishmarket,4.2));

        placeAdapter adapter = new placeAdapter (getActivity(), places, R.color.category_restaurants);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;


    }
}
