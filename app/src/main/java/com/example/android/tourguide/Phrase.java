package com.example.android.tourguide;

/**
 * {@link Phrase} represents a phrase that tourist can use when traveling Seoul
 * It contains a pronunciation, an English translation, a Korean translation and audioResource
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
     Phrase(String pronunciation, String englishTranslation, String koreanTranslation, int audioResourceId) {
        mPronunciation = pronunciation;
        mEnglishTranslation = englishTranslation;
        mKoreanTranslation = koreanTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the pronunciation of the phrase.
     */
    String getPronunciation() {
        return mPronunciation;
    }

    /**
     * Get English translation of the phrase.
     */
    String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    /**
     * Get Korean translation of the phrase.
     */
    String getKoreanTranslation() {
        return mKoreanTranslation;
    }

    /**
     * Returns the audio resource Id of the phrase.
     */
    int getAudioResourceId() {
        return mAudioResourceId;
    }

}
