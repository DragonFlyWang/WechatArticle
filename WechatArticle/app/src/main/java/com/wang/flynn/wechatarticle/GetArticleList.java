package com.wang.flynn.wechatarticle;

import java.net.URLEncoder;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * Created by Flynn on 26/09/2016.
 */

public class GetArticleList {
    private String response;
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
    public static final String APPKEY = "7afa1a201380d078e98ab494054c79c8";
    public static final String queryUrl = "http://v.juhe.cn/weixin/query";

    public static String getResponse() {
        StringBuilder sb = new StringBuilder(queryUrl);
        sb.append("?pno=&ps=&dtype=&key=");
        sb.append(APPKEY);
        String queryUrl = sb.toString();
        String returnStr = null;
        try {
            HttpClient client = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(queryUrl);
            HttpResponse response = client.execute(httpGet);
            if(response.getStatusLine().getStatusCode() == 200) {
                returnStr = EntityUtils.toString(response.getEntity());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return returnStr;
    }
}
