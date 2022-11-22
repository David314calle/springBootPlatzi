package com.example.springbootplatzi.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class componentImplement implements IComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi componente");
    }
}
