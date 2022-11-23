import java.util.Scanner;

// desafio para imprimir número conforme dia usando else if para treino de estrutura de controles
public class DesafioElseIf {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o dia da semana: ");

    String diaDaSemana = entrada.next();
;
    if(diaDaSemana.equalsIgnoreCase("domingo") ) {
      System.out.println(1);
    } else if (diaDaSemana.equalsIgnoreCase("segunda") ) {
      System.out.println(2); }
      else if (diaDaSemana.equalsIgnoreCase("terça") ) {
        System.out.println(3); }
      else if (diaDaSemana.equalsIgnoreCase("quarta") ) {
        System.out.println(4); }
      else if (diaDaSemana.equalsIgnoreCase("quinta") ) {
         System.out.println(5); }
      else if (diaDaSemana.equalsIgnoreCase("sexta") ) {
         System.out.println(6); }
      else if (diaDaSemana.equalsIgnoreCase("sábado") ) {
         System.out.println(7); }
        


   entrada.close();
  
} }