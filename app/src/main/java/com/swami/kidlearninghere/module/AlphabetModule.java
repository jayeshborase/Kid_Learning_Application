package com.swami.kidlearninghere.module;

public class AlphabetModule {
    private String letter;
    private int pic;

    public AlphabetModule(String letter, int pic) {
        this.letter = letter;
        this.pic = pic;
    }

    public AlphabetModule() {
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
