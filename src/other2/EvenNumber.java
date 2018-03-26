package other2;

import java.io.*;
import java.util.ArrayList;

/**
 * Из файла получить только четные цифры и записать их в другой файл.
 */
public class EvenNumber {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите имя файла.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();


        reader = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile)));

        File file = new File("C:/BD/even.txt");

        FileWriter writer = new FileWriter(file);

        ArrayList<Integer> list = new ArrayList<>();

        while (reader.ready()) {
            int num = Integer.parseInt(reader.readLine());

            String s = String.valueOf(num);
            if(num % 2 == 0) {
                list.add(num);
                writer.write(s);
                writer.append('\t');

            }
        }

        reader.close();
        writer.close();

        System.out.println("Ваши числа в файле, который находится по этому пути: " + file.getPath());

        System.out.println("А эти числа должны были записаться в файл: ");
        for(int x : list)
            System.out.print(x + " ");


    }
}
