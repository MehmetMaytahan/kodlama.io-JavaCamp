public class App {

  public static void main(String[] args) {
    String message = "Bugun Hava Cok Guzel.";

    System.out.println(" ");
    System.out.println(message);
    System.out.println("---------------------");
    System.out.println("Eleman sayisi = " + message.length());
    System.out.println("---------------------");
    System.out.println("5. eleman = " + message.charAt(6));
    System.out.println("---------------------");
    System.out.println(message.concat(" Yasasin!"));
    System.out.println("---------------------");
    System.out.println("ilk index B`mi = " + message.startsWith("B"));
    System.out.println("---------------------");
    System.out.println("son index nokta`mi = " + message.endsWith("."));
    System.out.println("---------------------");

    char[] chars = new char[5];
    message.getChars(0, 5, chars, 0);
    System.out.println(chars);
    System.out.println("---------------------");
    System.out.println("bastanden baslayarak = " + message.indexOf("a"));
    System.out.println("---------------------");
    System.out.println("sondan baslayarak = " + message.lastIndexOf("a"));
    System.out.println("---------------------");
    System.out.println("replace = " + message.replace(' ', '-'));
    System.out.println("---------------------");
    System.out.println("substring = " + message.substring(2, 10));
    System.out.println("---------------------");

    for (String kelime : message.split(" ")) {
      System.out.println(kelime);
    }

    System.out.println("---------------------");
    System.out.println(message.toLowerCase());
    System.out.println("---------------------");
    System.out.println(message.toUpperCase());
    System.out.println("---------------------");
    String newMessage = "      Hava Cok Guzel.      ";
    System.out.println(newMessage.trim());
  }
}
