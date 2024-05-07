package uz.pdp.module_5.lesson_9;

import java.io.StringReader;

public class Person{

    private String name;
    private int age;
    private Person(){
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    private void sayHello(){
        System.out.println("Hello " );
    }

    private void sayHello(String name,Integer age){
        System.out.println("Hello " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}