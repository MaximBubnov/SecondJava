package other2;

/**
 * 5. Напишите метод, который будет проверять является ли число палиндромом (одинаково читающееся в обоих направлениях).
 (Опционально) усовершенствуйте метод для проверки символьной строки.
 */
public class palindrom {
    public static void main(String[] args) {

        checkPaly("mama");
    }

    private static void checkPaly(String number) {

        String s = String.valueOf(number);

        StringBuilder s1 = new StringBuilder(s);

        if(s.equals(s1.reverse().toString()))
            System.out.println("It`s palyndrom");
        else
            System.out.println("It`s NOT palyndrom");
    }
}
