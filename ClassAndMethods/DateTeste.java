package ClassAndMethods;
// desafio instanciar e criar classes
public class DateTeste {
public static void main(String[] args) {
  Date data = new Date();
 data.day = 24;
 data.mouth = 11;
 data.year = 2022;
 
   System.out.println(data.dataComplete());
}
}
