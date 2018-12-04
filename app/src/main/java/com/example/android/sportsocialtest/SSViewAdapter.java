package com.example.android.sportsocialtest;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Your name on 01-12-2018.
 */
public class SSViewAdapter extends RecyclerView.Adapter<SSViewAdapter.MyViewHolder> {
    private ArrayList<SSModel> arrayList = new ArrayList<>();
    private String activity_type;

    SSViewAdapter(List<SSModel> list){
        arrayList.addAll(list);
        Log.i("timetag",String.valueOf(System.currentTimeMillis()));
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view,viewGroup,false);
        return new MyViewHolder(view);
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.nameTv.setText(arrayList.get(i).getUserName());
        Picasso.get().load(arrayList.get(i).getEventImage()).into(myViewHolder.eventImgView);
        Log.i("timetagg",Integer.toString(arrayList.get(i).getStartdatetime()));
        long datetime = arrayList.get(i).getStartdatetime();
        String date  = new SimpleDateFormat("h 'hr' mm 'min ago'").format(datetime);
        myViewHolder.durationTv.setText(date);
        myViewHolder.numPlayerTv.setText(String.format("%d Playing", arrayList.get(i).getJoineeCount()));
        switch (arrayList.get(i).getActivityId()){
            case 1009 :
                activity_type = "Watching";
                break;
            case 1001 :
                activity_type = "Started";
                break;
            case 1002 :
                activity_type = "Joined";
            default :
                activity_type = "Started";
        }
        myViewHolder.commentTv.setText(String.format("%d Comments", arrayList.get(i).getCommentCount()));
        myViewHolder.watchTv.setText(String.format("%d Watching", arrayList.get(i).getWatchCount()));
        myViewHolder.eventNameTv.setText(String.format("%s a %s match", activity_type, arrayList.get(i).getGamename().toLowerCase()));
        Picasso.get().load(arrayList.get(i).getProfileImage()).resize(150,150).placeholder(R.drawable.ic_account_circle_black_24dp).transform(new CircleTransform()).into(myViewHolder.userImg);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView eventImgView;
        TextView nameTv;
        TextView eventNameTv;
        TextView durationTv;
        TextView numPlayerTv;
        ImageView userImg;
        TextView commentTv;
        TextView watchTv;

        public MyViewHolder(View itemView){
            super(itemView);
            eventImgView = itemView.findViewById(R.id.event_image);
            nameTv = itemView.findViewById(R.id.name);
            durationTv= itemView.findViewById(R.id.duration);
            eventNameTv = itemView.findViewById(R.id.event_name);
            numPlayerTv = itemView.findViewById(R.id.num_player);
            userImg = itemView.findViewById(R.id.user_img);
            commentTv = itemView.findViewById(R.id.comment);
            watchTv = itemView.findViewById(R.id.watching);
        }
    }
}
