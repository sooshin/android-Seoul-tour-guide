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
 * Created by sj on 11/23/2017.
 */

public class DetailActivity extends AppCompatActivity {

    private int imageId;
    private String name;
    private String description;
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
        setDetails(R.id.detail_fee, fee, R.drawable.ic_monetization);

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
