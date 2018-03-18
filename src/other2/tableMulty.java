package other2;

/**
 * 6. Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.
 */
public class tableMulty {
    public static void main(String[] args) {
        multy(4);
    }

    private static void multy(int number) {
        for (int i = 0; i <11 ; i++) {
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}
