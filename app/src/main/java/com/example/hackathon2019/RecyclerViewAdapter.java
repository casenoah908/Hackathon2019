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



    private Context context;
    private Thread[] dimensionThreads;

    public RecyclerViewAdapter(Thread[] dimensionThreads, Context context){
        this.dimensionThreads = dimensionThreads;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.thread_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, final int position) {
        //set info
        holder.threadTitleAndType.setText(dimensionThreads[position].getType()+" - "+dimensionThreads[position].getTitle());
        holder.threadTitleAndType.setSelected(true);
        holder.threadUserAndDate.setText(dimensionThreads[position].getUserName()+" "+
                dimensionThreads[position].getUserDays()+" days"+" - "+dimensionThreads[position].getDateTime());

        holder.threadItemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //open thread activity
                openThreadActivity(dimensionThreads[position]);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dimensionThreads.length;
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

    public void openThreadActivity(Thread thread){
        Intent intent = new Intent(context,ThreadActivity.class);
        intent.putExtra("thread",thread);
        context.startActivity(intent);
    }
}
