package ru.geekbrains.lesson2.hw1;

public class Cat extends Animal{
    private String color;
    private String name;
    private int age;

    public Cat(String name,int age,String color) {
        this.name=name;
        this.age=age;
        this.color = color;
    }
    public void makeSound(){
        System.out.println("Мяу");
    }
}
