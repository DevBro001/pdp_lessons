package uz.pdp.module_5.lesson_10;

import com.google.gson.Gson;
import uz.pdp.module_5.lesson_8.introStreams.DB;
import uz.pdp.module_5.lesson_8.introStreams.User;
import uz.pdp.module_5.lesson_9.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.*;

public class ComparatorExample {

    public static void main(String[] args) throws IOException {
        String json = Files.readString(Path.of("src/main/resources/text.txt"));
        Gson gson = new Gson();
        DB db = gson.fromJson(json, DB.class);
        List<User> users = db.getUsers();
/*

        users
                .stream()
                .limit(50)
                .sorted(
                        Comparator.comparing( User::getName)
                                .thenComparing(User::getAge)
                )
                .forEach(System.out::println);
*/
/*
        Stream<String> languages = Stream.of("Java", "PHP", "Rust",  "JavaScript","C+++", "Python");
        Map<Integer, String> collect = languages
                .collect(Collectors.toMap((String::length), (str -> str),(val1,val2)->{
                    return val2;
                }));

        System.out.println(collect);
        collect.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });*/
/*
        Stream<String> languages = Stream.of("Java", "PHP", "Rust",  "JavaScript","C+++", "Python");
        String collect = languages
                .collect(Collectors.joining(" , ", "[", "]"));
        System.out.println(collect);*/
/*
        Map<Integer, List<String>> collect = users.stream()
                .limit(50)
                .collect(Collectors.groupingBy(User::getAge,Collectors.mapping(User::getName,Collectors.toList())));

        collect.forEach((k,v)->{
            System.out.println("yoshi "+k);
            System.out.println(v);
        });*/
/*
        Map<Boolean, List<String>> collect = users.stream()
                .collect(Collectors.partitioningBy((u) -> u.getAge() > 30, Collectors.mapping(User::getName, Collectors.toList())));

        collect.forEach((k,v)->{
            System.out.println("yoshi "+k);
            System.out.println(v);
        });*/
/*
        Stream<String> languages = Stream.of("Java", "PHP", "Rust",  "JavaScript","C+++", "Python");
        Optional<String> collect = languages
                .collect(Collectors.reducing((s1, s2) ->  s1 + " va " + s2));
        System.out.println(collect.get());*/

       /* Stream<String> languages = Stream.of("Java", "PHP", "Rust",  "JavaScript","C+++", "Python");
        IntSummaryStatistics collect = languages
                .collect(Collectors.summarizingInt(String::length));

        System.out.println("max = "+collect.getMax());
        System.out.println("min = "+collect.getMin());
        System.out.println("average = "+collect.getAverage());
        System.out.println("average = "+collect.getCount());
        System.out.println("average = "+collect.getSum());
*/

        /*IntStream;
        LongStream;
        DoubleStream;
        */
      /*  Integer a = 5;
        Integer b = 5;
        Integer c = a+b;
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7);
        IntStream intStream  = IntStream.of(1,2,3,4,5,6,7);*/


        Stream<String> languages = Stream.of("Java", "PHP","Java", "PHP", "Rust","PHP","Java", "Rust",  "JavaScript","C+++", "Python");

/*
        Map<String, Integer> collect = languages
                .collect(Collectors.toMap((str) -> str, (str) -> 1,(val1,val2)->val1+val2));
        System.out.println(collect);*/

/*
        Map<String, Long> collect1 = languages
                .collect(Collectors.groupingBy((str) -> str,Collectors.counting()));
        System.out.println(collect1);
    */
        /*
        Long collect2 = languages
                .collect(  Collectors.counting());
        System.out.println(collect2);
*/
    }
}
