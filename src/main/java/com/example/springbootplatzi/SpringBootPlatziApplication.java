package com.example.springbootplatzi;

import com.example.springbootplatzi.component.IComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootPlatziApplication implements CommandLineRunner {

    private IComponentDependency componentDependency;
@Autowired
    public SpringBootPlatziApplication(IComponentDependency componentDependency){
        this.componentDependency = componentDependency;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPlatziApplication.class, args);
    }

    @Override
    public void run(String... args)  {
    componentDependency.saludar();
    }
}
