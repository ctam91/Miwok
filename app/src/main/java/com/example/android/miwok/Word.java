package com.example.android.miwok;

/**
 * {@Link Word} represents the vocabulary word that the user wants to learn
 * It contains a default translation and a Miwok translation for that word
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioId;
    private boolean mHasImage = false;

    /**
     * Class constructor that takes in three parameters
     * @param defaultTranslation is the default word user is trying to translate
     * @param miwokTranslation is the miwok word user is trying to translate
     * @param audioId is audio file associate with word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioId = audioId;
    }

    /**
     * Class constructor that takes in three parameters
     * @param defaultTranslation is the word that the user is trying to translate
     * @param miwokTranslation is the Miwok word the user is trying to translate
     * @param imageResourceId the image associated with the word
     * @param audioId audio filed of word pronounciation
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioId = audioId;
        mHasImage = true;
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
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Gets the image resource id
     * @return image id
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Checks to see if a word has an image
     * @return true or false if word has image
     */
    public boolean hasImage(){
        return mHasImage;
    }

    /**
     * Gets the audio resource id
     * @return the audio id
     */
    public int getAudioId(){
        return mAudioId;
    }
}
