package com.mytests.spring.springbootConfigpropsDiffModulePojo.springbootmodule;

import com.mytests.spring.springBootConfigpropsDiffModulePojo.libPojos.LibModelThree;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 5/7/2025.</p>
 * *
 */
@Configuration
public class UseLibClassAsConfigPropertiesBean {

    @Bean
    @ConfigurationProperties(prefix = "my.lib.config.bean")
    public LibModelThree libModelThree() {
        return new LibModelThree();
    }
}
