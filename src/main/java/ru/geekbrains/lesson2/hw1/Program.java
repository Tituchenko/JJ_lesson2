package ru.geekbrains.lesson2.hw1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.SortedMap;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Animal[] animals=new Animal[3];

        Class<?> catClass = Class.forName("ru.geekbrains.lesson2.hw1.Cat");
        Class<?> dogClass = Class.forName("ru.geekbrains.lesson2.hw1.Dog");
        Constructor constructorCat = catClass.getConstructors()[0];
        Constructor constructorDog = dogClass.getConstructors()[0];

        animals[0]= (Animal) constructorDog.newInstance("Шарик",3,"дворнгяа");
        animals[1]= (Animal) constructorCat.newInstance("Мурка",5,"белая");
        animals[2]= (Animal) constructorDog.newInstance("Атос",8,"дог");

        for (Animal animal:animals) {
            Class<?> objClass = animal.getClass();
            Field[] fields = objClass.getDeclaredFields();
            System.out.println("**********************");
            System.out.println(objClass.getName());
            for (Field field : fields){
                field.setAccessible(true); // Разрешаем доступ к закрытому полю
                System.out.printf("%s: %s\n", field.getName(), field.get(animal));
            }

            Method[] methods=objClass.getDeclaredMethods();
            System.out.println("Методы:");
            for (Method method:methods) {
                String methodName=method.getName();
                System.out.println(methodName);
                if (methodName.equals("makeSound"))
                    method.invoke(animal);


            }
        }


    }
}
