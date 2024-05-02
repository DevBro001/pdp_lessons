package uz.pdp.module_5.lesson_7.functionalInterface;

import uz.pdp.module_5.lesson_7.lambda.Book;
import uz.pdp.module_5.lesson_7.lambda.BookService;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Book> books = List.of(
                Book.builder().name("Java 1").author("John Kim").lang("ENG").price(50).countPage(1000).build(),
                Book.builder().name("Java 2").author("John Kim").lang("ENG").price(75).countPage(600).build(),
                Book.builder().name("Java 3").author("John Kim").lang("ENG").price(80).countPage(500).build(),
                Book.builder().name("Shaytanat ").author("Toxir Malik").lang("UZ").price(25).countPage(300).build(),
                Book.builder().name("Sariq Devni Minib").author("Hudoyberdi Tohtaboyey").lang("UZ").price(10).countPage(770).build()
        );


        Function<String,Integer> strToInt = (str)->{
            Integer i = Integer.valueOf(str);
            return i;
        };

        Function<Integer,Integer> sum = (a)->{
            return a+1;
        };

       /* Function<String, Integer> stringIntegerFunction = strToInt.andThen(sum);
        Integer apply = stringIntegerFunction.apply("123");
        System.out.println(apply);*/

        Predicate<String> lengthMoreTeng= (s)->s.length()>10;
        Predicate<String> haveNumber= (s)->{
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))){
                    return true;
                }
            }
            return false;
        };

       /* System.out.println(lengthMoreTeng.test("salom dunyo"));
        System.out.println(haveNumber.test("salom dunyo"));
*/
        Predicate<String> and = lengthMoreTeng.or(haveNumber);
        System.out.println(and.test(" dunyo"));

        Supplier<Integer> random = ()-> new Random().nextInt(10,100);

        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());

        /*
        Integer apply = strToInt.apply("123");
        System.out.println(apply);
*/



   /*     BookService bookService = new BookService();
        Predicate<Book> predicate = (book -> book.getCountPage() > 500);
        List<Book> booksByFilter = bookService.getBooksByFilter(books, predicate);
        System.out.println(booksByFilter);
*//*
        Consumer<Book> sout = (book) -> {*//*
            System.out.println(book);
        };
        Consumer<Book> save = (book) -> {
            System.out.println(book+" save to DB");
        };
        Consumer<Book> delete = (book) -> {
            System.out.println(book+" deleted from DB");
        };
        HashMap<String, Consumer<Book>> map = new HashMap<>();

        map.put("SOUT",sout);
        map.put("SAVE",save);
        map.put("DELETE",delete);

        map.get("DELETE").accept(books.get(0));*/
    }


}
