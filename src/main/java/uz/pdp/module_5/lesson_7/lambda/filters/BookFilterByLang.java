package uz.pdp.module_5.lesson_7.lambda.filters;

import uz.pdp.module_5.lesson_7.lambda.Book;

public class BookFilterByLang implements Filter<Book> {

    private String lang;
    public BookFilterByLang(String lang) {
        this.lang = lang;
    }

    @Override
    public boolean check(Book book) {
        return book.getLang().equals(lang);
    }
}
