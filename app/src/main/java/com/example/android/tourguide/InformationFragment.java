package com.example.android.tourguide;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sj on 11/20/2017.
 */

public class InformationFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        // Set different textSize in one TextView
        TextView textView = rootView.findViewById(R.id.seoul_des);
        Spannable span = new SpannableString(textView.getText());
        span.setSpan(new RelativeSizeSpan(1.8f), 0,5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(span);
        return rootView;
    }
}
