package com.example.android.tourguide;

/**
 * Created by sj on 11/26/2017.
 */

public class Phrase {

    /** Pronunciation for the phrases */
    private String mPronunciation;

    /** English translation for the phrases */
    private String mEnglishTranslation;

    /** Korean translation for the phrases */
    private String mKoreanTranslation;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /** Create a new Phrase object.
     *
     * @param pronunciation is Korean pronunciation
     * @param englishTranslation is the phrase in English.
     * @param koreanTranslation is the phrase in Korean.
     * @param audioResourceId is the resourde ID for the audio file associated with this word
     */
    public Phrase(String pronunciation, String englishTranslation, String koreanTranslation, int audioResourceId) {
        mPronunciation = pronunciation;
        mEnglishTranslation = englishTranslation;
        mKoreanTranslation = koreanTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the pronunciation of the phrase.
     */
    public String getPronunciation() {
        return mPronunciation;
    }

    /**
     * Get English translation of the phrase.
     */
    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    /**
     * Get Korean translation of the phrase.
     */
    public String getKoreanTranslation() {
        return mKoreanTranslation;
    }

    /**
     * Returns the audio resource Id of the phrase.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}
