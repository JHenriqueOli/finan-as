import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Calculadora em Java");

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double subitracao = num1 - num2;
        double multiplicacao = num1 * num2;

        System.out.println("\n--- Resultados ---")
         System.out.println(num1 + " + " + num2 + " = " + soma);
        System.out.println(num1 + " - " + num2 + " = " + subtracao);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacao);

        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero!");
        }

        scanner.close();
    }
}
