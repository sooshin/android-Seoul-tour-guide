package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * DetailActivity is the activity that appears when a card item is clicke on the
 * {@link InformationFragment}, {@link SightsFragment}, {@link NatureCultureFragment},
 * {@link ShopFragment}, {@link FoodFragment}
 */

public class DetailActivity extends AppCompatActivity {

    private int imageId;
    private String description;
    private String address;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get an intent from the {@link SightsFragment}, {@link NatureCultureFragment},
        // {@link ShopFragment}, {@link FoodFragment}
        Intent detailIntent = getIntent();

        // Get the data from the intent
        imageId = detailIntent.getIntExtra(getString(R.string.image_id), -1);
        String name = detailIntent.getStringExtra(getString(R.string.name));
        description = detailIntent.getStringExtra(getString(R.string.description));
        address = detailIntent.getStringExtra(getString(R.string.address));
        String transport = detailIntent.getStringExtra(getString(R.string.transport));
        String phone = detailIntent.getStringExtra(getString(R.string.phone));
        String web = detailIntent.getStringExtra(getString(R.string.web));
        String hours = detailIntent.getStringExtra(getString(R.string.hours));
        String fee = detailIntent.getStringExtra(getString(R.string.fee));

        // Set title of an action bar
        setTitle(name);

        // Find imageView and set the image resource ID on that imageView
        ImageView imageView = findViewById(R.id.detail_image_view);
        imageView.setImageResource(imageId);

        // Set DescriptionTextview
        setDescriptionTextView();

        // Find textView with ID detail_address
        final TextView addressTextView = findViewById(R.id.detail_address);

        // Set a click listener to start geoIntent when address is clicked on
        addressTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="
                        +addressTextView.getText().toString()));
                startActivity(geoIntent);
            }
        });

        // Set details on the textView
        setDetails(R.id.detail_address, address, R.drawable.ic_location);
        setDetails(R.id.detail_transport, transport, R.drawable.ic_subway);
        setDetails(R.id.detail_phone, phone, R.drawable.ic_call);
        setDetails(R.id.detail_web, web, R.drawable.ic_public);
        setDetails(R.id.detail_hours, hours, R.drawable.ic_time);
        setDetails(R.id.detail_fee, fee, R.drawable.ic_money);

        // Navigate with the app icon in the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    /**
     * Find textView in the activity_detail.xml layout with the textViewId
     * If the string is null, hide the textView, otherwise set the string on the textView and
     * set drawableLeft on that textView based on the icResourceId
     *
     * @param textViewId textView ID in the activity_detail.xml
     * @param string A string to display on the textView
     * @param icResourceId Resource ID for the ic image
     */
    public void setDetails(int textViewId, String string, int icResourceId) {
        TextView textView = findViewById(textViewId);
        if (string == null) {
            textView.setVisibility(View.GONE);
        } else {
            textView.setText(string);
            textView.setCompoundDrawablesWithIntrinsicBounds(icResourceId, 0, 0, 0);
            if (string.equals(address)) {
                // If autoLink map does not work, add links to addressTextView
                SpannableString spanStr = new SpannableString(address);
                spanStr.setSpan(new UnderlineSpan(), 0, spanStr.length(), 0);
                textView.setText(spanStr);
            }
        }
    }

    /**
     * Find textView with the detail_long_description ID and display description text on that textView
     * and set Background color and text color based on category
     */
    public void setDescriptionTextView() {
        // Find descriptionView
        TextView descriptionTextView = findViewById(R.id.detail_long_description);

        // Set the description on that textView
        descriptionTextView.setText(description);
        if (imageId == R.drawable.gyeongbokgung || imageId == R.drawable.bukchon_hanok ||
                imageId == R.drawable.changdeokgung || imageId == R.drawable.seoul_tower ||
                imageId == R.drawable.cheonggyecheon || imageId == R.drawable.war_memorial ||
                imageId == R.drawable.lotte_world_tower || imageId == R.drawable.bongeunsa ||
                imageId == R.drawable.insadong || imageId == R.drawable.ddp ||
                imageId == R.drawable.hongik_uni_street || imageId == R.drawable.jongmyo_shrine) {

            // if images belong to Sights category, set backgroundResource on the descriptionTextView
            descriptionTextView.setBackgroundResource(R.color.color_description_sights);
            descriptionTextView.setTextColor(getResources().getColor(R.color.color_description_sights_text));

        } else if(imageId == R.drawable.myeongdong || imageId == R.drawable.namdaemun ||
                imageId == R.drawable.goto_mall || imageId == R.drawable.dongdaemun ||
                imageId == R.drawable.common_ground || imageId == R.drawable.garosugil ||
                imageId == R.drawable.times_square){

            // if images belong to Shop category, set backgroundResource on the descriptionTextView
            descriptionTextView.setBackgroundResource(R.color.color_description_shop);
            descriptionTextView.setTextColor(getResources().getColor(R.color.color_description_shop_text));

        } else if(imageId == R.drawable.gwangjang || imageId == R.drawable.hanilkwan ||
                imageId == R.drawable.tosokchon || imageId == R.drawable.jokbal ||
                imageId == R.drawable.better_than_beef || imageId == R.drawable.daedo ||
                imageId == R.drawable.chicken || imageId == R.drawable.jungsik ||
                imageId == R.drawable.beef_sarang || imageId == R.drawable.bamdokkaebi) {

            // if images belong to Food category, set backgroundResource on the descriptionTextView
            descriptionTextView.setBackgroundResource(R.color.color_description_food);
            descriptionTextView.setTextColor(getResources().getColor(R.color.color_description_food_text));

        } else {

            // if images belong to Nature and Culture category, set backgroundResource on the descriptionTextView
            descriptionTextView.setBackgroundResource(R.color.color_description_nature);
            descriptionTextView.setTextColor(getResources().getColor(R.color.color_description_nature_text));
        }
    }

    // Go back to the previous screen when up button is clicked.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
