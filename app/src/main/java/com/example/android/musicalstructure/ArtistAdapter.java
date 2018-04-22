package com.example.android.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<ArtistClass> {
    public ArtistAdapter(Activity context, ArrayList<ArtistClass> album){
        super(context,0,album);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_artist, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        ArtistClass currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.first_entry_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        artistTextView.setText(currentWord.getArtist());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView genreTextView = (TextView) listItemView.findViewById(R.id.second_entry_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        genreTextView.setText(currentWord.getGenre());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }}

