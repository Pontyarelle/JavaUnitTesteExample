package org.example;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        char operador;
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        operador = input.next().charAt(0);
        double resultado = calcular(num1, num2, operador);
        System.out.printf("%.2f %c %.2f = %.2f", num1, operador, num2, resultado);
        input.close();
    }

    public static double calcular(double num1, double num2, char operador) {
        double resultado = 0.0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }
        return resultado;
    }
}

