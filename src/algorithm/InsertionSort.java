package algorithm;

/**
 * Массив делится на два под-массива. 1 - отсортированный, 2 - неотсортированный.
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] mass = new int[10];

        for (int i = 0; i < mass.length ; i++) {
            mass[i] = (int) (Math.random() * 25);
        }

        insertSort(mass);

        for (int i = 0; i < mass.length ; i++) {
            System.out.print(mass[i] + " ");
        }

        insSort(mass);

        System.out.println();

        for (int i = 0; i < mass.length ; i++) {
            System.out.print(mass[i] + " ");
        }

    }

    private static void insertSort(int[] mass) {
         /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < mass.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = mass[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < mass.length; j++) {
                //Если находим, запоминаем его индекс
                if (mass[j] < min) {
                    min = mass[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = mass[i];
                mass[i] = mass[min_i];
                mass[min_i] = tmp;
            }
        }
    }

    private static void insSort(int[] mass) {
        int temp, j;

        for (int i = 0; i < mass.length ; i++) {
            temp = mass[i]; //1 элемент массива (2 по списку). Т.к предполагается, что 0 элемент массива минимальный.
            for (j = i - 1; j >=0 && mass[j] > temp ; j--) { // сравниваем последующий с предыдущим

                mass[j + 1] = mass[j]; // меняем их местами, если 2 парам for = true
            }

            mass[j + 1] = temp;
        }
    }
}
