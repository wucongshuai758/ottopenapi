package com.youku.ott.openapi.sdk.util;

import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Map;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午6:09 2019/8/21 Modifyby:
 **/
public class OttOpenapiSignatureUtil {

    private static final char[] HEX_CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};


    public static String getSignStr(Map<String, Object> map) {
        try {
            StringBuffer signString = new StringBuffer();
            for (String key : map.keySet()) {
                if (!key.equals("sign")) {
                    signString.append(key).append("=").append(URLEncoder.encode(map.get(key).toString(), "UTF-8"))
                        .append("&");
                }
            }
            return signString.toString();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String md5Sign(String signStr,String secret) {
        try {
            signStr = signStr+"secret="+secret;
            byte[] dataByte = signStr.getBytes("UTF-8");
            MessageDigest messageDigest =  MessageDigest.getInstance("MD5");
            byte[] bytes = messageDigest.digest(dataByte);
            char[] hexDigest = encodeHex(bytes);
            return new String(hexDigest);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static char[] encodeHex(byte[] bytes) {
        char[] chars = new char[32];

        for(int i = 0; i < chars.length; i += 2) {
            byte b = bytes[i / 2];
            chars[i] = HEX_CHARS[b >>> 4 & 15];
            chars[i + 1] = HEX_CHARS[b & 15];
        }

        return chars;
    }

}
