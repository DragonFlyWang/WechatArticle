package com.wang.flynn.wechatarticle;

/**
 * Created by Flynn on 26/09/2016.
 */

public class Article {
    private String id;
    private String title;
    private String source;
    private String firstImage;
    private String mark;
    private String url;

    public Article(String id, String title, String source, String firstImage, String mark, String url) {
        this.id = id;
        this.title = title;
        this.source = source;
        this.firstImage = firstImage;
        this.mark = mark;
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

    public String getMark() {
        return this.mark;
    }
    public String getUrl() {
        return this.url;
    }
}
