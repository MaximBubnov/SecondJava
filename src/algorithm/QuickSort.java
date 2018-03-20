package algorithm;

/**
 * БЫСТРАЯ СОРТИРОВКА.
 * В начале берется два указателя, которые указывают на начало (i) и конец (j) массива. И опорный эелемент (i + j)/2.
 * Указатель начала будет двигаться вперед (к концу массива), Указатель конца назад (к началу массива). В итоге они встретяться у опорного эл.
 * Указатель начала (i) сравнивается с опорным, если начало > опорник  - стоим на месте. Если меньше - проходим на след позицию в массиве.
 * Если мы остановились, начинает идти другой указатель с конца.
 * Если конец (j) < опорник - стоим на месте. Если нет - идем далее на след элемент.
 * Как только все встали, i и j - меняются местами.
 * И потом все по новой (рекурсия)
 */
public class QuickSort {

    public static int ARRAY_LENGTH = 10;
    private static int[] array = new int[ARRAY_LENGTH];

    public static void main(String[] args) {
        initArray();
        printArray();
        quickSort();
        printArray();
    }
    public static void initArray() {
        for (int i=0; i<ARRAY_LENGTH; i++) {
            array[i] = (int)(Math.random() * 100);
        }
    }

    public static void printArray() {
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH-1]);
    }

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }
}
