package ru.geekbrains.Lesson6;

public class HomeCat extends Animal implements IProcureFood {
    public HomeCat(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public void findFood() {
        System.out.println("Домашний кот идёт к миске посмотреть что в ней лежит вкусного");
    }
}
