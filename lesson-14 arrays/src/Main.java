public class Main {
    public static void main(String[] args) {
        String[] students = new String[4];
        students[0] = "Alex";
        students[1] = "Bob";
        students[2] = "Nob";
        students[3] = "Fob";


        for (int i = 0; i < students.length; i++) {
            //System.out.println(students[i]);
        }
        for (String student : students) {
            System.out.println(student);
        }
    }
}