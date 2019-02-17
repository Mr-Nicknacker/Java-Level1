package ru.geekbrains.Lesson6;

public class Human implements IProcureFood {
    @Override
    public void findFood() {
        System.out.println("Человек заглядывает в холодильник");
    }
}
