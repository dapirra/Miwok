package com.example.android.miwok;

public class Word {

    private String englishWord;
    private String miwokWord;
    private int imageID = NO_IMAGE_PROVIDED;
    private int miwokPronunciation;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String englishWord, String miwokWord, int miwokPronunciation) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.miwokPronunciation = miwokPronunciation;
    }

    public Word(String englishWord, String miwokWord, int imageID, int miwokPronunciation) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.imageID = imageID;
        this.miwokPronunciation = miwokPronunciation;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public boolean hasImage() {
        return imageID != NO_IMAGE_PROVIDED;
    }

    public int getMiwokPronunciation() {
        return miwokPronunciation;
    }

    public void setMiwokPronunciation(int miwokPronunciation) {
        this.miwokPronunciation = miwokPronunciation;
    }

    @Override
    public String toString() {
        return "Word{" +
                "englishWord='" + englishWord + '\'' +
                ", miwokWord='" + miwokWord + '\'' +
                ", imageID=" + imageID +
                ", miwokPronunciation=" + miwokPronunciation +
                '}';
    }
}
