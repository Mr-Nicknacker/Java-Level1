package ru.geekbrains.Lesson6;

public class Animal {
    String name="";
    String color="";
    int age=1;

    public Animal (String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public void canItRun(float trackLength, float limitLength){
        System.out.printf("%s Результат: run: %b", name, trackLength<=limitLength);
    }
    public void canItSwim(float poolLength, float limitPoolLength){
        System.out.printf("%s Результат: swim: %b", name, poolLength<=limitPoolLength);
    }
    public void canItJump(float jumpHeight, float limitJumpHeight){
        System.out.printf("%s Результат: jump: %b", name, jumpHeight<=limitJumpHeight);
    }
    public void animalInfo(float limitLength, float limitPoolLength, float limitJumpHeight){
        System.out.println("Кличка: "+this.name);
        System.out.println("Окрас: "+this.color);
        System.out.println("Возраст: "+this.age);
        System.out.println("Может пробежать: " + limitLength + " метра");
        if (limitPoolLength>0) {
            System.out.println("Может проплыть: " + limitPoolLength + " метра");
        }
        else{
            System.out.println("Животное не умеет плавать");
        }
        System.out.println("Может перепрыгнуть: " + limitJumpHeight + " метра");
        System.out.println();
    }
    public void animalInfo(){
        System.out.println("Кличка: "+this.name);
        System.out.println("Окрас: "+this.color);
        System.out.println("Возраст: "+this.age);
        System.out.println();
    }
}
