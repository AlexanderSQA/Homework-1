package com.otus.shatalov;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    private String years() {
        int lastChar = this.age % 10;
        if ((lastChar == 1) && !(this.age == 11)) return "год";
        else if ((this.age > 1 & this.age < 5) || (lastChar > 1 && lastChar < 5) && !(this.age < 21)) return "года";
        else return "лет";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    public String toString() {
        return "\"Привет! меня зовут " + name + ", мне " + age + " " + years() + ", я вешу - " + weight + " кг, мой цвет - " + color + "\"";
    }

}
