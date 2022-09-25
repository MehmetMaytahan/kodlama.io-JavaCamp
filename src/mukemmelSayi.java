public class mukemmelSayi {
    public static void main(String[] args) {

        int number = 86;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println("Sayi Mukemmeldir.");
        } else {
            System.out.println("Sayi Mukemmel Degildir.");
        }
    }
}
