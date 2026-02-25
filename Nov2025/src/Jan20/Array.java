package Jan20;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the arr val you want");

        int x = sc.nextInt();
        try{
            System.out.println(arr[x]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
