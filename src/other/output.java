package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**1. Напишите программу, которая считывает символы пока не встретится точка. Также предусмотрите вывод количества пробелов.
 *
 */
public class output {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        boolean isDot = true;

        int counter = 0, counterSpace = 0;

        System.out.println("Начинайте печатать....");
        do {
            list.add(reader.readLine());
            char[] mass = list.get(counter).toCharArray();

            for(char symb : mass) {

                if(symb == '.') {
                    isDot = false;
                    break;
                }

                if(symb == ' ')
                    counterSpace++;
            }

            counter++;
        }
        while (isDot);

        System.out.println("Количество пробелов равно: " + counterSpace);
    }
}
