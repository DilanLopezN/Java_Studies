import java.util.Scanner;

public class WhileMedia {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int quantidadeDeNotas = 0;
      double nota = 0;
      double total = 0;

      while(nota != -1) {
        System.out.print("Informe a nota: ");
        nota = entrada.nextDouble();

        if(nota <= 10 && nota >= 0) {
          total += nota;
          quantidadeDeNotas++;
        }
       

      }

      double media = total / quantidadeDeNotas;
      System.out.println("Media de notas: " +  media);

      entrada.close();
    }  
}
