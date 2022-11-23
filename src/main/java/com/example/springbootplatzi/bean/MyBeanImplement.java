package com.example.springbootplatzi.bean;

public class MyBeanImplement implements IMyBean {

    @Override
    public void print() {
        System.out.println("Hola desde mi implementacion Bean");
    }
}
