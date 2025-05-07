package com.mytests.spring.springbootConfigpropsDiffModulePojo.springbootmodule;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootModuleApplication.class, args);
    }
    @Bean
        public CommandLineRunner commandLineRunner(UseNestedPojoFromLib useNestedPojoFromLib) {
            return args -> {
                System.out.println("--------------------------------------");
                System.out.println(useNestedPojoFromLib.getLibModelOne().getId());
                System.out.println("--------------------------------------");
            };
        }
}
