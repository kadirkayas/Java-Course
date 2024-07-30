public class Main {
    public static void main(String[] args) {

        char letter='A';

        switch (letter) {
            case 'A':
            case 'O':
            case 'U':
                System.out.println("sound");
                break;
            case 'E':
                System.out.println("not sounded");
                break;
            default:
                System.out.println("invalid letter");
                break;
        }
    }
}