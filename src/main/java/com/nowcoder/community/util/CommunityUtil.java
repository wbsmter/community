package com.nowcoder.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

public class CommunityUtil {
    // 生成随机字符串

    public static String geterateUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
    // MD5加密
    public static String md5(String salt){
        if(StringUtils.isBlank(salt)){
            return null;
        }
        return DigestUtils.md5DigestAsHex(salt.getBytes());
    }

}
