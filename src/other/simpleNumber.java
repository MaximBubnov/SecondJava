package other;

/**
 * 7. Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
 (Опционально) Дополните программу так, чтобы она вычисляла составные числа.
 */
public class simpleNumber {
    public static void main(String[] args) {

        int a = 2; //проверяемые числа.
        String qty; //вердикт.
        while (a <101){ //цикл перебирает все числа с 2 до 100.
            boolean simple = true; //изначально исходим из того что проверяемое число простое.
            int n = 2; //делитель, в следующем цикле перебираем все числа от 2ки, вероятность разделить без остатка тем выше, чем меньше число, поэтому идем снизу вверх.
            while (simple == true && n<a){ // покидаем цикл: если нашли первый делитель без остатка, или дошли до конца.
                if (a % n == 0){ // если нет остатка от деления, значит число составное.
                    simple = false;
                }
                n++;
            }
            if (simple){qty = "- простое число";} else {qty = "- составное число";}
            System.out.println(a + qty);
            a++;
        }

    }
}
