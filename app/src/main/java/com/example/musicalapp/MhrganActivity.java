package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MhrganActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhrgan);

        ArrayList<SongInfo> MInfo= new ArrayList<>();

          MInfo.add(new SongInfo("Shakosh","Bnt El geran"));
          MInfo.add(new SongInfo("Omar Kamal","Aod el batl"));
          MInfo.add(new SongInfo("Beka","Ayam fe bahr"));

          SongInfoAdapter adapter =new SongInfoAdapter(this,MInfo);

        ListView listview=findViewById(R.id.listMhrgan);
        listview.setAdapter(adapter); }

        public void Back(View v){
            Intent intent=new Intent(MhrganActivity.this,MainActivity.class);
            startActivity(intent);
        }
}
