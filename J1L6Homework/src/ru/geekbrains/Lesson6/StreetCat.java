package ru.geekbrains.Lesson6;

public class StreetCat extends Animal implements IProcureFood {
    public StreetCat(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public void findFood() {
        System.out.println("Дворовой кот копается в мусорке в поиске еды");
    }
}
