public class miniProjeAsalSayi {
    public static void main(String[] args) {
        System.out.println("---------------------");

        int sayi = 1;
        boolean asal = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
            }
        }

        if (sayi < 2) {
            System.out.println("Gecersiz Sayi Girildi.");
            return;
        }

        if (asal) {
            System.out.println("Sayi Asaldir.");
        } else {
            System.out.println("Sayi Asal Degildir.");
        }

    }
}
