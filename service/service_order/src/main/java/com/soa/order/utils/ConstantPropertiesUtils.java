package com.soa.order.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ program: demo
 * @ description:
 * @ author: ShenBo
 * @ date: 2021-12-11 12:40:48
 */
@Component
public class ConstantPropertiesUtils implements InitializingBean {

    @Value("${weixin.appid}")
    private String appid;

    @Value("${weixin.partner}")
    private String partner;

    @Value("${weixin.partnerkey}")
    private String partnerkey;

    public static String APPID;
    public static String PARTNER;
    public static String PARTNERKEY;
    @Override
    public void afterPropertiesSet() throws Exception {
        APPID = appid;
        PARTNER = partner;
        PARTNERKEY = partnerkey;
    }
}
