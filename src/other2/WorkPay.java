package other2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4. Создайте метод, который будет считать сколько денег получает работник в неделю. Метод должен принимать на входе два аргумента
 * (зарплата в час, кол-во проработанных часов).
 Условия:
 1) Каждый час после 40 считается за полтора.
 2) Работник не может работать больше, чем 60 часов в неделю.
 3) Работник не может получать меньше 8 долларов в час.
 */
public class WorkPay {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your salary per hours: ");

        double salary = Double.parseDouble(reader.readLine());

        System.out.println("Enter your work hours: ");

        double hours = Double.parseDouble(reader.readLine());

        System.out.println("Your salary per week is : ");

        moneyInWeek(salary, hours);
    }

    private static void moneyInWeek(double priceInHour, double workHour) {

        if(priceInHour < 8 || workHour > 60)
            System.out.println("ERROR! Your data is wrong, please check your data");

        else {
            if(workHour > 40)
                workHour = workHour * 1.5;

            System.out.println(priceInHour * workHour);
        }
    }
}
