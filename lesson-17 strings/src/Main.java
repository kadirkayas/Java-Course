public class Main {
    public static void main(String[] args) {
        String message="Hello World!";

        System.out.println(message.charAt(4));
        String newMessage=message.replace("Hello","Merhaba");
        System.out.println(newMessage);
        System.out.println(message.substring(2,7));
    }
}