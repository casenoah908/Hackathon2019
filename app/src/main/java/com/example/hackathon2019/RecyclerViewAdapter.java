package com.example.hackathon2019;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{


    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<String> types = new ArrayList<>();
    private ArrayList<UserAccount> users = new ArrayList<>();
    private ArrayList<String> dates = new ArrayList<>();



    public RecyclerViewAdapter(ArrayList<String> titles, ArrayList<String> types, ArrayList<UserAccount> users, ArrayList<String> dates){
        this.titles = titles;
        this.types = types;
        this.users = users;
        this.dates = dates;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.thread_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        //set info
        holder.threadTitleAndType.setText(types.get(position)+" - "+titles.get(position));
        holder.threadUserAndDate.setText(users.get(position).getUsername()+" "+
                users.get(position).getDays()+" days sober"+" - "+dates.get(position));

        holder.threadItemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //open thread activity
                //openThreadActivity();
            }
        });
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView threadTitleAndType;
        TextView threadUserAndDate;
        RelativeLayout threadItemLayout;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            threadTitleAndType = itemView.findViewById(R.id.threadTitleAndType);
            threadUserAndDate = itemView.findViewById(R.id.threadUserAndDate);
            threadItemLayout = itemView.findViewById(R.id.thread_item_layout);
        }
    }

    public void openThreadActivity(){
        //Intent intent = new Intent(context,ThreadActivity.class);
        //context.startActivity(intent);
    }
}
