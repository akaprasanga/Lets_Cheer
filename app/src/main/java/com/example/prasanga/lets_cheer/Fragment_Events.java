package com.example.prasanga.lets_cheer;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baoyachi.stepview.VerticalStepView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Events extends Fragment {


    VerticalStepView verticalStepView;

    public Fragment_Events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_events, container, false);

        verticalStepView = (VerticalStepView)view.findViewById(R.id.verticalStepView);

        List<String> sources = new ArrayList<>();
        sources.add("Free Kick");
        sources.add("Attack from the both side at the end of five minutes");
        sources.add("Whistle from the match refree");
        sources.add("Pitch seems a bit more grassy");
        sources.add("Ready");
        sources.add("Free Kick");
        sources.add("Attack from the both side at the end of five minutes");
        sources.add("Whistle from the match refree");
        sources.add("Pitch seems a bit more grassy");
        sources.add("Ready");
        sources.add("Free Kick");
        sources.add("Attack from the both side at the end of five minutes");
        sources.add("Whistle from the match refree");
        sources.add("Pitch seems a bit more grassy");
        sources.add("Ready");

        verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size()-2)
                .reverseDraw(false)
                .setStepViewTexts(sources)
                .setLinePaddingProportion(1.5f)
                .setStepsViewIndicatorCompletedLineColor(Color.parseColor("#1b6c94"))//yellow for completed line
                .setStepViewComplectedTextColor(Color.parseColor("#1b6c94"))//yellow for completed
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(getContext(),R.color.uncompleted_text_color))
                .setStepsViewIndicatorUnCompletedLineColor(Color.parseColor("#000000"))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getContext(),R.drawable.icon))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getContext(),R.drawable.attention))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getContext(),R.drawable.attention))

                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getContext(),R.drawable.attention))

                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getContext(),R.drawable.default_icon));



        return view;
    }

}
