package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PhraseAdapter} is an {@link ArrayAdapter} that can provide a layout for each list view item
 */
public class PhraseAdapter extends ArrayAdapter<Phrase> {

    public PhraseAdapter(Activity context, ArrayList<Phrase> phrases) {
        super(context, 0, phrases);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Phrase} object located at this position in the list
        Phrase currentPhrase = getItem(position);

        TextView pronunciationTextView = listItemView.findViewById(R.id.pronunciation_list);
        TextView englishTextView = listItemView.findViewById(R.id.english_list);
        TextView koreanTextView = listItemView.findViewById(R.id.korean_list);

        pronunciationTextView.setText(currentPhrase.getPronunciation());
        englishTextView.setText(currentPhrase.getEnglishTranslation());
        koreanTextView.setText(currentPhrase.getKoreanTranslation());

        return listItemView;
    }
}
