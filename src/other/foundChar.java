package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 6. Создайте простую игру основанную на угадывании букв.
 Пользователь должен угадать загаданную букву A-Z введя ее в консоль. Если пользователь угадал букву программа выведет «Right» и игра закончится,
 если нет, то пользователь продолжит вводить буквы.
 (Опционально) Вывести «You’re too low»- если пользователь ввел букву меньше загаданной, «You’re too high»- если пользователь ввел букву больше загаданной.
 */
public class foundChar {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("Сейчас компьютер загадет букву, а вы должны ее отгадать");

        System.out.print("Загадываю");
        for (int i = 0; i < 5; i++) {
            System.out.print("..");
            Thread.sleep(500);
        }

        System.out.println();
        System.out.println("ЗАГАДАЛ! ПОПРОБУЙ ТЕПЕРЬ УГАДАТЬ!");

        System.out.println();

        char a = (char) ('A' + Math.random() * 26);

        System.out.println(a);

        System.out.println("Напиши букву английского алфавита: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        while (true) {
            char b = reader.readLine().toUpperCase().charAt(0);

            if(b == a) {
                System.err.println("Вы ВЫИГРАЛИ!!");
                count++;
                break;
            }
            else if(b < a) {
                System.out.println("Попробуйте букву, стоящую ВЫШЕ по алфавиту..");
                count++;
            }
            else {
                System.out.println("Попробуйте букву, стояющую НИЖЕ по алфавиту..");
                count++;
            }
        }

        System.out.println("Число ваших попыток : " + count);
    }
}
