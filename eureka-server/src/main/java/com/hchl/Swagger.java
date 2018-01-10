//package com.hchl;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//
///**
// * 类 编 号：
// * 类 名 称：
// * 内容摘要：
// * 创建日期：2017/10/23
// * 编码作者：hcl
// */
//@EnableSwagger2 // 启用Swagger2
//@Configuration
//public class Swagger
//{
//
//    @Bean
//    public Docket createRestApi()
//    {// 创建API基本信息
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
//                // 扫描该包下的所有需要在Swagger中展示的API，@ApiIgnore注解标注的除外
//                .apis(RequestHandlerSelectors.basePackage("com.hchl"))
//                .paths(PathSelectors.any()).build();
//    }
//
//    private ApiInfo apiInfo()
//    {// 创建API的基本信息，这些信息会在Swagger UI中进行显示
//        // API 标题
//        return new ApiInfoBuilder().title("Spring Boot中使用Swagger2构建RESTful APIs")
//                // API描述
//                .description("rdcloud-jpa提供的RESTful APIs")
//                // 联系人
//                .contact("huangcl@ap-ec.com")
//                // 版本号
//                .version("1.0")
//                .build();
//    }
//}
