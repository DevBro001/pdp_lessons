package uz.pdp.module_5.lesson_7.lambda.filters;

@FunctionalInterface
public interface Filter<B> {
    boolean check(B b);
}
