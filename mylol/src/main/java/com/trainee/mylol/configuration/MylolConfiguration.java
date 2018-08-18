package com.trainee.mylol.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MylolConfiguration implements WebMvcConfigurer {
    
    @Value("${mylol.url.static.folder.splash}")
    private String resourceLocationSplash;
    @Value("${mylol.url.static.path.splash}")
    private String staticPathSplash;
    
    @Value("${mylol.url.static.folder.profileicon}")
    private String resourceLocationProfileIcon;
    @Value("${mylol.url.static.path.profileicon}")
    private String staticPathProfileIcon;
    
    @Value("${mylol.url.static.folder.champion}")
    private String resourceLocationChampion;
    @Value("${mylol.url.static.path.champion}")
    private String staticPathChampion;
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(staticPathSplash + "**")
                .addResourceLocations(resourceLocationSplash);
        
        registry.addResourceHandler(staticPathProfileIcon + "**")
                .addResourceLocations(resourceLocationProfileIcon);
        
        registry.addResourceHandler(staticPathChampion + "**")
                .addResourceLocations(resourceLocationChampion);
    }
    
    
}
