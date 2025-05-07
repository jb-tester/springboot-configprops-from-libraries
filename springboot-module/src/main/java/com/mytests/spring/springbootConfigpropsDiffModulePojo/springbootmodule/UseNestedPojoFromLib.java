package com.mytests.spring.springbootConfigpropsDiffModulePojo.springbootmodule;

import com.mytests.spring.springBootConfigpropsDiffModulePojo.libPojos.LibModelOne;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@ConfigurationProperties("my.lib.nested.pojo")
public class UseNestedPojoFromLib {

    @NestedConfigurationProperty
    private LibModelOne LibModelOne;

    private List<LibModelOne> LibModelOnes;

    public LibModelOne getLibModelOne() {
        return LibModelOne;
    }

    public void setLibModelOne(LibModelOne LibModelOne) {
        this.LibModelOne = LibModelOne;
    }

    public List<LibModelOne> getLibModelOnes() {
        return LibModelOnes;
    }

    public void setLibModelOnes(List<LibModelOne> LibModelOnes) {
        this.LibModelOnes = LibModelOnes;
    }
}
