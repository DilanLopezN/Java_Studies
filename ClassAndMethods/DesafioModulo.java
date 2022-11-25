package ClassAndMethods;
// criar classe pessoa e comida com metodo de comer onde acrescenta peso da comida ao peso da pessoa.
public class DesafioModulo {
      public static void main(String[] args) {
        Food food1 = new Food("Arroz", 1.255 );

        Person person1 = new Person("Dilan", 70);
        System.out.println(person1.presentation());
        person1.eatFood(food1);
        System.out.println(person1.presentation());

      }
  }


