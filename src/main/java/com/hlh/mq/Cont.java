package com.hlh.mq;

import com.aliyun.openservices.ons.api.PropertyKeyConst;

import java.util.Properties;

public class Cont {

    public static final String GROUP_ID = "GID_CloudMqTcp";
    public static final String AccessKey = "LTAI4Fw5t1RgT4VQqfW38KoV";
    public static final String SecretKey = "dfYcNpBDR74hVkH9H5kqnaaJGd0vNv";
    public static final String NAMESRV_ADDR = "http://MQ_INST_1387754893957752_BbvxSKWw.cn-hangzhou.mq-internal.aliyuncs.com:8080";

    public static Properties setPro(Properties properties) {
        // 您在控制台创建的 Group ID
        properties.put(PropertyKeyConst.GROUP_ID, Cont.GROUP_ID);
        // 鉴权用 AccessKeyId，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.AccessKey, Cont.AccessKey);
        // 鉴权用 AccessKeySecret，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.SecretKey, Cont.SecretKey);
        // 设置 TCP 接入域名，进入控制台的实例管理页面，在页面上方选择实例后，在实例信息中的“获取接入点信息”区域查看
        properties.put(PropertyKeyConst.NAMESRV_ADDR, Cont.NAMESRV_ADDR);
        return properties;
    }



}
