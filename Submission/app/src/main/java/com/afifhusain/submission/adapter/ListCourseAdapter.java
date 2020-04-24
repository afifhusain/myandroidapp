package com.afifhusain.submission.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.afifhusain.submission.R;
import com.afifhusain.submission.model.Course;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCourseAdapter extends RecyclerView.Adapter<ListCourseAdapter.ListViewHolder> {

    private ArrayList<Course> listCourse;

    public ListCourseAdapter(ArrayList<Course> list) {
        this.listCourse = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.scroll_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Course course = listCourse.get(position);
        Glide.with(holder.itemView.getContext())
                .load(course.getImage())
                .apply(new RequestOptions().override(50,50))
                .into(holder.img);
        holder.title.setText(course.getTitle());
        holder.desc.setText(course.getDesc());
    }

    @Override
    public int getItemCount() {
        return listCourse.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
       ImageView img;
       TextView title,desc;

        public ListViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_item_photo);
            title = itemView.findViewById(R.id.item_title);
            desc = itemView.findViewById(R.id.item_desc);
        }
    }
}
