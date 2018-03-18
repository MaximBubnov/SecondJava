package other2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3. Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.
 */
public class MyName {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name. please: ");

        String name = reader.readLine();

        System.out.printf("Thanks for you support, dear : == %s == !", name);
    }
}
