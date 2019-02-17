package ru.geekbrains.Lesson6;

import java.util.Random;

public class Cat extends Animal {
//    private final double RUN_LIMIT=200;
//    private final double SWIM_LIMIT=-1;
//    private final double JUMP_LIMIT=2;
    private Random limit = new Random();
    private float limitTrackLength = limit.nextFloat()*200+70;
    private float limitJumpHeight = limit.nextFloat()*2.73f+0.27f;

    public Cat(String name, String color, int age){
        super(name, color, age);
    }
    public void run(float trackLength){
        canItRun(trackLength, limitTrackLength);
        System.out.println();
    }
    public void swim (float poolLength){
        canItSwim(poolLength,-1);
        System.out.println();
    }
    public void jump (float jumpHeight){
        canItJump(jumpHeight,limitJumpHeight);
        System.out.println();
    }
    public void catInfo(){
        animalInfo(limitTrackLength, -1, limitJumpHeight);
    }
}
