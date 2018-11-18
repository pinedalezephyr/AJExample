package com.example.mohaned.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mohaned on 4/22/2018.
 */

public class placeAdapter extends ArrayAdapter {

    private int mColorResourceId;

    public placeAdapter(Activity context, ArrayList<Place> words, int colorResourseId){
        super(context,0,words);
        mColorResourceId = colorResourseId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = (Place) getItem(position);

        TextView placeName = (TextView)listItemView.findViewById(R.id.name);
        placeName.setText(currentPlace.getPlaceName());

        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.rating_bar);
        ratingBar.setRating(currentPlace.getRate());

        Log.i("rating", currentPlace.getRate() + "");

        TextView placeAdd = (TextView) listItemView.findViewById(R.id.address);
        placeAdd.setText(currentPlace.getAddress());

        ImageView placeImage = (ImageView) listItemView.findViewById(R.id.imageRes);

        if (currentPlace.hasImage()){
            placeImage.setImageResource(currentPlace.getImageResource());
            placeImage.setVisibility(View.VISIBLE);
        } else {
            placeImage.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
