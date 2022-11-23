package com.example.springbootplatzi;

import com.example.springbootplatzi.bean.IMyBean;
import com.example.springbootplatzi.bean.IMyBeanDependency;
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
    private IMyBean iMyBean;

    private IMyBeanDependency iMyBeanDependency;
@Autowired
    public SpringBootPlatziApplication(IComponentDependency componentDependency, IMyBean myBean, IMyBeanDependency myBeanDependency){
        this.componentDependency = componentDependency;
        this.iMyBean = myBean;
        this.iMyBeanDependency = myBeanDependency;

    }

    public static void main(String[] args) {
    SpringApplication.run(SpringBootPlatziApplication.class, args);
    }

    @Override
    public void run(String... args)  {
    componentDependency.saludar();
    iMyBean.print();
    iMyBeanDependency.printWithDependency();
    }


}
