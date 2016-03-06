package com.fiona.tiaozao;

import android.app.Application;

/**
 * Created by fiona on 16-3-4.
 */
public class App extends Application {

    public final static String URL = "http://172.19.201.79:8080/";    //请求地址

    /**
     * 数据请求Servlet
     */
    public final static String GOODS_SERVLET = "Flea/GoodsServlet";
    public final static String USER_SERVLET = "Flea/UserServlet";
    public final static String CLASSIFY_SERVLET = "Flea/ClassifyServlet";
    public final static String GOODS_OPERATE_SERVLET = "Flea/GoodsOperateServlet";
    public final static String USER_OPERATE_SERVLET = "Flea/UserOperateServlet";

    public final static int GOODS_SALE = 0x01;        //消息处理
    public final static int GOODS_EMPTION = 0x02;
    public final static int USER = 0x51;

    public final static String ACTION_GOODS = "goods";   //意图携带的数据
    public final static String ACTION_USER = "user";

    public final static int REQUEST_PICK_PICTURE=0x118;  //本地选择图片
    public final static int REQUEST_CAPTURE=0x119;       //拍照


    /**
     * 程序启动
     */
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
