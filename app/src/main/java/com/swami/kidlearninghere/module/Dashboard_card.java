package com.swami.kidlearninghere.module;

public class Dashboard_card {

    private String title;
    private int firstImg,secondImg,lastImg,cardColor;

    public Dashboard_card(String title, int firstImg, int secondImg, int lastImg, int cardColor) {
        this.title = title;
        this.firstImg = firstImg;
        this.secondImg = secondImg;
        this.lastImg = lastImg;
        this.cardColor = cardColor;
    }

    public Dashboard_card(String title, int firstImg, int secondImg, int lastImg) {
        this.title = title;
        this.firstImg = firstImg;
        this.secondImg = secondImg;
        this.lastImg = lastImg;
    }

    public Dashboard_card() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFirstImg() {
        return firstImg;
    }

    public void setFirstImg(int firstImg) {
        this.firstImg = firstImg;
    }

    public int getSecondImg() {
        return secondImg;
    }

    public void setSecondImg(int secondImg) {
        this.secondImg = secondImg;
    }

    public int getLastImg() {
        return lastImg;
    }

    public void setLastImg(int lastImg) {
        this.lastImg = lastImg;
    }
}
