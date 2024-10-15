package org.example;

public class FatorialBottomUp {

    public static int calcularFatorial(int numero) {

        int[] fatorial = new int[numero + 1];

        fatorial[0] = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial[i] = i * fatorial[i - 1];
        }

        return fatorial[numero];
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
