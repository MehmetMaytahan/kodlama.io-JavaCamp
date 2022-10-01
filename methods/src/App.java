public class App {

  public static void main(String[] args) {
    sayiBulma();
  }

  public static void sayiBulma() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int search = 5;
    boolean isFound = false;

    for (int number : numbers) {
      if (number == search) {
        isFound = true;
        break;
      }
    }
    if (isFound) {
      giveHello("Number is found: " + search);
    } else {
      giveHello("Number is not found: " + search);
    }
  }

  public static void giveHello(String message) {
    System.out.println(message);
  }
}
