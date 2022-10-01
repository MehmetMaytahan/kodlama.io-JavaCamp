public class App {

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int search = 5;
    boolean found = false;

    for (int number : numbers) {
      if (number == search) {
        found = true;
        break;
      }
    }
    if (found) {
      System.out.println("Sayi bulundu.");
    } else {
      System.out.println("Sayi bulunamadi.");
    }
  }
}
