package com.palacios.hp.mymapaperu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irMapa(View v){

        Intent i = new Intent(this,MapsActivity.class);
        switch (v.getId()){
            case R.id.ivAyacucho:
                Log.e("SWITCH","AYACUCHO");
                i.putExtra("lat",-13.158);
                i.putExtra("lon",-74.247);
                break;
            case R.id.ivPiura:
                Log.e("SWITCH","PIURA");
                i.putExtra("lat",-5.193);
                i.putExtra("lon",-80.736);
                break;
            case R.id.ivIquitos:
                Log.e("SWITCH","IQUITOS");
                i.putExtra("lat",-3.7645071);
                i.putExtra("lon",-73.3478382);
                break;
            case R.id.ivCusco:
                Log.e("SWITCH","CUSCO");
                i.putExtra("lat",-13.530);
                i.putExtra("lon",-72.009);
                break;
        }

      //  Intent i = new Intent(this,MapsActivity.class);
        startActivity(i);
    }
}
