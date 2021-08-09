package com.example.whatsappui;     //Adapter class binds the dataset to thr recycler view

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private final List<DesignUI> userList;
    public Adapter(List<DesignUI> userList)
    {this.userList=userList;    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {    // Inflater is android services which takes xml files and convert them into view objects
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.design_block,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {  //binds our data from modal(DesignUI) to recycler view
    int image=userList.get(position).getImageView();
    String n=userList.get(position).getName();
    String m=userList.get(position).getMsg();
    String t=userList.get(position).getTime();
    holder.setData(image,n,m,t);
    }

    @Override
    public int getItemCount() {             //return size of dataset ie. userList
        return userList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imagev;
        private final TextView name;
        private final TextView msg;
        private final TextView tim;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagev=itemView.findViewById(R.id.imageView);
            name=itemView.findViewById(R.id.name);
            msg=itemView.findViewById(R.id.msg);
            tim=itemView.findViewById(R.id.time);
        }

        public void setData(int image, String n, String m, String t) {
            imagev.setImageResource(image);
            name.setText(n);
            msg.setText(m);
            tim.setText(t);
        }
    }
}
