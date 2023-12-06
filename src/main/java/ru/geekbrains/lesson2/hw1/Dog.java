package ru.geekbrains.lesson2.hw1;

public class Dog extends Animal{
    private String poroda;
    private String name;
    private int age;
    public Dog(String name,int age,String poroda) {
        this.name=name;
        this.age=age;
        this.poroda=poroda;
    }
    public void SitDown(){
        System.out.println("собака "+ name+" села");
    }
}
