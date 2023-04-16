public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,5,7,9,0};
        int wanted = 3;
        boolean varMi = false;

        for(int number : numbers){
            if(number == wanted){
                varMi = true;
                break;
            }
        }
        System.out.println(varMi);
    }
}