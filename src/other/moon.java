package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2. Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.
 */

public class moon {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите ваш земной вес ...");

        double ves = Double.parseDouble(reader.readLine());

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Вычисляем ваш вес... Хммм....");

            Thread.sleep(1000);
        }

        System.out.println(heavy(ves));
    }

    public static double heavy(double have) {
        double res;

        res = have * 0.17;

        return res;
    }
}
