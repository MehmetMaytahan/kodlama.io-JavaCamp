public class App {

  public static void main(String[] args) {
    int number = 220;
    int total = 0;
    int number2 = 284;
    int total2 = 0;

    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        total += i;
      }
    }

    for (int i = 1; i < number2; i++) {
      if (number2 % i == 0) {
        total2 += i;
      }
    }

    if (total == number2 && total2 == number) {
      System.out.println("Sayilar Arkadas Sayilardir.");
    } else {
      System.out.println("Sayilar Arkadas Sayilar Degildir.");
    }
  }
}
