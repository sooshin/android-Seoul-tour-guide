package com.example.android.tourguide;

import android.app.Fragment;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link  Fragment} that displays a list of basic Korean phrases.
 */

public class KoreanFragment extends Fragment {

    /** Handles playback of all the sound files */
    private MediaPlayer mMediaPlayer;

    /** Handles audio focus when playing a sound file */
    private AudioManager mAudioManager;

    /** Handles ArrayList of Phrases */
    private ArrayList<Phrase> mPhrases;

    /**
     * This listener gets triggered whenever the audio focus changes.
     */
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {
                @Override
                public void onAudioFocusChange(int focusChange) {
                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                            focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                        // We'll treat both cases the same way because our app is playing short sound files.

                        // Pause playback and reset player to the start of the file. That way, we can
                        // play the word from the beginning when we resume playback.
                        mMediaPlayer.pause();
                        mMediaPlayer.seekTo(0);
                    } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                        // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
                        mMediaPlayer.start();
                    } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                        // The AUDIOFOCUS_LOSS case means we've lost audio focus and
                        // stop playback and clean up resources
                        releaseMediaPlayer();
                    }
                }
            };

    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed
     * playing the audio file.
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    public KoreanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_korean, container, false);

        // Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        // Create a list of phrases
        mPhrases = new ArrayList<>();

        // Add phrases to the list of phrases
        addPhrases();

        // Create a {link PhraseAdapter}, whose data source is a list of {@link Phrase}s.
        // The adapter knows how to create list items for each item in the list.
        PhraseAdapter phraseAdapter = new PhraseAdapter(getActivity(), mPhrases);

        // Find the {@link ListView} object
        ListView listView = rootView.findViewById(R.id.listview);

        // Make the recyclerView use the phraseAdapter
        listView.setAdapter(phraseAdapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file
                releaseMediaPlayer();

                // Get the {@link Phrase} object at the given position the user clicked on
                Phrase phrase = mPhrases.get(position);

                // Request audio focus so in order to play the audio file.
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.

                    // Create and setup the {@link MediaPlayer} for the audio resource associated
                    // with the current phrase
                    mMediaPlayer = MediaPlayer.create(getActivity(), phrase.getAudioResourceId());

                    // Start the audio file
                    mMediaPlayer.start();

                    // Setup a listener on the media player, so that we can stop and release the
                    // media player once the sound has finished playing.
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });

        return rootView;
    }

    /**
     * Add phrases to the list of phrases
     */
    private void addPhrases() {
        mPhrases.add(new Phrase(getString(R.string.hello_p),
                getString(R.string.hello),
                getString(R.string.hello_k),
                R.raw.hello));
        mPhrases.add(new Phrase(getString(R.string.nice_to_meet_you_p),
                getString(R.string.nice_to_meet_you),
                getString(R.string.nice_to_meet_you_k),
                R.raw.nice_to_meet_you));
        mPhrases.add(new Phrase(getString(R.string.thank_you_p),
                getString(R.string.thank_you),
                getString(R.string.thank_you_k),
                R.raw.thank_you));
        mPhrases.add(new Phrase(getString(R.string.good_bye_p),
                getString(R.string.good_bye),
                getString(R.string.good_bye_k),
                R.raw.good_bye));
        mPhrases.add(new Phrase(getString(R.string.i_am_sorry_p),
                getString(R.string.i_am_sorry),
                getString(R.string.i_am_sorry_k),
                R.raw.i_am_sorry));
        mPhrases.add(new Phrase(getString(R.string.how_much_is_this_p),
                getString(R.string.how_much_is_this),
                getString(R.string.how_much_is_this_k),
                R.raw.how_much_is_this));
        mPhrases.add(new Phrase(getString(R.string.picture_p),
                getString(R.string.picture),
                getString(R.string.picture_k),
                R.raw.picture));
        mPhrases.add(new Phrase(getString(R.string.where_is_the_restroom_p),
                getString(R.string.where_is_the_restroom),
                getString(R.string.where_is_the_restroom_k),
                R.raw.where_is_the_restroom));
        mPhrases.add(new Phrase(getString(R.string.how_to_get_to_gangnam_p),
                getString(R.string.how_to_get_to_gangnam),
                getString(R.string.how_to_get_to_gangnam_k),
                R.raw.how_to_get_to_gangnam));
        mPhrases.add(new Phrase(getString(R.string.how_far_p),
                getString(R.string.how_far),
                getString(R.string.how_far_k),
                R.raw.how_far_is_it));
    }

    @Override
    public void onStop() {
        super.onStop();

        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

            // Regardless of whether or not we were granted audio focus, abandon it. This also
            // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}
