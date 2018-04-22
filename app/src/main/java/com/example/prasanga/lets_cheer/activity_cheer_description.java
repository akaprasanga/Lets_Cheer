package com.example.prasanga.lets_cheer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class activity_cheer_description extends AppCompatActivity {


    //a list to store all the cheers data
    List<Model_cheer_description> cheerList;

    //the recyclerview
    RecyclerView recyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheer_description);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.cheer_description_recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            Match_layout_model newList = (Match_layout_model) extras.getSerializable("data");
            // do something with the customer

            cheerList = new ArrayList<>();

            cheerList.add(
                    new Model_cheer_description(
                            "Chelsea",
                            newList.getScore_team1(),
                            newList.getScore_team1(),
                            newList.getScore_team1(),
                            newList.getTeam_logo1()));
            cheerList.add(
                    new Model_cheer_description(
                            "Chelsea",
                            newList.getScore_team2(),
                            newList.getScore_team2(),
                            newList.getScore_team2(),
                            newList.getTeam_logo2()));

            //passing to  recyclerview adapter
            Cheer_description_adapter adapter = new Cheer_description_adapter(this, cheerList);

            //setting adapter to recyclerview
            recyclerView.setAdapter(adapter);
        }

    }
}
