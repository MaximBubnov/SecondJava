package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 9. Напишите рекурсивный метод отображающий строку задом на перед.
 */
public class recursion {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите вашу строку : ");
        String line = reader.readLine();

        System.out.println(revers(line));

    }

    public static String revers(String line ) {
        int length = line.length();

        for (int i = length - 1; i > -1 ; i--) {
            line += line.charAt(i);
        }

        return line.substring(length);
    }
}
