package algorithm;

public class Fibonachi {
    public static void main(String[] args) {

        int n = 11;

        for (int i = 1; i <= n ; i++) {
            System.out.print(f(i) + " ");
        }

        System.out.println();





        fibo();
    }

    //рекурсивно

    private static int f(int index) {
        if(index <= 0)
            return index;
        else if(index == 1)
            return 1;
        else if(index == 2)
            return 1;
        else
            return f(index - 1) + f(index - 2);
    }

    //не рекурсивно

    private static void fibo() {
        int n = 11;
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
    }
}
