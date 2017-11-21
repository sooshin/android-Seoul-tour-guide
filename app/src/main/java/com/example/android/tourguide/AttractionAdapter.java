package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sj on 11/21/2017.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    /**
     * Provides a view for an AdapterView
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_name and
        // set this text on the attraction name TextView
        TextView attractionNameTextView = listItemView.findViewById(R.id.attraction_name_list);
        attractionNameTextView.setText(currentAttraction.getAttractionName());

        // Find the TextView in the list_item.xml layout with the ID attraction_description and
        // set this text on the attraction description TextView
        TextView descriptionTextView = listItemView.findViewById(R.id.attraction_description_list);
        descriptionTextView.setText(currentAttraction.getAttractionDescription());

        // Find the ImageView in the list_item.xml layout with the ID image
        // set this image on that ImageView
        ImageView imageView = listItemView.findViewById(R.id.image_list);
        imageView.setImageResource(currentAttraction.getAttractionImageId());

        return listItemView;
    }
}
