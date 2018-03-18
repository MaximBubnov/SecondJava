package other2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Сделайте программу, которая будет проверять является ли число типа double целым.
 */
public class number {

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your number: ");

        double number  = Double.parseDouble(reader.readLine());
        System.out.println("Now we are check you number. And say you your number is integer or double");

        for (int i = 0; i < 5 ; i++) {
            System.out.print("..");
            Thread.sleep(500);
        }

        System.out.println();
        if(number % 1 == 0)
            System.out.println("Your number is INTEGER");
        else
            System.out.println("Your number is DOUBLE");
    }
}
