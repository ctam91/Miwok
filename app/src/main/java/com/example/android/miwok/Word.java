package com.example.android.miwok;

/**
 * {@Link Word} represents the vocabulary word that the user wants to learn
 * It contains a default translation and a Miwok translation for that word
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    /**
     * Class constructor
     * @param defaultTranslation is the default word user is trying to translate
     * @param miwokTranslation is the miwok word user is trying to translate
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of word
     * @return the detfault translation
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of word
     * @return return the Miwok translation
     */
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
