public class Main {
    public static void main(String[] args) {

        double[] myList = {1.16, 8.18, 3.41, 4.78};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam deger : " + total);

        /*
        for (int i=0; i<myList.length; i++) {
            if (max < myList[i]) {
                max = myList[i];
            }
        }
        */

        System.out.println("Max deger : " + max);

    }
}