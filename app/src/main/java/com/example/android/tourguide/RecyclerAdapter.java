package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * {@link RecyclerAdapter} is an {@link RecyclerAdapter} that can provide a layout for each card view item
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private Context mContext;
    private List<Attraction> mAttractions;

    private int mCategory;

    RecyclerAdapter(Context context, List<Attraction> attractions, int category) {
        mContext = context;
        mAttractions = attractions;
        mCategory = category;
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

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nameTextView;
        private TextView descriptionShortTextView;
        private CardView cardView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.attraction_image_card);
            nameTextView = itemView.findViewById(R.id.attraction_name_card);
            descriptionShortTextView = itemView.findViewById(R.id.attraction_short_card);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Attraction attraction = mAttractions.get(position);
        Drawable drawable = ContextCompat.getDrawable(mContext, attraction.getAttractionImageId());
        holder.imageView.setBackground(drawable);
        holder.nameTextView.setText(attraction.getAttractionName());
        holder.descriptionShortTextView.setText(attraction.getAttractionShortDs());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DetailActivity}
                Intent detailIntent = new Intent(mContext, DetailActivity.class);

                // Pass value indicating to a category
                detailIntent.putExtra("category", mCategory);

                // Pass value to {@link DetailActivity}
                detailIntent.putExtra(mContext.getString(R.string.image_id),
                        attraction.getAttractionImageId());
                detailIntent.putExtra(mContext.getString(R.string.name),
                        attraction.getAttractionName());
                detailIntent.putExtra(mContext.getString(R.string.description),
                        attraction.getAttractionDescription());
                detailIntent.putExtra(mContext.getString(R.string.address),
                        attraction.getAttractionAddress());
                detailIntent.putExtra(mContext.getString(R.string.transport),
                        attraction.getAttractionTransportation());
                detailIntent.putExtra(mContext.getString(R.string.phone),
                        attraction.getAttractionPhone());
                detailIntent.putExtra(mContext.getString(R.string.web),
                        attraction.getAttractionWeb());
                detailIntent.putExtra(mContext.getString(R.string.hours),
                        attraction.getAttractionHours());
                detailIntent.putExtra(mContext.getString(R.string.fee),
                        attraction.getAttractionFee());

                // Start the new activity
                mContext.startActivity(detailIntent);
            }
        });
    }

}