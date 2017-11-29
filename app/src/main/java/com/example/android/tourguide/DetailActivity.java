package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sj on 11/23/2017.
 */

public class DetailActivity extends AppCompatActivity {

    private int imageId;
    private String name;
    private String description;
    private String shortDescription;
    private String address;
    private String transport;
    private String phone;
    private String web;
    private String hours;
    private String fee;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get an intent from the {@link SongsFragment}
        Intent detailIntent = getIntent();

        // Get the data from the intent
        imageId = detailIntent.getIntExtra(getString(R.string.image_id), -1);
        name = detailIntent.getStringExtra(getString(R.string.name));
        shortDescription = detailIntent.getStringExtra(getString(R.string.short_description));
        description = detailIntent.getStringExtra(getString(R.string.description));
        address = detailIntent.getStringExtra(getString(R.string.address));
        transport = detailIntent.getStringExtra(getString(R.string.transport));
        phone = detailIntent.getStringExtra(getString(R.string.phone));
        web = detailIntent.getStringExtra(getString(R.string.web));
        hours = detailIntent.getStringExtra(getString(R.string.hours));
        fee = detailIntent.getStringExtra(getString(R.string.fee));

        // Find imageView and set the image resource ID on that imageView
        ImageView imageView = findViewById(R.id.detail_image_view);
        imageView.setImageResource(imageId);

        // Find descriptionView and set the description on that textView
        TextView descriptionTextView = findViewById(R.id.detail_long_description);
        descriptionTextView.setText(description);
        descriptionTextView.setBackgroundResource(R.color.color_teal_l_100);

        final TextView addressTextView = findViewById(R.id.detail_address);
        addressTextView.setText(address);
        addressTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_location, 0, 0, 0);

        // If autoLink map does not work, add links to addressTextView
        SpannableString spanStr = new SpannableString(address);
        spanStr.setSpan(new UnderlineSpan(), 0, spanStr.length(), 0);
        addressTextView.setText(spanStr);

        // Set a click listener to start geoIntent when address is clicked on
        addressTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="
                        +addressTextView.getText().toString()));
                startActivity(geoIntent);
            }
        });

        TextView transportTextView = findViewById(R.id.detail_transport);
        transportTextView.setText(transport);
        transportTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_subway, 0, 0, 0);

        TextView phoneTextView = findViewById(R.id.detail_phone);
        phoneTextView.setText(phone);
        phoneTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_call, 0, 0, 0);

        TextView webTextView = findViewById(R.id.detail_web);
        webTextView.setText(web);
        webTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_public, 0, 0, 0);

        TextView hoursTextView = findViewById(R.id.detail_hours);
        hoursTextView.setText(hours);
        hoursTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_time, 0, 0, 0);

        TextView feeTextView = findViewById(R.id.detail_fee);
        feeTextView.setText(fee);
        feeTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_monetization, 0, 0, 0);
    }
}
