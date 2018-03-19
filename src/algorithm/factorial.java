package algorithm;

/**
 *  Нахождение факторила. Рекурсивно и нет.
 */
public class factorial {
    public static void main(String[] args) {

        System.out.println(fact(5));

        System.out.println();

        System.out.println(factr(5));
    }

    private static int fact(int x) {
        if(x == 1)
            return 1;

        return x * fact(x - 1);
    }

    private static int factr(int x) {
        int b = 1;

        for (int i = 1; i < x + 1 ; i++) {
            b  = b * i;
        }

        return b;
    }
}
