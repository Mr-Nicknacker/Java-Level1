package ru.geekbrains.Lesson6;

import java.util.Random;

public class Dog extends Animal {
//    private final float RUN_LIMIT=500;
//    private final float SWIM_LIMIT=10;
//    private final float JUMP_LIMIT=0.5f;
    private Random limit = new Random();
    private float limitTrackLength =limit.nextFloat()*1600+400; //дистанция до 2-х километров
    private float limitPoolLength=limit.nextFloat()*14+1; //плавает до 15 метров
    private float limitJumpHeight=(limit.nextFloat()*0.85f)+0.15f; //прыжок до метра

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public void run(float trackLength){
        canItRun(trackLength, limitTrackLength);
        System.out.println();
    }
    public void swim (float poolLength){
        canItSwim(poolLength,limitPoolLength);
        System.out.println();
    }
    public void jump (float jumpHeight){
        canItJump(jumpHeight,limitJumpHeight);
        System.out.println();
    }
    public void dogInfo() {
        animalInfo(limitTrackLength, limitPoolLength, limitJumpHeight);
    }
}
