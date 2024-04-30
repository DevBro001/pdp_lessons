package uz.pdp.module_5.lesson_7.lambda;

import uz.pdp.module_5.lesson_7.lambda.filters.Filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = List.of(
                Book.builder().name("Java 1").author("John Kim").lang("ENG").price(50).countPage(1000).build(),
                Book.builder().name("Java 2").author("John Kim").lang("ENG").price(75).countPage(600).build(),
                Book.builder().name("Java 3").author("John Kim").lang("ENG").price(80).countPage(500).build(),
                Book.builder().name("Shaytanat ").author("Toxir Malik").lang("UZ").price(25).countPage(300).build(),
                Book.builder().name("Sariq Devni Minib").author("Hudoyberdi Tohtaboyey").lang("UZ").price(10).countPage(770).build()
        );
        ArrayList<Book> books1 = new ArrayList<>(books);

        Collections.sort(books1, Comparator.comparingDouble(Book::getPrice));

        System.out.println(books1);




        BookService bookService = new BookService();

        String keyword = "Java";
        final String forLambda = keyword;
        Filter<Book> filterByName = book ->  {
            boolean result = book.getName().contains(forLambda);
            return result;
        };

        keyword ="Keyword";
        Filter<Book> filterByPageCount = book ->  book.getCountPage()>750;

        List<Book> booksByFilter = bookService.getBooksByFilter(books,  book ->  book.getCountPage()>750);

        System.out.println(booksByFilter);





        /*
        List<Book> byPrice = bookService.getBooksByFilter(books, new BookFilterByLessPrice(50));

        System.out.println(byPrice);
*/


        /*List<Book> eng = bookService.getBooksByFilter(books, new BookFilterByLang("ENG"));
        System.out.println(eng);
        */

    }


    public Filter<Book> getFilter(){
        return (b)->{
            return b.getPrice()>100;
        };
    }




}
