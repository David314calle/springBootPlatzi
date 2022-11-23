package com.example.springbootplatzi.bean;

public class MyOperationImplement implements IMyOperation {
    @Override
    public int sum(int number) {
        return number+1;
    }
}
