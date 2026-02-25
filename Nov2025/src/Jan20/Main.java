package Jan20;

import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        String name = "PRAGRA";
        name = null;

        try{
            String lowerCase = name.toLowerCase();
            System.out.println(lowerCase);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("program");

    }
}
