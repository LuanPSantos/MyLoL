package com.trainee.mylol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MylolConfiguration implements WebMvcConfigurer {
    
    @Value("${mylol.url.static.folder}")
    private String resourceLocation;
    @Value("${mylol.url.static.path}")
    private String staticPath;
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(staticPath + "**")
                .addResourceLocations(resourceLocation);
    }
}
