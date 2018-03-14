package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 4. Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
 */
public class enterWord {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваше предложение...");

        String line = reader.readLine();

        System.out.println();
        System.out.println("Ваша строка такая: < " + line + " >");
        System.out.println();
        System.out.print("Но... В ней есть нехорошее слово БЯКА, поэтому мы исправим ваше предложение");
        for (int i = 0; i < 5 ; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println();
        System.out.println();
        System.out.println("Теперь оно выглядит так: < " + rename(line) + " >");

    }

    public static String rename(String line) {
        return line.replaceAll("бяка", " --ВЫРЕЗАНО ЦЕНЗУРОЙ-- ");

    }
}
