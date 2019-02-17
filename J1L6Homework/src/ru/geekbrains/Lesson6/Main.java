package ru.geekbrains.Lesson6;

public class Main {

    public static void main(String[] args) {
    HomeCat houseCat = new HomeCat("Pushok", "White", 2);
    Human person = new Human();
    StreetCat streetCat = new StreetCat("Beast", "black", 6);
    IProcureFood[] creatures = new IProcureFood[3];
    creatures [0] = houseCat;
    creatures [1] = streetCat;
    creatures [2] = person;

	Dog dog1 = new Dog("Shark", "Gray", 2);
	Cat cat1 = new Cat("Stich", "Red", 3);
	Cat cat2 = new Cat ("Barsik","Black", 4);

	dog1.run(150);
	cat1.swim(150);
	cat1.run(120);
	cat1.jump(1.8f);
	dog1.dogInfo();
	cat1.catInfo();
	cat2.catInfo();
		for (IProcureFood creature:creatures) {
			creature.findFood();
		}
    }
}
