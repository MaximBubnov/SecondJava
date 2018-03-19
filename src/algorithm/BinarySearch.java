package algorithm;

import java.util.Vector;

/**
 * Алгоритм бинарного поиска. Данные в массиве должны быть отсортированны!!! Это главное условие, иначе нет смысла.
 *
 * По формуле бинарного поиска ищем середину массива. mid = (high + low) / 2.
 *
 * Если искомое число уходим в большую сторону и делаем там тоже самое.
 *
 * Сложность алгоритма - О(log n) - логарифмическая. Если умножить кол-во данных в 2 раза, то нужно будет потратить +1 попытку.
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] members = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        bsearch(members, 3);

    }

    private static void bsearch(int[] mass, int value){
        int size = mass.length;
        int low = 0;
        int high = size - 1;

        while (low <= high) {

            //находим середину
            int mid = (low + high) / 2;

            if(value == mass[mid]) {
                System.out.println("Значение " + value + " находится на " + mid + " позиции.");
                break;
            }
            else if(value > mass[mid]) { //если значение больше, чем значение середины массива
                low = mid + 1; // рассматриваем большую половину массива
            }
            else {
                high = mid - 1; // рассматриваем меньшую половину массива
            }
        }
    }
}
