package uz.pdp.module_5.lesson_7.lambda.filters;

import uz.pdp.module_5.lesson_7.lambda.Book;

public class BookFilterByLessPrice implements Filter<Book> {

    private double price;

    public BookFilterByLessPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean check(Book book) {
        return book.getPrice()<price;
    }
}
