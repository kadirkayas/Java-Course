public class Main {
    public static void main(String[] args) {
        double[] mylist={1.2,2.3,3.4,4.5};
        double total=0;
        double biggest=0;

        for (double number:mylist){
            total+=number;
            if (number>biggest){
                biggest=number;
            }
        }
        System.out.println(total);
        System.out.println(biggest);
    }
}