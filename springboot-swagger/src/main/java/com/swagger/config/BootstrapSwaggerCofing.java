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
 * @ClassName: BootstrapSwaggerCofing
 * @Author: jian
 * @Description:
 * @Date: 2021/8/5 14:44
 * @Version: 1.0
 */
@Configuration
@EnableSwagger2
public class BootstrapSwaggerCofing {

    @Bean
    public Docket bootstrapApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("bootstrap") // 定义分组,默认default
                .apiInfo(bootstrapApiInfo())// 调用apiInfo方法,创建一个ApiInfo实例,里面是展示在文档页面信息内容
                .select()// 创建ApiSelectorBuilder对象
                .apis(RequestHandlerSelectors.basePackage("com.swagger.controller"))// apis()指定扫描的包生成文档
                .paths(PathSelectors.any())// 对所有api进行监控
                .build();
    }

    private ApiInfo bootstrapApiInfo() {
        return new ApiInfoBuilder().title("SpringBoot整合Swagger构建API文档")// 大标题
                .description("简单优雅的restfun风格,https://gitee.com/qiuka/springboot")// 详细描述
                .version("1.0.0")// 版本
                .build();
    }

}
