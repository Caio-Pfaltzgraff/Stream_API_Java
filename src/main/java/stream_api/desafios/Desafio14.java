package stream_api.desafios;

import java.util.Arrays;
import java.util.List;

/*
    Desafio 14 - Encontre o maior número primo da lista:
    Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
*/
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        System.out.println("O maior número primo da lista é: " + numeros.stream().filter(Desafio14::ehPrimo).mapToInt(Integer::intValue).max().getAsInt());
    }

    public static boolean ehPrimo(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
