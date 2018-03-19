package algorithm;

/**
 * Переворот строки. Reverse String. Несколько способов.
 */

public class ReversString {
    public static void main(String[] args) {

        String line = "hello world";

        // 1 Способ
        System.out.print("1) ");
        char[] array = line.toCharArray();
        for (int i = array.length - 1; i >=0 ; i--) {
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println();

        //2 Способ
        StringBuilder stringBuilder = new StringBuilder(line);
        stringBuilder.reverse();
        System.out.println("2) " + stringBuilder.toString());

        System.out.println();
        System.out.println();

        //3 Способ (Рекурсивно)

        System.out.println("3) " + recursiveReverse(line));


    }

    static String recursiveReverse(String s) {
        if ((s == null) || (s.length() <= 1)) {
            return s;
        }

        //charAt - вернуть символ по индексу
        //substring - вернуть подстроку начиная с индекса
        return recursiveReverse(s.substring(1)) + s.charAt(0);
    }
}
