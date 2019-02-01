package ru.geekbrains.Lesson2;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[8];
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] largeArray = new int[5][5];
        int[] arrToShift = {1,2,3,4,5,6};
        int[] arrToSum = {2,2,2,1,2,2,10,1};
        //int[] arrToSum = {1,1,1,2,1};

//ЗАДАНИЕ 1
        System.out.println("Задание 1");
        initializeNewArray(array);
        System.out.print("Initial array: ");
        printArray(array);
        swapDigits(array);
        System.out.print("\nModified array: ");
        printArray(array);
//ЗАДАНИЕ 2
        System.out.println("\n\nЗадание 2");
        fillArrayWithNumbers(array2);
        System.out.print("Initialized array2: ");
        printArray(array2);
//ЗАДАНИЕ 3
        System.out.println("\n\nЗадание 3");
        System.out.print("Initial array3: ");
        printArray(array3);
        multiplyNumbersInArray(array3);
        System.out.print("\nChanged array3: ");
        printArray(array3);
//ЗАДАНИЕ 4 Создать квадратный двумерный целочисленный массив и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("\n\nЗадание 4");
        initialize2DSquareArrayDiagonals(largeArray);
        System.out.println("Initialized 2D array:");
        print2DSquareArray(largeArray);
//ЗАДАНИЕ 5 Задать одномерный массив и найти в нем минимальный и максимальный элементы
        System.out.println("\nЗадание 5");
        System.out.println("Array is: ");
        printArray(array3);
        findMinMaxInArray(array3);
//ЗАДАНИЕ 6 Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        System.out.println("\nЗадание 6");
        System.out.println("Array is: ");
        printArray(arrToSum);
        System.out.println("\nВ массиве есть место, в котором сумма левой и правой части массива равны? "+checkBalance(arrToSum));
//ЗАДАНИЕ 7 Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), метод должен сместить все элементы массива на n позиций.
        System.out.println("\nЗадание 7");
        System.out.println("Array is: ");
        printArray(arrToShift);
        System.out.println("\nArray after shifting: ");
        shiftArrayValues(arrToShift,-2);
        printArray(arrToShift);

    }

    public static void initializeNewArray(int[] array){
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*2);
        }
    }
    public static void printArray(int[] arr){
        for (int num:arr) {
            System.out.print(num+" ");
        }
    }

    /*XOR
    * F-F=F
    * T-F=T
    * F-T=T
    * T-T=F
    * */
    public static void swapDigits(int[] array){ //XOR
        for (int i=0;i<array.length;i++) {
                array[i]=array[i]^1;
            }
    }
    public static void fillArrayWithNumbers(int[] arr){
        for (int i=0;i<arr.length;i++){
            arr[i]=i*3;
        }
    }
    public static void multiplyNumbersInArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<6){
                arr[i]*=2;
            }
        }
    }
    public static void initialize2DSquareArrayDiagonals(int [][] arr){
        for (int i = 0; i <arr.length ; i++) {
                arr[i][i]=1;
                arr[i][arr.length-1-i]=1;
            }
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
    public static boolean checkBalance(int[] arr){ //Метод решения: сообщающиеся сосуды: всё сливаем вправо, затем переливаем в левый и сравниваем.
        int sumLeft=0;
        int sumRight=0;
        for (int number:arr) { //Сливаем всю "воду" в правый сосуд
            sumRight+=number;
        }
        for (int number:arr) { //Постепенно переливаем в левый сосуд и сравниваем
            sumLeft+=number;
            sumRight-=number;
            if (sumLeft==sumRight){
                return true;
            }
        }
        return false;
    }
    public static void shiftArrayValues(int[] arr, int n){
        int count = Math.abs(n);
        int firstnumber;
        int lastnumber;
        if (n<0){
            while (count>0){
                firstnumber=arr[0];
                for (int i = 0; i <arr.length-1; i++) {
                        arr[i]=arr[i+1];
                }
                arr[arr.length-1]=firstnumber;
                count--;
            }
        }
        if (n>0) {
            while (count > 0) {
                lastnumber = arr[arr.length-1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j]=arr[j-1];
                }
                arr[0]=lastnumber;
                count--;
            }
        }
    }
}