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

public class MuseumsFragment extends Fragment {

    public MuseumsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> museums = new ArrayList<>();

        museums.add(new Place(R.string.alex_nat_name, R.string.alex_nat_address,
                R.drawable.alexnational, 4.4));
        museums.add(new Place(R.string.royal_name, R.string.royal_address,
                R.drawable.royal, 4.6));
        museums.add(new Place(R.string.graeco_name, R.string.graeco_address,
                R.drawable.grecoroman, 3.5));
        museums.add(new Place(R.string.cavafy_name, R.string.cavafy_address,
                R.drawable.cavafy, 4.1));
        museums.add(new Place(R.string.mahmoud_name, R.string.mahmoud_address,
                R.drawable.mahmoudsaid, 4.2));
        museums.add(new Place(R.string.alex_aquarium_name, R.string.alex_aquarium_address,
                R.drawable.alexaquarium, 4.1));
        museums.add(new Place(R.string.roman_name, R.string.roman_address,
                R.drawable.roman, 4.2));

        placeAdapter adapter = new placeAdapter(getActivity(), museums, R.color.category_museums);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
