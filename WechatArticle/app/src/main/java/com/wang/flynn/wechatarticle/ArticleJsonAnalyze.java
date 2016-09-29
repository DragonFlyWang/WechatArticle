package com.wang.flynn.wechatarticle;

import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Flynn on 29/09/2016.
 */

public class ArticleJsonAnalyze {

    public static List<Article> getArticles(String json) {
        List<Article> articleList = new ArrayList<>();
        String[] articles = json.split(Pattern.quote("},"));
        for (String article: articles
             ) {
            article = article.substring(1);
            Article a = new Article();
            String[] components = article.split(",");
            for (String component: components
                 ) {
                String category = component.substring(1, component.indexOf(":") - 1);
                String content = component.substring(component.indexOf(":") + 1, component.length() - 1);
                switch (category) {
                    case "firstImg":
                        a.setFirstImage(content);
                        break;
                    case "id":
                        a.setId(content);
                        break;
                    case "source":
                        a.setSource(content);
                        break;
                    case "title":
                        a.setTitle(content);
                        break;
                    case "url":
                        a.setUrl(content);
                        break;
                }
            }
            articleList.add(a);
        }
        return articleList;
    }
}
