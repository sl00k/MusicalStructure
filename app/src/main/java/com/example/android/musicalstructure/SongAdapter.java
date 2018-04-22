package com.example.android.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<SongClass> {

    public SongAdapter(Activity context, ArrayList<SongClass> album){
        super(context,0,album);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_song, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        SongClass currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.first_entry_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songTextView.setText(currentWord.getSong());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView durationTextView = (TextView) listItemView.findViewById(R.id.second_entry_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        durationTextView.setText(currentWord.getDuration());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }}
