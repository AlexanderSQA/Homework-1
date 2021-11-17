package com.otus.shatalov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void showMenu() {
        System.out.println(Command.ADD);
        System.out.println(Command.LIST);
        System.out.println(Command.EXIT);
    }

    public void addAnimal(Animal animal) {

        animalName(animal);
        animalAge(animal);
        animalWeight(animal);
        animalColor(animal);

        animal.say();

    }

    public void animalName(Animal animal) {
        System.out.println("Как зовут животное?");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine().trim().toLowerCase();
        animal.setName(animalName);
    }

    public void animalAge(Animal animal) {
        System.out.println("Сколько лет животному?");
        Scanner scanner = new Scanner(System.in);
        int animalAge = scanner.nextInt();
        animal.setAge(animalAge);
    }

    public void animalWeight(Animal animal) {
        System.out.println("Сколько животное весит?");
        Scanner scanner = new Scanner(System.in);
        int animalWeight = scanner.nextInt();
        animal.setWeight(animalWeight);
    }

    public void animalColor(Animal animal) {
        System.out.println("Какого цвета животное?");
        Scanner scanner = new Scanner(System.in);
        String animalColor = scanner.nextLine().trim().toLowerCase();
        animal.setColor(animalColor);
    }

    public void animalsList(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}

