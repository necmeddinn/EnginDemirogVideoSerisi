public class Main {
    public static void main(String[] args) {
        int number = 23;
        int remainder = number % 2;
        boolean isPrime = true;

        System.out.println(remainder);

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " " + "Sayisi asal sayidir.");
        } else {
            System.out.println(number + " " + "Sayisi asal sayi degildir.");
        }

    }
}