package ru.geekbrains.Lesson2;

//Разбираем switch, for

public class Main {

    public static void main(String[] args) {
        printFromNumber(5);
        System.out.println(factorial(10));
        printAllValuesDesc(10);
        multiValuesCycle();
        String[] strings = {"A", "B", "C", "D"};
        printArrayValues(strings);
        printEnclosedCycles();
        showWhileCycles();
        showUsualArrays();
        printMultidimensionalArray();
    }

    static void printFromNumber(int number){
        switch(number){ //без break и с number=1 зайдёт в каждый кейс и отработает.
            case 1: {
                System.out.println(("a==1"));
                break;
            }
            case 5:{
                System.out.println("a==5");
                break;
            }
            default:{
                System.out.println("a = "+number);
                break;
            }
        }
        String string = "hello";
        switch (string){
            case "Bye":{
                //...
            }
        }
    }

    static int factorial(int max){
        int result = 1;
        for (int i = 1; i <= max; i++){
            result *= i;
        }
        return result;
    }
    static void printAllValuesDesc(int value){
        for (;value >= 0; value --){
            System.out.println("Value: " +value);
        }
    }
    static void multiValuesCycle(){
        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("Current i state: "+i);
        }
    }
    static void infiniteCycle(){
        for(;;){
            System.out.println("Infinite cycle!");
        }
    }
    static void printArrayValues(String[] strings){
        for (String str : strings) {
            System.out.println(str);
        }
    }
    static void  printEnclosedCycles(){
        for (int i = 0; i<3; i++){
            for (int j=0;j<3;j++){
                System.out.println("i = "+ i +", j = " + j);
            }
        }
    }
    static void showWhileCycles(){
        int i=10;
        while (i<100){
            System.out.println((i));
            i++;
        }
        do{
            i--;
            System.out.println(i);
        } while (i>0);
    }
    static void showUsualArrays(){
        String[] string1 = {"A", "B", "C"};
        String[] string2 = new String[3];
        string2[0]="A";
        string2[1]="B";
        string2[2]="C";

        int[] values = {10,25,389,245};
        int[] values1 = new int[4];
        values1[0]=10;
        values1[0]=25;
        values1[0]=389;
        values1[0]=245;
    }
    static void printMultidimensionalArray(){
        int counter=1;
        int[][] array = new int[3][4];
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = counter++;
                System.out.println("2dim-Array: "+array[i][j]);
            }
        }
        System.out.println("Размер внешнего массива: "+array.length);
        System.out.println("Размер внутреннего массива: "+array[0].length);
        int[][] array1={
                {25,25,66,77},
                {24,2,6,7},
                {29,75,83,177}
        };
    }






    /*static int[] getArraysOfPositive(int[] values){
        int[] result = new int[100];
        int savedIndex=0;
        for (int i=0;i<values.length && savedIndex<result.length;i++, savedIndex++){

            if (values[i]>0){
                result = values[i];
            }
        }
    }*/
}
