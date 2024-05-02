package uz.pdp.module_5.lesson_8.introStreams;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) throws IOException {
      /*  List<Integer> integers = new ArrayList<>( List.of(1,  3,  5,  7, 8, 9, 0, 12, 13, 14));
        Stream<Integer> stream = integers.stream();

        List<Integer> list = stream
                .filter((i) -> i % 2 == 0)
                .limit(10)
                .toList();*/
/*
        BufferedReader bufferedReader = Files.newBufferedReader(Path.of(""));
        Stream<String> lines = bufferedReader.lines();*/


/*

        Stream<String> java = Stream.of("Java", "Phyton", "C");
        String[] array = java
                .filter((s) -> s.length() > 2)
                .toArray(String[]::new);
*/

        /*List<Integer> integers = new ArrayList<>( List.of(1,  3,  5,  7, 8, 9, 0, 12, 13, 14));
        Predicate<Integer> predicate = (i)->i>10;
        Predicate<Integer> predicate2 = (i)->i%2==0;
        Predicate<Integer> and = predicate.and(predicate2);

        List<Integer> collect = integers.stream()
                .filter((i)->i>10&&i%2==0)
                .collect(Collectors.toList());

        System.out.println(collect);
*/
        String json = Files.readString(Path.of("src/main/resources/text.txt"));

        Gson gson = new Gson();
        DB db = gson.fromJson(json, DB.class);
        List<User> users = db.getUsers();
/*

        List<User> list = users.stream()
                .filter((user -> user.getAge() > 48))
                .limit(5)
                .peek((u)->{
                    System.out.println(u);
                    u.setAge(u.getAge()+1);
                })
                .toList();
        System.out.println("====================================");
        System.out.println(list.size());
        list.forEach(System.out::println);
*/
/*
        boolean isTrue = users.stream().allMatch((u) -> {
            boolean b = u.getAge() > 10;
            return b;
        });
        System.out.println(isTrue);
        isTrue = users.stream().anyMatch((u) -> {
            boolean b = u.getAge() <10 ;
            return b;
        });
        System.out.println(isTrue);
         isTrue = users.stream().noneMatch((u) -> {
            boolean b = u.getAge() <50 ;
            return b;
        });
        System.out.println(isTrue);*/
/*
        List<Integer> list = users.stream()
                .map(User::getAge)
                .limit(10)
                .toList();

        list.forEach(System.out::println);
        */
        List<List<Integer>> list = new ArrayList<>(List.of(List.of(1,2,3,4),List.of(5,4,6,7,78,8),List.of(123,45,45,76678,432)));
        /*ArrayList<Integer> result = new ArrayList<>();
        for (List<Integer> integers : list) {
            for (Integer integer : integers) {
                result.add(integer);
            }
        }*/
/*
        List<Integer> result = list.stream()
                .flatMap( List::stream)
                .toList();

        System.out.println(list);
        System.out.println(result);*/


        Optional<User> first = users.stream()
//                .limit(10)
//                .parallel()
                .filter((u) -> {
//                    System.out.println(Thread.currentThread().getName());
                    return u.getAge() == 50;
                })
                .findAny();

        User user = first.orElseGet(()->{
            System.out.println("none user");
         return null;
        });
        System.out.println(user);


    }

    public static List<Integer> m2(List<Integer> list){
        return null;
    }
    public static List<Integer> m1(List<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (i%2==0) {
                result.add(i);
            }
        }
        return result;
    }


}

record Employee(String name){
}
