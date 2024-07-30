public class Main {
    public static void main(String[] args) {
        int number1=221,number2=284;
        boolean isFriend=false;
        int sum1=0,sum2=0;

        for(int i=1;i<number1;i++){
            if (number1 % i ==0){
                sum1+=i;
            }
        }
        for(int i=1;i<number2;i++){
            if (number2 % i ==0){
                sum2+=i;
            }
        }
        if (sum1==number2 && sum2==number1){
            isFriend=true;
        }
        System.out.println(isFriend);


    }
}