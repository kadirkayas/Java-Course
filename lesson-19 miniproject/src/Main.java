public class Main {
    public static void main(String[] args) {
        int number=23;

        boolean isAsal=true;
        for (int i=2;i<number;i++) {
            if (number%i==0){
                isAsal=false;
                return;
            }
        }
        System.out.println(isAsal);
    }
}