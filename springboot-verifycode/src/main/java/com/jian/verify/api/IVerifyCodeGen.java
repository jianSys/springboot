package com.jian.verify.api;

import com.jian.verify.pojo.VerifyCode;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @ProjectName: springboot
 * @ClassName: IVerifyCodeGen
 * @Author: jian
 * @Description: 验证码生成接口
 * @Date: 2021/7/15 11:20
 * @Version: 1.0
 */
public interface IVerifyCodeGen {
    /**
     * 生成验证码并返回code，将图片写的os中
     *
     * @param width
     * @param height
     * @param os
     * @return
     * @throws IOException
     */
    String generate(int width, int height, OutputStream os) throws IOException;

    /**
     * 生成验证码对象
     *
     * @param width
     * @param height
     * @return
     * @throws IOException
     */
    VerifyCode generate(int width, int height) throws IOException;
}
