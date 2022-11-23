import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    System.out.print("Informe o número para calculo: ");
    double numberForCalcOne = entry.nextDouble();

    System.out.print("Informe o número para calculo: ");
    double numberForCalcTwo = entry.nextDouble();

    System.out.print("Informe a operação desejada: ");
    String operation = entry.next();


    double resultado = "+".equals(operation) ? numberForCalcOne + numberForCalcTwo : 0;
    resultado = "-".equals(operation) ? numberForCalcOne - numberForCalcTwo : resultado;

    resultado = "*".equals(operation) ? numberForCalcOne * numberForCalcTwo : resultado;

    resultado = "/".equals(operation) ? numberForCalcOne / numberForCalcTwo : resultado;

    resultado = "%".equals(operation) ? numberForCalcOne % numberForCalcTwo : resultado;



    System.out.printf("%.2f %s %.2f = %.2f", numberForCalcOne, operation, numberForCalcTwo, resultado);
    entry.close();
  }
}