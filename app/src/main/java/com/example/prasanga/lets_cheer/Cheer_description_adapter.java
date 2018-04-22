package com.example.prasanga.lets_cheer;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by prasanga on 4/21/18.
 */
public class Cheer_description_adapter extends RecyclerView.Adapter<Cheer_description_adapter.Cheer_descriptionViewHolder>{

    private Context Ctx;
    private List<Model_cheer_description> cheer_descriptionList;

    public Cheer_description_adapter(Context ctx, List<Model_cheer_description> cheer_descriptionList) {
        Ctx = ctx;
        this.cheer_descriptionList = cheer_descriptionList;
    }

    @Override
    public Cheer_descriptionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.cheer_description_layout,null);

        return new Cheer_descriptionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Cheer_descriptionViewHolder holder, int position) {
        //getting the detail data of the specified position
        Model_cheer_description cheer_data = cheer_descriptionList.get(position);

        //binding data with the views

        holder.textTeamName.setText(cheer_data.getTeamName());
        holder.textTeamScore.setText(""+cheer_data.getTeam_score());
        holder.textFollowerCount.setText(""+cheer_data.getFollowers_count());
        holder.textCheerCount.setText(""+cheer_data.getCheers_count());
        holder.imageTeamLogo.setImageDrawable(Ctx.getResources().getDrawable(cheer_data.getTeam_banner()));



    }

    @Override
    public int getItemCount() {
        return cheer_descriptionList.size();
    }

    class Cheer_descriptionViewHolder extends RecyclerView.ViewHolder{

        TextView textTeamName,textTeamScore,textCheerCount,textFollowerCount;
        ImageView imageTeamLogo;

        public Cheer_descriptionViewHolder(View itemView) {
            super(itemView);

            textTeamName = itemView.findViewById(R.id.team_name);
            textTeamScore = itemView.findViewById(R.id.team_score);
            textCheerCount = itemView.findViewById(R.id.cheer_count);
            textFollowerCount = itemView.findViewById(R.id.follower_count);
            imageTeamLogo = itemView.findViewById(R.id.team_banner);


        }
    }
}