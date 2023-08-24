package stream_api.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Desafio 7 - Encontrar o segundo número maior da lista:
    Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
*/
public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("O segundo maior número da lista é: " + numeros.stream().sorted((a, b) -> b.compareTo(a)).toList().get(1));
    }
}
