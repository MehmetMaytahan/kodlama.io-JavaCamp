public class App {

  public static void main(String[] args) {
    double[] myList = { 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0 };
    double total = 0;
    double max = myList[0];

    for (double number : myList) {
      total += number;
      if (number > max) {
        max = number;
      }
    }
    System.out.println("Total is " + total);
    System.out.println("Max is " + max);
  }
}
