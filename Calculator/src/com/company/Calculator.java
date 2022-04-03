package com.company;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
//    BinaryOperator<Integer> divide = (x, y) -> x / y; // В условии необходимо указать, что делать в случае если y == 0, либо прописать исключение
    BinaryOperator<Integer> divide = (x, y) -> {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Сan not be divided by 0");
        }
        return 0;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1; // В коде не содержатся условия для х == 0

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
