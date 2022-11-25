package ClassAndMethods;

public class Person {
  String name;
  double weight;
  Person(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  void eatFood(Food food) {
    if(food != null) {
      this.weight += food.weight;
    }
  }

  String presentation() {
    return "Olá eu sou o " + name + " e tenho " + weight + " KGs";
  }
}
