package cn.ioms.dubbo.consumer.config;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.DigestUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Swagger配置
 */
@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages = {"cn.ioms.dubbo.consumer.controller"})
//必须存在 扫描的API Controller package name 也可以直接扫描class (basePackageClasses)
public class SwaggerConfig extends WebMvcConfigurerAdapter {
    @Bean
    public Docket api() {
        /*String key = "IOMS.CN";

        String AppToken = "IOMS/1.0/mobile/uuid/" + System.currentTimeMillis();
        String[] strarray = AppToken.split("/");
        String sign = DigestUtils.md5DigestAsHex((strarray[1] + strarray[3] + strarray[4] + key).getBytes());
        //添加请求信息
        List<Parameter> pars = new ArrayList<Parameter>();
        //添加sign
        ParameterBuilder signPar = new ParameterBuilder();
        signPar.name("sign").defaultValue(sign).description("签名").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        //添加AppToken
        ParameterBuilder appToenPar = new ParameterBuilder();
        appToenPar.name("AppToken").defaultValue(AppToken).description("appToken").modelRef(new ModelRef("string")).parameterType("header").required(false).build();

        pars.add(signPar.build());
        pars.add(appToenPar.build());*/

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
//                .globalOperationParameters(pars)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Dubbo-demo API 手册")
                .description("Dubbo-demo API 手册")
                .version("1.0")
                .termsOfServiceUrl("Terms of service")
                .license("IOMS")
                .build();
        return apiInfo;
    }
}