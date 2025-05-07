package com.mytests.spring.springbootConfigpropsDiffModulePojo.springbootmodule;

import com.mytests.spring.springBootConfigpropsDiffModulePojo.libPojos.LibModelTwo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "my.lib.parent.class")
public class UseParentClassFromLib extends LibModelTwo {

}
