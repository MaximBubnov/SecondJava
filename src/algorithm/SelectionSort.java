package algorithm;

/**
 * СОРТИРОВКА ВЫБОРОМ.
 * Массив делится на два под-массива. 1 - отсортированный, 2 - неотсортированный.
 * каждой итерации во всей последовательности неотсортированных данных выбирается минимальный элемент (при сортировке по возрастанию)
 * и помещается в первую позицию неотсортированной последовательности.
 * Тем самым готовая (отсортированная) последовательность увеличивается на один элемент, а исходная (неотсортированная) последовательность
 * на один элемент уменьшается.  Работа алгоритма продолжается до тех пор, пока весь массив не будет упорядочен.
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] mass = new int[10];

        for (int i = 0; i < mass.length ; i++) {
            mass[i] = (int) (Math.random() * 15);
        }

        for (int i = 0; i < mass.length ; i++) {
            System.out.print(mass[i] + " ");
        }

        System.out.println();

        selectionSort(mass);

        for (int i = 0; i < mass.length ; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    private static void selectionSort(int[] mass) {
        for (int i = 0; i < mass.length; i++) {

            // предпологаем, что начальный элемент рассматриваемого фрагмента и будет минимальным

            int min = mass[i]; // предполагаемый минимальный элемент
            int imin = i;   // индекс минимального жлемента

            // Просматриваем оставшийся фрагмент массива и ищем там элемент, меньший предположенного минимума.
            for (int j = i + 1; j < mass.length; j++) {

                //Если находим новый минимум, то запоминаем его индекс
                //И обновляем значение минимума
                if (mass[j] < min) {
                    min = mass[j];
                    imin = j;
                }
            }

            //Проверяем, нашелся ли элемент меньше, чем стоит на текущей позиции.
            // Если нашелся, то меняем элементы местами

            if (i != imin) {
                int temp = mass[i];
                mass[i] = mass[imin];
                mass[imin] = temp;
            }
        }
    }
}
