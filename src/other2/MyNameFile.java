package other2;

import java.io.*;

/**
 * 7. Напишите программу, которая будет просить ввести ваше имя, а потом ЗАПИШЕТ ЕГО В ФАЙЛ
 */

public class MyNameFile {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();

        File file = new File("C:/BD/maname.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(name);
        writer.close();

        System.out.println("Спасибо, что были с нами! Ваше файл находится в : " + file.getPath());
    }
}
