package Jan20;

import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {
        System.out.println("Enter first num: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("Enter second num: ");
        int x = sc.nextInt();

        System.out.println(i/x);

    }
}
