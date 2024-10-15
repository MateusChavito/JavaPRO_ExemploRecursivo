package org.example;

import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int calcularFatorial(int numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        }

        if (memo.containsKey(numero)) {
            return memo.get(numero);
        }

        int resultado = numero * calcularFatorial(numero - 1);
        memo.put(numero, resultado);

        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
