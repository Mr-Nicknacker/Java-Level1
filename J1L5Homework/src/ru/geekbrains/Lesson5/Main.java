package ru.geekbrains.Lesson5;

public class Main {

    public static void main(String[] args) {
	Person[] persArray = new Person[5];
	persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231212", 75000, 30);
	persArray[1] = new Person("John Doe", "CEO", "JoD@mailbox.com", "89121231212", 350000, 57);
	persArray[2] = new Person("Jane Doe", "deputy CEO", "JaD@mailbox.com", "89151231212", 250000, 43);
	persArray[3] = new Person("Atemova Albina", "Secretary", "aalbina@mailbox.com", "8151234567", 65000, 24);
	persArray[4] = new Person("Timurov Timur", "PR Director", "ttimur@mailbox.com", "89151234567", 120000, 35);
		for (Person employee:persArray) {
			employee.printPersonInfoOlderThan(40);
			}
		}
}
