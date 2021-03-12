import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        System.out.println("Your name is " + name);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}