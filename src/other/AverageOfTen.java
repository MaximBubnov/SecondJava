package other;

/**
 * 8. Найдите среднее арифметическое массива из 10 элементов типа double.
 */
public class AverageOfTen {
    public static void main(String[] args) {

        double[] mass = new double[10];

        for (int i = 0; i <mass.length ; i++) {
            mass[i] = (Math.random() * 5);
        }

        System.out.println("Our array: ");
        for (int i = 0; i < mass.length ; i++) {
            System.out.print(mass[i] + " ");
        }

        double a = 0;

        for (int i = 0; i < mass.length ; i++) {

            a += mass[i];
        }
        System.out.println();
        System.out.println("Average of numbers: ");
        System.out.println(a / mass.length);


    }
}
