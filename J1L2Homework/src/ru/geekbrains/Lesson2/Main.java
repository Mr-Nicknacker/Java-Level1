package ru.geekbrains.Lesson2;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[8];
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] largeArray = new int[5][5];
        int[] arrToShift = {1,2,3,4,5,6};
        //int[] arrToSum = {2,2,2,1,2,2};
        int[] arrToSum = {1,1,1};

//ЗАДАНИЕ 1
        System.out.println("Задание 1");
        initializeNewArray(array);
        System.out.print("Initial array: ");
        printArray(array);
        array=swapDigits(array);
        System.out.print("\nModified array: ");
        printArray(array);
//ЗАДАНИЕ 2
        System.out.println("\n\nЗадание 2");
        array2=fillArrayWithNumbers(array2);
        System.out.print("Initialized array2: ");
        printArray(array2);
//ЗАДАНИЕ 3
        System.out.println("\n\nЗадание 3");
        System.out.print("Initial array3: ");
        printArray(array3);
        array3=multiplyNumbersInArray(array3);
        System.out.print("\nChanged array3: ");
        printArray(array3);
//ЗАДАНИЕ 4
        System.out.println("\n\nЗадание 4");
        largeArray= initialize2DSquareArrayDiagonals(largeArray);
        System.out.println("Initialized 2D array:");
        print2DSquareArray(largeArray);
//ЗАДАНИЕ 5
        System.out.println("\nЗадание 5");
        System.out.println("Array is: ");
        printArray(array3);
        findMinMaxInArray(array3);
//ЗАДАНИЕ 6
        System.out.println("\nЗадание 6");
        System.out.println("Array is: ");
        printArray(arrToSum);
        System.out.println("\nВ массиве есть место, в котором сумма левой и правой части массива равны? "+checkBalance(arrToSum));
//ЗАДАНИЕ 7
        System.out.println("\nЗадание 7");
        System.out.println("Array is: ");
        printArray(arrToShift);
        System.out.println("\nArray after shifting: ");
        printArray(shiftArrayValues(arrToShift,2));

    }

    public static int[] initializeNewArray(int[] array){
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*2);
        }
        return array;
    }
    public static void printArray(int[] arr){
        for (int num:arr) {
            System.out.print(num+" ");
        }
    }

    public static int[] swapDigits(int[] array){
        for (int i=0;i<array.length;i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }else{
                array[i]=1;
            }
        }
        return array;
    }
    public static int[] fillArrayWithNumbers(int[] arr){
        int num=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=num;
            num+=3;
        }
        return arr;
    }
    public static int[] multiplyNumbersInArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<6){
                arr[i]*=2;
            }
        }
        return arr;
    }
    public static int[][] initialize2DSquareArrayDiagonals(int [][] arr){
        int row=0;
        for (int i = 0; i <arr.length ; i++) {
                arr[i][i]=1;
            }

            for (int j = arr.length-1; j>=0; j--) {
                arr[row][j]=1;
                row++;
            }


        return arr;
        }
    public static void print2DSquareArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int num:arr[i]) {
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
    public static void findMinMaxInArray(int[] arr){
        int min=arr[0],max=arr[0];
        for (int number:arr) {
            if (number<min) {
                min=number;
            }
            else if (number>max){
                max=number;
        }

        }
        System.out.println("\nMax is: "+max+"\nMin is: "+min);

    }
    public static int countSumInArray(int[] arr, int start, int finish){
        int sum=0;
        for (int i = start; i < finish; i++) {
            sum +=arr[i];
        }
        return sum;
    }
    public static boolean checkBalance(int[] arr){
        int sumLeft=0, sumRight=0;

        for (int k = 1; k < arr.length-1; k++) { //Это можно сделать с помощью while с переменной-счётчиком.
            sumLeft=countSumInArray(arr,0,k);
            sumRight=countSumInArray(arr, k+1, arr.length);
            if (sumLeft==sumRight){
                return true;
            }
            sumLeft=0;
            sumRight=0;
        }
        return false;
    }
    public static int[] shiftArrayValues(int[] arr, int n){
        int count = Math.abs(n);
        int num;
        if (n<0){
            while (count>0){
                for (int i = 0; i <arr.length-1; i++) {
                        num=arr[i+1];
                        arr[i+1]=arr[i];
                        arr[i]=num;
                }
                count--;
            }

        }
        if (n>0) {
            while (count > 0) {
                for (int j = arr.length - 1; j > 0; j--) {
                    num = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = num;
                }
                count--;
            }
        }
        return arr;
    }
}