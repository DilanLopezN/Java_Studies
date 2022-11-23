package Conditionals;
// desafio uso do For sem usar números
public class DesafioFor {
  public static void main(String[] args) {

    for(String v = "#"; !v.equals("#####"); v += "#")  {
      System.out.println(v);
    }
  }
}
