package com.example.prasanga.lets_cheer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Match extends Fragment {

    //a list to store all the matches
    List<Match_layout_model> matchesDescription;

    //the recyclerview
    RecyclerView recyclerView;


    public Fragment_Match() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // define veiw for fragments

        View view= inflater.inflate(R.layout.fragment_match, container, false);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) view.findViewById(R.id.match_recycler);
        recyclerView.setHasFixedSize(true);

        // getContext instead of this class for fragments
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //initializing the productlist
        matchesDescription = new ArrayList<>();

        //adding some items to our list
        matchesDescription.add(
                new Match_layout_model(
                        "2018-06-14",
                        "Champions League",
                        3,
                        6,
                        R.drawable.barcelona,
                        R.drawable.chelsea));

        matchesDescription.add(
                new Match_layout_model(
                        "2018-05-14",
                        "Europa League",
                        3,
                        6,
                        R.drawable.dortmund,
                        R.drawable.arsenal));

        matchesDescription.add(
                new Match_layout_model(
                        "2018-06-20",
                        "Champions League",
                        1,
                        1,
                        R.drawable.arsenal,
                        R.drawable.barcelona));
        matchesDescription.add(
                new Match_layout_model(
                        "2018-06-20",
                        "Champions League",
                        1,
                        1,
                        R.drawable.realmadrid,
                        R.drawable.chelsea));
        matchesDescription.add(
                new Match_layout_model(
                        "2018-06-20",
                        "Champions League",
                        1,
                        1,
                        R.drawable.dortmund,
                        R.drawable.barcelona));


        //creating recyclerview adapter
        Match_layout_adapter adapter = new Match_layout_adapter(getContext(), matchesDescription);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);


        //On click method for cards in the page



        return view;
    }

}
