package com.example.prasanga.lets_cheer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by prasanga on 4/19/18.
 */

public class Match_layout_adapter extends RecyclerView.Adapter<Match_layout_adapter.Match_layout_modelViewHolder>{

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Match_layout_model> matchList;

    //getting the context and match list with constructor


    public Match_layout_adapter(Context mCtx, List<Match_layout_model> matchList) {
        this.mCtx = mCtx;
        this.matchList = matchList;
    }

    @Override
    public Match_layout_modelViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        //inflating and returning our view holder

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.match_section_layout, null);
        return new Match_layout_modelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Match_layout_modelViewHolder holder, final int position){
        //getting the match detail of the specified position

        final Match_layout_model match_des = matchList.get(position);

        //binding the data with the viewholder views
        holder.textViewLeague.setText(match_des.getLeague_title());
        holder.textViewScore1.setText(""+match_des.getScore_team1());
        holder.textViewScore2.setText(""+match_des.getScore_team2());
        holder.textViewDate.setText(match_des.getDate());

        holder.teamLogo1.setImageDrawable(mCtx.getResources().getDrawable(match_des.getTeam_logo1()));
        holder.teamLogo2.setImageDrawable(mCtx.getResources().getDrawable(match_des.getTeam_logo2()));

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
//                Toast.makeText(mCtx,"You clicked"+match_des.getDate(),Toast.LENGTH_LONG).show();
                Intent intent=new Intent(view.getContext(),activity_cheer_description.class);
                intent.putExtra("data", match_des);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return matchList.size();
    }

    class Match_layout_modelViewHolder extends RecyclerView.ViewHolder{

        TextView textViewLeague, textViewDate, textViewScore1, textViewScore2;
        ImageView teamLogo1,teamLogo2;
        public CardView linearLayout;

        public Match_layout_modelViewHolder(View itemView){
            super(itemView);

            textViewLeague = itemView.findViewById(R.id.match_title);
            textViewDate = itemView.findViewById(R.id.match_date);
            textViewScore1 = itemView.findViewById(R.id.score1);
            textViewScore2 = itemView.findViewById(R.id.score2);
            teamLogo1 = itemView.findViewById(R.id.imageView1);
            teamLogo2 = itemView.findViewById(R.id.imageView2);
            linearLayout = (CardView) itemView.findViewById(R.id.match_page_card);
        }


    }
}
