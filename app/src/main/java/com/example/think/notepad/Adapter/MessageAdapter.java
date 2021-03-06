package com.example.think.notepad.Adapter;

import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.think.notepad.Bean.message;
import com.example.think.notepad.R;

import java.util.List;


public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder>{
    private List<message> messageList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView time;
        TextView user;
        TextView text;
        public ViewHolder(View view){
            super(view);
            time = (TextView) view.findViewById(R.id.time);
            user = (TextView) view.findViewById(R.id.user);
            text = (TextView) view.findViewById(R.id.text);
        }
    }
    public MessageAdapter(List<message> messageList){
        this.messageList = messageList;
    }
    @NonNull
    @Override
    public MessageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_message,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.ViewHolder viewHolder, int i) {
        message msg = messageList.get(i);
        viewHolder.time.setText(msg.getTime());
        viewHolder.user.setText(msg.getUser());
        viewHolder.text.setText(msg.getText());
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }
}
