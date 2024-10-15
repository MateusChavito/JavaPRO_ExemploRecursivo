package org.example;

public class FatorialRecursivo {

    public static int calcularFatorial(int numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * calcularFatorial(numero - 1);
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
