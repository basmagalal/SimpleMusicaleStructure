package com.example.musicalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SongInfoAdapter extends ArrayAdapter<SongInfo> {

    public SongInfoAdapter(Context context, ArrayList<SongInfo> object) {
        super(context, 0, object);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        SongInfo currentPosition = getItem(position);

        TextView song = listView.findViewById(R.id.song);
        song.setText(currentPosition.getNameSong());

        TextView singer = listView.findViewById(R.id.singer);
        singer.setText(currentPosition.getNameSinger());

        return listView;
    }
}
