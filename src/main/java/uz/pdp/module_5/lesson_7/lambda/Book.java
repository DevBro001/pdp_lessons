package uz.pdp.module_5.lesson_7.lambda;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(includeFieldNames = false)
public class Book {
    private String name;
    private String author;
    private String lang;
    private double price;
    private int countPage;

    public Book(int countPage) {
        this.countPage = countPage;
    }

    public Book(String s) {
    }
}
