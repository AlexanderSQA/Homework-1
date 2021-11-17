package com.otus.shatalov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.showMenu();
        List<Animal> animals = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        String itemMenu = scanner.nextLine().toLowerCase().trim();


        while (!(itemMenu.equalsIgnoreCase("exit"))) {

            switch (itemMenu) {
                case "add":
                    System.out.println("Добавляем животное");
                    System.out.println("Какое животное хотите добавить cat / dog / duck ?");
                    String kindAnimal = scanner.nextLine().trim().toLowerCase();

                    Animal animal;

                    if (kindAnimal.equals("cat")) {
                        animal = new Cat();
                        menu.addAnimal(animal);
                        animals.add(animal);
                    } else if (kindAnimal.equals("dog")) {
                        animal = new Dog();
                        menu.addAnimal(animal);
                        animals.add(animal);
                    } else if (kindAnimal.equals("duck")) {
                        animal = new Duck();
                        menu.addAnimal(animal);
                        animals.add(animal);
                        animal.fly();
                    } else {
                        System.out.println("Сделайте выбор заново! Выбирать можно только cat / dog / duck");
                    }
                    break;
                case "list":
                    System.out.println("Список всех животных");
                    menu.animalsList(animals);
                    break;
                case "exit":
                    System.out.println("Выход");
                    break;
            }
            menu.showMenu();
            itemMenu = scanner.nextLine().toLowerCase().trim();
        }
    }
}
