package questao2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (VerificaSequenciaFibonacci(numero)) {
            System.out.println(numero + " está na sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não está na sequência de Fibonacci.");
        }

        scanner.close();

    }

    public static boolean VerificaSequenciaFibonacci(int num) {

        if (num < 0) {
            return false;
        }

        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0;
        int b = 1;

        while (b < num) {
            int auxiliar = a + b;
            a = b;
            b = auxiliar;
        }

        return b == num;
    }
}

