package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle2.R;

import java.util.ArrayList;

import Models.dataModels;

public class dataAdapters extends RecyclerView.Adapter<dataAdapters.ViewHolder> {
    ArrayList<dataModels> list;
    Context context;

    public dataAdapters(ArrayList<dataModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public dataAdapters.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataAdapters.ViewHolder holder, int position) {
        dataModels model=list.get(position);
        holder.picture.setImageResource(model.getPic());
        holder.nameIs.setText(model.getName());
        holder.timingIs.setText(model.getTiming());
        holder.msgIs.setText(model.getMsg());
        holder.lineIs.setText(model.getLine());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView picture;
        TextView nameIs,timingIs,msgIs,lineIs;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            picture=itemView.findViewById(R.id.image1);
            nameIs=itemView.findViewById(R.id.text1);
            timingIs=itemView.findViewById(R.id.text2);
            msgIs=itemView.findViewById(R.id.text3);
            lineIs=itemView.findViewById(R.id.text4);

        }
    }
}
