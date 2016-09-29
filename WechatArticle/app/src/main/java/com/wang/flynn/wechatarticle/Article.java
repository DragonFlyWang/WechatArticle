package com.wang.flynn.wechatarticle;

import android.nfc.tech.IsoDep;

/**
 * Created by Flynn on 26/09/2016.
 */

public class Article {
    private String id;
    private String title;
    private String source;
    private String firstImage;
    //private String mark;
    private String url;

    public Article() {

    }

    public Article(String id, String title, String source, String firstImage, String mark, String url) {
        this.id = id;
        this.title = title;
        this.source = source;
        this.firstImage = firstImage;
        //this.mark = mark;
        this.url = url;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSource() {
        return this.source;
    }

    public String getFirstImage() {
        return this.firstImage;
    }

//    public String getMark() {
//        return this.mark;
//    }
    public String getUrl() {
        return this.url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
