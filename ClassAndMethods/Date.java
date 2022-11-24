package ClassAndMethods;

public class Date {
  int day;
  int mouth;
  int year;

  String dataComplete () {
    String fullyear = day + "/" + mouth + "/" + year;
    return  fullyear;
  }
}
