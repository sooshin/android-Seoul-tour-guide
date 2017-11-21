package com.example.android.tourguide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by sj on 11/19/2017.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private Context mContext;
    private List<Attraction> mAttractions;

    public RecyclerAdapter(Context context, List<Attraction> attractions, int item_layout) {
        mContext = context;
        mAttractions = attractions;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, null);
        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return mAttractions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nameTextView;
        private TextView descriptionTextView;
        private CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.attraction_image_card);
            nameTextView = itemView.findViewById(R.id.attraction_name_card);
            descriptionTextView = itemView.findViewById(R.id.attraction_description_card);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Attraction attraction = mAttractions.get(position);
        Drawable drawable = ContextCompat.getDrawable(mContext, attraction.getAttractionImageId());
        holder.imageView.setBackground(drawable);
        holder.nameTextView.setText(attraction.getAttractionName());
        holder.descriptionTextView.setText(attraction.getAttractionDescription());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, attraction.getAttractionName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}