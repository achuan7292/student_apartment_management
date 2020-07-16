package com.admin.utils;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

import java.util.Random;

public class SendSms {
    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FpMnCEr5raX1UXamM1w", "q8X4HwDLDHsD6DZzFeJUV4TuiNHpBq");
        String scode = String.valueOf(new Random().nextInt(899999) + 100000);//生成验证码
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendBatchSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", "18834199721");//发送到的手机号
        request.putQueryParameter("SignName", "ithou注册验证码");//申请的模板
        request.putQueryParameter("TemplateCode", "SMS_173946449");//申请的模板
        request.putQueryParameter("TemplateParam", "{\"scode\":\"" + scode + "[有效期5分钟]" + "\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
