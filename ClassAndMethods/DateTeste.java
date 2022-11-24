package ClassAndMethods;
// desafio instanciar e criar classes
public class DateTeste {
public static void main(String[] args) {
  Date data = new Date();
 data.day = 24;
 data.mouth = 11;
 data.year = 2022;
 String fullyear = data.day + "/" + data.mouth + "/" + data.year;
   System.out.println(fullyear);
}
}
