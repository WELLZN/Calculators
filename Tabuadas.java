package principal;
import java.util.Scanner;

public class Tabuadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de cálculo: +, -, *, /");
        String calculo = scanner.nextLine();

        if (calculo.equals("+") && calculo.equals("-") && calculo.equals("*") && calculo.equals("/")) {
            System.out.println("Operação inválida. Encerrando o programa.");
            
          
        }

        System.out.println("Digite o primeiro número (entre 0 e 10): ");
        double num1 = lerNumero(scanner);

        System.out.println("Digite o segundo número (entre 0 e 10): ");
        double num2 = lerNumero(scanner);

        if (calculo.equals("+")) {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (calculo.equals("-")) {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (calculo.equals("*")) {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (calculo.equals("/")) {
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Não é possível dividir por zero.");
            }
        }

        scanner.close();
    }

    public static double lerNumero(Scanner scanner) {
        double num;
        do {
            num = scanner.nextDouble();
            if (num < 0 || num > 10) {
                System.out.println("Número fora do intervalo permitido. Digite novamente (entre 0 e 10): ");
            }
        } while (num < 0 || num > 10);
        return num;
     
    }
}