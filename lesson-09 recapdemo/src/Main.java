public class Main {
    public static void main(String[] args) {
        int number1=20,number2=25,number3=2;
        
        if(number1>number2 && number1>number3){
            System.out.println("Number1 bigger");
        } else if (number2>number1 && number2>number3) {
            System.out.println("Number 2 bigger");
        } else if (number3>number1 && number3>number2) {
            System.out.println("Number 3 bigger");
        }
    }
}