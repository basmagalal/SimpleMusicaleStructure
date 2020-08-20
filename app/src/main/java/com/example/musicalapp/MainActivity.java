package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mhrgn =findViewById(R.id.mhrgan);
        mhrgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, MhrganActivity.class);
                startActivity(mIntent);
            }
        });


        TextView romanc =findViewById(R.id.rom);

           romanc.setOnClickListener(new View.OnClickListener(){

               @Override
              public void onClick(View v) {
                Intent rIntent =new Intent(MainActivity.this, RomancActivity.class);
                startActivity(rIntent);
            }
        });

           TextView dan =findViewById(R.id.dance);
                dan.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        Intent dIntent =new Intent(MainActivity.this,DanceActivity.class);
                        startActivity(dIntent);
                    }



                });

    }
}
