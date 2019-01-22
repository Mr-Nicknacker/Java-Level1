package ru.geekbrains.Lesson1;

public class Main {

        public static void main (String[]args){
            byte by = 0;
            short sh = 0;
            int i = 0;
            long lo = 0;
            double doub = 0;
            char ch = '\0';
            boolean flag = true;
            String str = "";

            //Exercise 3
            System.out.println("Exercise 3\n" + calculateExpression(3.0F, 5.0F, 200.0F, -5.5F));
            float num1 = 10.0F;
            float num2 = 9.8F;

            //Exercise 4
            System.out.println("\nExercise 4");
            if (checkIfNumbersInRange(num1, num2)) {
                System.out.println("Cумма в пределах от 10 до 20");
            } else {
                System.out.println("Сумма чисел меньше 10 или больше 20");
            }
            //Exercise 5
            int someNumber = 5;
            System.out.println("\nExercise 5");
            positiveOrNegative(someNumber);

            //Exercise 6
            int anotherNumber = -7;
            System.out.println("\nExercise 6");
            if (isNegative(anotherNumber)) {
                System.out.println(anotherNumber + " - отрицательное число");
            }

            //Exercise 7
            String name = "Роджер";
            System.out.println("\nExercise 7");
            sayHello(name);

            //Exercise 8
            int year = 2020;
            System.out.println("\nExercise 8");
            leapYear(year);
        }

        public static float calculateExpression ( float a, float b, float c, float d){
            return a * (b + c / d);
        }

        public static boolean checkIfNumbersInRange ( float num1, float num2){
            float sum = num1 + num2;
            return sum > 10.0F && sum <= 20.0F;
        }

        public static void positiveOrNegative ( int a){
            String whichNumber = a >= 0 ? "Число положительное" : "Число отрицательное";
            System.out.println(whichNumber);
        }

        public static boolean isNegative ( int a){
            return a < 0;
        }

        public static void sayHello (String name){
            System.out.println("Привет, " + name + "!");
        }

        public static void leapYear ( int year){
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + " - високосный");
            } else if (year % 100 != 0 && year % 4 == 0) {
                System.out.println(year + " - високосный");
            } else {
                System.out.println(year + " - не високосный");
            }

        }
}