package uz.pdp.module_5.lesson_7.lambda;

import uz.pdp.module_5.lesson_7.lambda.filters.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookService {


    public List<Book> getBooksByFilter(List<Book> books, Predicate<Book> predicate){
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (predicate.test(book)){
                result.add(book);
            }
        }
        return result;
    }


}
