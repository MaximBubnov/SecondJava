package algorithm;

import java.util.Arrays;

/**
 * СОРТИРОВКА СЛИЯНИЕМ.
 * Берется два отсортированных массива. И сливаются в один массив в отсортированном порядке.
 */
public class SortMerge {

    public static void main(String[] args) {

        //Сольем два массива в один отсортированный.

        int[] a = {1, 3, 4, 8, 9};
        int[] b = {2, 6, 8, 10, 25};

        System.out.println(Arrays.toString(merge(a, b)));
        System.out.println();

        int[] c = new int[10];

        for (int i = 0; i < c.length ; i++) {
            c[i] = (int)(Math.random() * 15);
         }

        System.out.println(Arrays.toString(c));

        System.out.println();

        System.out.println(Arrays.toString(mergeSort(c)));
    }

    private static int[] merge(int[] a, int[] b) {
        int i = 0; // сколько элементов мы взяли из первого массива
        int j = 0; // сколько элементов взяли из второго массива

        //по очереди пытаемся положить в рез-т минимальный элемент.

        int[] res = new int[a.length + b.length]; // наш рез-щий массив

        // на место k элемента будем класть либо a[i] либо b[j]
        for (int k = 0; k < res.length ; k++) {
            if(j == b.length || i < a.length && a[i] < b[j]) { //проверяем если j вышло за пределы массива, сразу берем a[i]
                                                               // или же проверяем, чтобы i не вышло за пределы массива
                res[k] = a[i]; // кладем  a[i] на место res[k]
                i++;           // и увеличиваем кол-во взятых уже элемнтов из массива а
            }
            else {
                res[k] = b[j];
                j++;
            }
        }

        return res;
    }

    //Берем массив. Разбиваем его пополам. Каждую из частей сортируем рекурсивно. Вызовем уже готовый emerge
    private static int[] mergeSort(int[] a) {

        //если длина 1 - то сортировать не будем

        if(a.length == 1) return a;

        int n = a.length; // длина массива
        int m = n / 2;    //то место, где мы его разбиваем

        int[] left = new int[m];   //левая часть массива
        int[] right = new int[n - m]; //правая часть

        //скопируем половину элементов туда, половину сюда


        System.arraycopy(a, 0, left, 0, m); //откуда, с какого элемента, куда, с какого элемента, сколько элементов
        System.arraycopy(a, m, right, 0, n - m); // разбили на две части

        //рекурсивно отсортируем

        left = mergeSort(left);
        right = mergeSort(right);

        //передаем в ответ эти два массива слиянием
        return merge(left, right);

    }


}
