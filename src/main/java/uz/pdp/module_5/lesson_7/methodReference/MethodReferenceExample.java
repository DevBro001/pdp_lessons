package uz.pdp.module_5.lesson_7.methodReference;

import uz.pdp.module_5.lesson_7.lambda.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> langs = List.of("Java", "Phyton", "PHP", "C++");
        List<Integer> ints = new ArrayList<>(List.of(12,11,67,34,32,43));

        /*
        Consumer<String>  method = System.out::println;
        langs.forEach(method);
        */
        /*
        Function<List<Integer>,Integer> findMax = Collections::max;

        Integer max = findMax.apply(ints);
        System.out.println(max);*/

        /*
        Supplier<Integer> getSize =langs::size;
        System.out.println(getSize.get());
        */

        /*
        Consumer<List<Integer>> clearList = List::clear;
        clearList.accept(ints);
        System.out.println(ints);*/

        /*
        Supplier<Book> getBook= Book::new ;
        Book book1 = getBook.get();
        Book book2 = getBook.get();
        Book book3 = getBook.get();
        */

        Function<Integer,Book> getBookWithInt = Book::new;
        Book book = getBookWithInt.apply(1000);
        System.out.println(book);
    }

    public void method(String str){
        System.out.println(str);
    }
}
