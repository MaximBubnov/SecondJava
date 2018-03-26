package other2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3. Определить является ли символ введенный с клавиатуры цифрой, буквой или знаком пунктуации.
 */
public class WhatSymbol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String symbol = reader.readLine();
        reader.close();

        whatSymb(symbol);
    }

    private static void whatSymb(String s) {
        if(s.length() > 1)
            System.err.println("Введите только один символ!");

        Pattern pattern = Pattern.compile("\\p{Digit}");   //цифра
        Matcher matcher = pattern.matcher(s);

        Pattern pattern1 = Pattern.compile("\\p{Punct}"); //символ
        Matcher matcher1 = pattern1.matcher(s);

        Pattern pattern2 = Pattern.compile("\\p{LC}");  //буква
        Matcher matcher2 = pattern2.matcher(s);


        if(matcher.matches())
            System.out.println("Это цифра");
        if(matcher1.matches())
            System.out.println("Это символ");
        if(matcher2.matches())
            System.out.println("Это буква");

    }
}
