package com.example.project5;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    public TourAdapter(Activity context, ArrayList<Tour> text) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for Three TextViews, One Button and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, text);
    }

    /**
     * @param position
     * @param convertView
     * @param parent
     * @return custom layout view
     * Override the method to attach it to our layout and set the list to the TextView and ImageView
     * that we will add later.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (null == convertView) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_list_item, parent, false
            );
        }

        Tour currentPlace = getItem(position);

        TextView info = convertView.findViewById(R.id.info_text_view);
        info.setText(currentPlace.getInfo());

        TextView openingHours = convertView.findViewById(R.id.opening_hours_text_view);
        openingHours.setText(currentPlace.getOpeningHours());

        TextView fees = convertView.findViewById(R.id.fees_text_view);
        fees.setText(currentPlace.getFees());

        ImageView locationImage = convertView.findViewById(R.id.place_image_view);
        locationImage.setImageResource(currentPlace.getImageAsset());

        // Set onClickListener on a button to take us to a new activity.
        Button faqs = convertView.findViewById(R.id.faqs);
        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), FaqActivity.class);
                getContext().startActivity(intent);


            }
        });


        return convertView;
    }


}
