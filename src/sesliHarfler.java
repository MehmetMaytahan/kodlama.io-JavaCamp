public class sesliHarfler {
    public static void main(String[] args) {
        String harf = "ö";

        String[] inceSesli = { "e", "i", "ö", "ü" };

        for (String harf2 : inceSesli) {
            if (harf.contains(harf2)) {
                System.out.println(harf + " = ince sesli harf");
                return;
            }
        }
        System.out.println(harf + " = kalin sesli harf");

    }
}
