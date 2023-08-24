package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        List<String> linguagens = Arrays.asList("Java", "Kotlin", "Javascript", "C++", "Ruby", "Python", "Go");

        Predicate<String> maisDeCincoCaracteres = linguagem -> linguagem.length() > 5;

        linguagens.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
    }
}
