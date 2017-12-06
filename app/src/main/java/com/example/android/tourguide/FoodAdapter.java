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
 * {@link FoodAdapter} is an {@link RecyclerAdapter} that can provide a layout for each card view item
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private Context mContext;
    private List<Food> mFoods;

    /** Integer for each category */
    private int mCategory;

    /**
     * our own custom constructor
     * @param context the current context
     * @param foods a list of food objects
     * @param category is a constant indicating to which category
     */
    FoodAdapter(Context context, List<Food> foods, int category) {
        mContext = context;
        mFoods = foods;
        mCategory = category;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_food, null);
        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return mFoods.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nameTextView;
        private CardView cardView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.food_image_card);
            nameTextView = itemView.findViewById(R.id.food_name_card);
            cardView = itemView.findViewById(R.id.cardview_food);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Food attraction = mFoods.get(position);
        Drawable drawable = ContextCompat.getDrawable(mContext, attraction.getFoodImageId());
        holder.imageView.setBackground(drawable);
        holder.nameTextView.setText(attraction.getFoodName());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DetailActivity}
                Intent detailIntent = new Intent(mContext, DetailActivity.class);

                //Pass value indicating to a category
                detailIntent.putExtra("category", mCategory);

                // Pass value to {@link DetailActivity}
                detailIntent.putExtra(mContext.getString(R.string.image_id),
                        attraction.getFoodImageId());
                detailIntent.putExtra(mContext.getString(R.string.name),
                        attraction.getFoodName());
                detailIntent.putExtra(mContext.getString(R.string.description),
                        attraction.getFoodDescription());
                detailIntent.putExtra(mContext.getString(R.string.address),
                        attraction.getFoodAddress());
                detailIntent.putExtra(mContext.getString(R.string.transport),
                        attraction.getFoodTransportation());
                detailIntent.putExtra(mContext.getString(R.string.phone),
                        attraction.getFoodPhone());
                detailIntent.putExtra(mContext.getString(R.string.web),
                        attraction.getFoodWeb());
                detailIntent.putExtra(mContext.getString(R.string.hours),
                        attraction.getFoodHours());
                detailIntent.putExtra(mContext.getString(R.string.fee),
                        attraction.getFoodFee());

                // Start the new activity
                mContext.startActivity(detailIntent);
            }
        });
    }
}
