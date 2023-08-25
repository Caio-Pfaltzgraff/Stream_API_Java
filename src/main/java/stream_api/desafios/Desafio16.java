package stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
    Desafio 16 - Calcule o fatorial de um número:
    Crie um programa que receba um número inteiro como entrada e, utilizando a Stream API, calcule o fatorial desse número e exiba o resultado no console.
*/
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Long> fatoriais = numeros.stream().map(Desafio16::fatorial).toList();
        for(int i = 0; i < numeros.size(); i ++) {
            System.out.println(numeros.get(i) + "! é igual a: " + fatoriais.get(i));
        }
    }

    public static long fatorial(Integer num) {
        if(num.equals(0) || num.equals(1)) {
            return 1;
        }
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        return total;
    }
}
