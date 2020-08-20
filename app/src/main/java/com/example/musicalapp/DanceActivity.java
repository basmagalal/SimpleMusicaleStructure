package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance);

        ArrayList<SongInfo> Dinfo = new ArrayList<>();
        Dinfo.add(new SongInfo("Amina", "hantor"));
        Dinfo.add(new SongInfo("Saad", "Harika"));
        Dinfo.add(new SongInfo("Bosy", "Eshta"));

        SongInfoAdapter adapter = new SongInfoAdapter(this, Dinfo);

        ListView listview = findViewById(R.id.listDan);
        listview.setAdapter(adapter);
    }

    public void Back(View v) {
        Intent intent = new Intent(DanceActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
