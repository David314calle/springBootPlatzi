package com.example.springbootplatzi.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ComponentTwoImplement implements IComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi componente 2");
    }
}
