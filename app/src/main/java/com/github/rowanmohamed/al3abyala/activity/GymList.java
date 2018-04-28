package com.github.rowanmohamed.al3abyala.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.github.rowanmohamed.al3abyala.R;

import java.util.ArrayList;

public class GymList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gym_list);

        ArrayList<Gym> gyms = new ArrayList<Gym>();
        gyms.add(new Gym("Omega Gym", "Sidi Beshr Bahri", R.drawable.omega_logo));
        gyms.add(new Gym("Flex Gym", "Qesm Al Montazah", R.drawable.place_holder_image));
        gyms.add(new Gym("Dragon Gym", "Sidi Beshr Qebli", R.drawable.place_holder_image));
        gyms.add(new Gym("Top Gym", "Sidi Beshr Qebli", R.drawable.place_holder_image));
        gyms.add(new Gym("Sparta Gym", "Sidi Beshr Bahri", R.drawable.sparta_logo));
        gyms.add(new Gym("legend GYM", "Sidi Beshr Qebli", R.drawable.legend_logo));
        gyms.add(new Gym("Silver GYM", "Sidi Beshr Bahri", R.drawable.place_holder_image));
        gyms.add(new Gym("Steel House Gym", "Sidi Beshr Bahri", R.drawable.steel_house_logo));
        gyms.add(new Gym("Leader Gym", "Al Soyouf Bahri", R.drawable.leader_logo));
        gyms.add(new Gym("Motivate Gym", "Al Soyouf Bahri", R.drawable.place_holder_image));
        gyms.add(new Gym("UNITED GYM", "San Stifano", R.drawable.place_holder_image));
        gyms.add(new Gym("Blow Up Gym", "Al Mandarah Bahri", R.drawable.place_holder_image));
        gyms.add(new Gym("Hammam Gym", "Sidi Beshr Bahri", R.drawable.hammam_logo));
        gyms.add(new Gym("Planet Gym", "Kafr Abdo" , R.drawable.planet_fitness_logo));
        //gyms.add(new Gym("Evolution Gym", "Mostafa Kamel", ));

        GymAdapter gymAdapter = new GymAdapter(this, gyms);
        final ListView listView = (ListView) findViewById(R.id.list_of_gyms);
        listView.setAdapter(gymAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(GymList.this, GymProfile.class);
                intent.putExtra("GymName",listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

    }
}
