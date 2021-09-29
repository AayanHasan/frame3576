package com.example.tshirtprinting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class printAdapter extends RecyclerView.Adapter<printAdapter.ViewHolder> {
    List<printModal> printModals;
    Context context;

    public printAdapter(List<printModal> printModals, Context context) {
        this.printModals = printModals;
        this.context = context;
    }

    @NonNull
    @Override
    public printAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.single_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull printAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(printModals.get(position).getImageres());
        holder.textView.setText(printModals.get(position).getImagedes());
    }

    @Override
    public int getItemCount() {
        return printModals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.printing_img);
            textView=itemView.findViewById(R.id.printin_tv2);
        }
    }
}
