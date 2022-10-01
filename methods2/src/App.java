public class App {

  public static void main(String[] args) {
    String message = "Weather is very good today";
    String newMessage = giveCity();
    System.out.println(newMessage);
    int number = collect(2, 6);
    System.out.println(number);
    int collect = collect2(2, 1, 3, 4, 56, 8, 5, 7);
    System.out.println(collect);
  }

  public static void add() {
    System.out.println("Added");
  }

  public static void delete() {
    System.out.println("Deleted");
  }

  public static void update() {
    System.out.println("Updated");
  }

  public static int collect(int number, int number2) {
    return number + number2;
  }

  public static int collect2(int... numbers) {
    int collect = 0;
    for (int number : numbers) {
      collect += number;
    }
    return collect;
  }

  public static String giveCity() {
    return "Afyonkarahisar";
  }
}
