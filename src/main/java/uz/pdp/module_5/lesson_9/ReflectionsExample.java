package uz.pdp.module_5.lesson_9;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionsExample {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person("Salim", 24);
        System.out.println(person);
//        getPrivateFields(person);
        getPrivateMethods(person);
        System.out.println(person);





        /*Class<Person> aClass = (Class<Person>) Class.forName("uz.pdp.module_5.lesson_9.Person");
        Constructor<Person> twoArgConstructor = aClass.getDeclaredConstructor(String.class,int.class);
        int modifiers = twoArgConstructor.getModifiers();
        twoArgConstructor.setAccessible(true);
        Person person = twoArgConstructor.newInstance("Abror", 25);
        System.out.println(modifiers);
        System.out.println(person.getName());
*/







        /* Constructor<Person>[] constructors =(Constructor<Person>[]) aClass.getDeclaredConstructors();
        System.out.println(constructors.length);
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }*/


        /*Constructor<Person> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Person person = constructor.newInstance();
        person.sayHello();
    */}

    private static void getPrivateMethods(Person person) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends Person> aClass = person.getClass();
        Method[] methods = aClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getParameterCount());
        }

        /*Method sayHello = aClass.getDeclaredMethod("sayHello",String.class);
        sayHello.setAccessible(true);
        sayHello.invoke(person,"PDP");
*/    }


    public static void getPrivateFields(Person person) throws IllegalAccessException, NoSuchFieldException {
        Class<Person> aClass = (Class<Person>) person.getClass();
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        int i = (int) age.get(person);
        age.set(person,i+1);


        /*Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            System.out.println(field.get(person));
        }*/
    }
}

