package com.jian.verify.controller;

import com.jian.verify.api.IVerifyCodeGen;
import com.jian.verify.pojo.VerifyCode;
import com.jian.verify.service.SimpleCharVerifyCodeGen;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: springboot
 * @ClassName: VerifyController
 * @Author: jian
 * @Description:
 * @Date: 2021/7/15 11:13
 * @Version: 1.0
 */
@Controller
public class VerifyController {

    @GetMapping("/code")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response) {
    IVerifyCodeGen codeGen = new SimpleCharVerifyCodeGen();
    try {
//设置长宽
        VerifyCode verifyCode = codeGen.generate(80, 28);
        String code = verifyCode.getCode();

//将VerifyCode绑定session
        request.getSession().setAttribute("VerifyCode", code);
//设置响应头
        response.setHeader("Pragma", "no-cache");
//设置响应头
        response.setHeader("Cache-Control", "no-cache");
//在代理服务器端防止缓冲
        response.setDateHeader("Expires", 0);
//设置响应内容类型
        response.setContentType("image/jpeg");
        response.getOutputStream().write(verifyCode.getImgBytes());
        response.getOutputStream().flush();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
