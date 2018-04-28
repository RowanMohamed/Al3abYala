package com.github.rowanmohamed.al3abyala.activity;

/**
 * Created by Merna on 4/13/2018.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.rowanmohamed.al3abyala.R;

import java.util.ArrayList;

public class GymAdapter extends ArrayAdapter<Gym> {

    public GymAdapter (Activity context, ArrayList<Gym> Gym) {
        super(context, 0, Gym);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Gym currentGym = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.gym_name_text_view);
        nameTextView.setText(currentGym.getGymName());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentGym.getGymLocation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentGym.getImageResourceId());

        return listItemView;
    }
}
