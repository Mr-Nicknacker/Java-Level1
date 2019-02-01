package ru.geekbrains.Lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
    // ЗАДАНИЕ 1
	/* Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
       После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
   // guessANumber();

    //ЗАДАНИЕ 2
   /* При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)*/
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    guessAWord(words);

    }
    public static void playRounds(int rounds, int numberToGuess){ //Отыгрывает несколько раундов

        for (int round = rounds; round > 0; round--) {
            int userNumber = scanner.nextInt();
            if (userNumber>numberToGuess){
                System.out.println("Загаданное число меньше");
                System.out.println("Число оставшихся попыток: "+(round-1)+". Попробуйте ещё раз");
            }
            else if (userNumber<numberToGuess){
                System.out.println("Загаданное число больше.");
                System.out.println("Число оставшихся попыток: "+(round-1)+". Попробуйте ещё раз");
            }
            else {
                System.out.println("Верно!!");
                break;
            }
        }
    }
    public static void guessANumber(){
        int tryAgain;
        Scanner scanner = new Scanner(System.in);
        do{
            int numberToGuess = random.nextInt(10);
            System.out.println("Угадайте число от 0 до 9");
            playRounds(3,numberToGuess);
            System.out.printf("Хотите сыграть ещё раз? %d - Да, %d - Нет\n", 1, 0);
            tryAgain=scanner.nextInt();
        } while (tryAgain==1);
        scanner.close();
    }
    public static int minWordLength(String word1, String word2){
        if (word1.length()<word2.length()){
            return word1.length();
        }
        else return word2.length();

    }
    public static void guessAWord(String[] str){
        int guessedLetters=0;
        int fifteenLetters;
        int randomWord=random.nextInt(str.length);
        String wordToGuess=str[randomWord];

        System.out.println(Arrays.toString(str));
        System.out.println(wordToGuess);
        System.out.println("Угадайте слово.");
        String word = scanner.nextLine();

        while (!word.equalsIgnoreCase(wordToGuess)){
            for (int i = 0; i < minWordLength(word,wordToGuess); i++) {
                if (word.charAt(i)==wordToGuess.charAt(i)){
                    System.out.print(word.charAt(i));
                    guessedLetters++;
                }
                else{
                    System.out.print("#");
                }
            }
            fifteenLetters=minWordLength(word,wordToGuess);
            while (fifteenLetters!=15){
                System.out.print("#");
                fifteenLetters++;
            }
            /*for (int i = 0; i < (15-guessedLetters-missedLetters); i++) {
                System.out.print("#");
            }*/
            System.out.printf("\nВы угадали %d букв. Попробуйте ещё раз\n", guessedLetters);
            guessedLetters=0;
            word = scanner.nextLine();
        }
        System.out.println("Верно!!!");
    }
}
