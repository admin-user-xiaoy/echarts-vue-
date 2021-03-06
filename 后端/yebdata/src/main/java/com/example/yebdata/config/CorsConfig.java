package com.example.yebdata.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig  implements WebMvcConfigurer {
   public  void addCorsMappings(CorsRegistry registry){
       WebMvcConfigurer.super.addCorsMappings(registry);
       registry.addMapping("/**")
               .allowedOriginPatterns("*")
               .allowedHeaders(CorsConfiguration.ALL)
               .allowedMethods(CorsConfiguration.ALL)
               .allowCredentials(true)
               .maxAge(3600);
   }


}
