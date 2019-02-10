package ru.geekbrains.Lesson5;

public class Person {
    String name="";
    String position ="";
    String email="";
    String phoneNumber="";
    int salary=0;
    int age=0;

    public Person(){
    }

    public Person (String name, String role, String email, String phoneNumber, int salary, int age) {
        this.name=name;
        this.position =role;
        this.email=email;
        this. phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }
    public void printPersonInfo (){
        System.out.println("Employee name: "+name);
        System.out.println("Position: "+ position);
        System.out.println("e-mail: "+email);
        System.out.println("Phone number: "+phoneNumber);
        System.out.println("Salary: "+salary);
        System.out.println("Age: "+age);
    }
    public void printPersonInfoOlderThan (int age) {
        if (this.age > age) {
            System.out.println("Employee name: " + name);
            System.out.println("Position: " + position);
            System.out.println("e-mail: " + email);
            System.out.println("Phone number: " + phoneNumber);
            System.out.println("Salary: " + salary);
            System.out.println("Age: " + this.age);
            System.out.println();
        }
    }
}
