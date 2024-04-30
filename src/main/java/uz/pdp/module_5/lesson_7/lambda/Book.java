package uz.pdp.module_5.lesson_7.lambda;


import lombok.*;

@Data
@AllArgsConstructor
@Builder
@ToString(includeFieldNames = false)
public class Book {
    private String name;
    private String author;
    private String lang;
    private double price;
    private int countPage;


}
