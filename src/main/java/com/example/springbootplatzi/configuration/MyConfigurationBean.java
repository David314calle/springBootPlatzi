package com.example.springbootplatzi.configuration;

import com.example.springbootplatzi.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public IMyBean beanOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public IMyOperation beanOperationOperation() {
        return new MyOperationImplement();
    }

    @Bean
    public IMyBeanDependency beanOperationOperationWithDependency(IMyOperation iMyOperation) {
        return new MyBeanWithDependencyImplement(iMyOperation);
    }
}
