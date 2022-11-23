package com.example.springbootplatzi.bean;

public class MyBeanWithDependencyImplement implements IMyBeanDependency{

    private IMyOperation iMyOperation;

    public MyBeanWithDependencyImplement(IMyOperation iMyOperation) {
        this.iMyOperation = iMyOperation;
    }

    @Override
    public void printWithDependency() {
        System.out.println(iMyOperation.sum(5));
        System.out.println("Hola desde la implemtacion de un bean con dependencia");
    }
}
