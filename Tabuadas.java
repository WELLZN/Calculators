package principal;
import java.util.Scanner;

public class Tabuadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de c�lculo: +, -, *, /");
        String calculo = scanner.nextLine();

        if (calculo.equals("+") && calculo.equals("-") && calculo.equals("*") && calculo.equals("/")) {
            System.out.println("Opera��o inv�lida. Encerrando o programa.");
            
          
        }

        System.out.println("Digite o primeiro n�mero (entre 0 e 10): ");
        double num1 = lerNumero(scanner);

        System.out.println("Digite o segundo n�mero (entre 0 e 10): ");
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
                System.out.println("N�o � poss�vel dividir por zero.");
            }
        }

        scanner.close();
    }

    public static double lerNumero(Scanner scanner) {
        double num;
        do {
            num = scanner.nextDouble();
            if (num < 0 || num > 10) {
                System.out.println("N�mero fora do intervalo permitido. Digite novamente (entre 0 e 10): ");
            }
        } while (num < 0 || num > 10);
        return num;
     
    }
}