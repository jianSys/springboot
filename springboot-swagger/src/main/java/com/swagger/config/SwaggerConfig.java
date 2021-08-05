package com.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: springboot
 * @ClassName: SwaggerConfig
 * @Author: jian
 * @Description: swagger配置类
 * @Date: 2021/8/5 14:33
 * @Version: 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig{
    @Bean
    public Docket apiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                // .pathMapping("/user")//最终调用接口后会和paths拼接在一起
                // .useDefaultResponseMessages(false)//关闭默认返回值
                .groupName("MYAPI") // 定义分组,默认default
                .apiInfo(apiInfo())// 调用apiInfo方法,创建一个ApiInfo实例,里面是展示在文档页面信息内容
                .select()// 创建ApiSelectorBuilder对象
                .apis(RequestHandlerSelectors.basePackage("com.swagger.controller"))// apis()指定扫描的包生成文档
                .paths(PathSelectors.any())
                // .paths(PathSelectors.ant("/user/**"))//选定api的路径
                // .paths(Predicates.or(PathSelectors.regex("/user/.*")))//过滤的接口
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("SpringBoot整合Swagger构建API文档")// 大标题
                .description("简单优雅的restfun风格,https://gitee.com/qiuka/springboot")// 详细描述
                .version("1.0.0")// 版本
                // .termsOfServiceUrl("https://www.baidu.com/")//服务条款
                // .contact(new Contact("qiukang","https://gitee.com/qiuka/springboot","931750352@qq.com"))//作者
                // .license("The Apache License, Version 2.0")//许可证信息
                // .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")//许可证地址
                .build();
    }
}
