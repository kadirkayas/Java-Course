public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,3,4,5,6,32,7,654,3};
        int search=6;
        boolean isFound = false;

        for (int number : numbers) {
            if (number == search) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
    }
}