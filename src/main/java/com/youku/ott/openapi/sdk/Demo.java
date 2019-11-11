package com.youku.ott.openapi.sdk;

import com.youku.ott.openapi.sdk.request.CommonOttOpenapiResquest;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午11:03 2019/8/21 Modifyby:
 **/
public class Demo {
    private static String serverUrl = "https://pre-ott-api.youku.com/gateway/gateway.do";
    private static String appKey = "***";
    private static  String appSecret = "***";
    private static String signType = "MD5";
    private static String methodName = "com.youku.ott.spnet.spnetplay";
    private static DefaultOttOpenapiClient defaultOttOpenapiClient = new DefaultOttOpenapiClient(serverUrl,appKey,appSecret,signType);
    public static void main(String[] args) {
        httpPost();

    }



    public static void testMeizi(String methodName,String bizParam) {
        try {
            CommonOttOpenapiResquest commonOttOpenapiResquest = new CommonOttOpenapiResquest();
            commonOttOpenapiResquest.setApiMethodName(methodName);
            commonOttOpenapiResquest.setBizParam(bizParam);
            OttOpenapiResponse ottOpenapiResponse = defaultOttOpenapiClient.execute(commonOttOpenapiResquest);
            System.out.println("ottOpenapiResponse :"+ottOpenapiResponse.getBizResp());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void httpPost() {
        String bizParam = "{\n"
            + " \"ip\":\"10.211.55.4\","
            + "  \"spId\":\"jsyd\",\n"
            + "  \"cdnId\":2,\n"
            + "  \"showId\":\"70a1bb68148d11e5b2ad\",\n"
            + "  \"videoCode\":\"XMTMxOTkyMzg3Mg==\",\n"
            + "  \"ccode\":\"123123\",\n"
            + "  \"h265\":0,\n"
            + "  \"encryptRClient\":\"123\",\n"
            + "  \"property\":\"{}\",\n"
            + "  \"upsParamJson\":\"{\\\"ckey\\\":\\\"0oPa_PebOV7dPbK"
            +
            "+07bd3CEWJmA660HEZW2eubj1K8DlVdGbnlu6dYTjaQgUDYZ4HeibaGo7exZDRVaXNjqceXBb8lNALR9XUW4LkIJtaHemnUVyVccZRhR"
            + "/s+s1z5LyCzowQ2tv7OvdPFOcUtIzwgQQRG1pWNQcYo5EUGOkVN//yRlS26zHHWMMzSWixo7G9q3IrlUutNtrfH2X62ScKJfLS4Q"
            + "==&cyav_a00120f7e89dab63e470b4e4f77d817320072a2e11190\\\",\\\"client_ip\\\":\\\"192.168.2.107\\\","
            + "\\\"client_ts\\\":\\\"1566978067\\\",\\\"utid\\\":\\\"VKSObhk57gIDAHFLYhV6V/s7\\\","
            + "\\\"ccode\\\":\\\"0103010103\\\",\\\"encryptR_client\\\":\\\"Xy5vuy3VBbaYpuny9ltFjQ==\\\","
            + "\\\"key_index\\\":\\\"key01\\\",\\\"vid\\\":\\\"XNDMwMjg1ODE5Ng==\\\","
            + "\\\"tmall_pid\\\":\\\"27e1c81c8ac57dd8\\\",\\\"showid\\\":\\\"\\\",\\\"show_videoseq\\\":\\\"\\\","
            + "\\\"h265\\\":\\\"1\\\",\\\"client_id\\\":\\\"\\\",\\\"ptoken\\\":\\\"\\\","
            +
            "\\\"stoken\\\":\\\"MS4wLjB8MjAxODA3MzBBUFAwMDMxMDF8ZWMwNDE3NGU4YmI2MTZaQnxWS1NPYmhrNTdnSURBSEZMWWhWNlYvczd8MTU2Njk3Nzg5MzAwMHw5MDk1NTgyMDJ8WXVuT1N8Ni4xLjAtUlMtMjAxOTAxMTUuMTAxM3wyMDE4MTEwMUFQUDAwNDQwMXwxQTc2QzI2QjYwMzMyOENEQkY4OEY2QjhCNTNBQjNFOQ%3D%3D\\\",\\\"atoken\\\":\\\"\\\",\\\"mac\\\":\\\"208B37ECA46E\\\",\\\"app_ver\\\":\\\"2120704126\\\",\\\"drm_type\\\":\\\"7\\\",\\\"device_name\\\":\\\"MagicBox_M13\\\",\\\"preferClarity\\\":\\\"4\\\",\\\"needad\\\":\\\"1\\\",\\\"pid\\\":\\\"27e1c81c8ac57dd8\\\",\\\"needbf\\\":\\\"2\\\",\\\"site\\\":\\\"1\\\",\\\"fu\\\":\\\"0\\\",\\\"wintype\\\":\\\"mdevice\\\",\\\"vs\\\":\\\"1.0\\\",\\\"os\\\":\\\"yunos\\\",\\\"osv\\\":\\\"6.1.0-RS-20190115.1013\\\",\\\"bt\\\":\\\"tv\\\",\\\"aw\\\":\\\"a\\\",\\\"rst\\\":\\\"m3u8\\\",\\\"p\\\":\\\"7\\\",\\\"bd\\\":\\\"MBX\\\",\\\"guid\\\":\\\"97633c13955611be08ae11c5e6b0d685\\\",\\\"net\\\":\\\"1000\\\",\\\"mdl\\\":\\\"MagicBox_M13\\\",\\\"dvw\\\":\\\"1920\\\",\\\"dvh\\\":\\\"1080\\\",\\\"dprm\\\":\\\"240\\\",\\\"box\\\":\\\"1\\\",\\\"aid\\\":\\\"c46924a1bc86f57a\\\",\\\"ss\\\":\\\"13.8\\\",\\\"isvert\\\":\\\"0\\\",\\\"uuid\\\":\\\"9BE98A634F90590299E2408A526DA6F3\\\",\\\"ss\\\":\\\"\\\",\\\"system_version\\\":\\\"\\\",\\\"source\\\":\\\"\\\",\\\"firmware_version\\\":\\\"6.1.0-RS-20190115.1013\\\",\\\"ps\\\":\\\"\\\",\\\"utdid\\\":\\\"VKSObhk57gIDAHFLYhV6V/s7\\\",\\\"avs\\\":\\\"7.4.1.26\\\",\\\"appc\\\":\\\"2\\\",\\\"aw\\\":\\\"a\\\",\\\"sver\\\":\\\"1.2.13\\\",\\\"license\\\":\\\"WASU\\\",\\\"pver\\\":\\\"1.8.12.13\\\",\\\"bd\\\":\\\"MBX\\\",\\\"dq\\\":\\\"hd2\\\",\\\"vc\\\":\\\"0\\\",\\\"sid\\\":\\\"025t5i2m1ktidk0kmk4vkks324\\\",\\\"bcp\\\":\\\"1\\\",\\\"ua\\\":\\\"OTTSDK;2.0.14.47;Android;6.1.0-RS-20190115.1013;MagicBox_M13\\\",\\\"sw\\\":\\\"sw1080\\\",\\\"pn\\\":\\\"com.youku.taitan.tv\\\",\\\"d\\\":\\\"XNDMwMjg1ODE5Ng==\\\",\\\"device_model\\\":\\\"MagicBox_M13\\\"}\"\n"
            + "}";
        try {
            CommonOttOpenapiResquest commonOttOpenapiResquest = new CommonOttOpenapiResquest();
            commonOttOpenapiResquest.setApiMethodName(methodName);
            commonOttOpenapiResquest.setBizParam(bizParam);
            OttOpenapiResponse ottOpenapiResponse = defaultOttOpenapiClient.execute(commonOttOpenapiResquest);
            System.out.println("ottOpenapiResponse :"+ottOpenapiResponse.getBizResp());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
