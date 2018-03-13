package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3. Напишите метод, который будет увеличивать заданный элемент массива на 10%.
 */
public class tenpersent {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] mass = new double[5];

        System.out.println("Давайте заполним массив!");
        for (int i = 0; i < mass.length ; i++) {
            System.out.println("Введите " + i + " элемент массива : ");
            mass[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("");
        System.out.println("Вот наш массив");

        for (int i = 0; i < mass.length ; i++) {
            System.out.print(mass[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Выберите элемент массива, который хотите увеличить на 10%");

        int countMass = Integer.parseInt(reader.readLine());

        try {
            double element = mass[countMass];

            double newEl = tenper(element);

            mass[countMass] = newEl;

            System.out.println();
            for (int i = 0; i <5 ; i++) {
                System.out.print("Думаю.....      ");
                Thread.sleep(500);
            }

            System.out.println();
            System.out.println();
            System.out.println("Результат: " + tenper(element));
            System.out.println();
            System.out.println("Наш новый массив:");

            for (int i = 0; i < mass.length; i++) {
                System.out.print(mass[i] + " ");
            }
        }
        catch (Exception e) {
            System.err.println("Неверный диапазон размера массива!!!!");
        }
    }

    static double tenper(double a) {
        return a + a * 0.1;
    }
}
