package other2;

/**
 * 2. Создайте метод, который в качестве аргумента получает число и полностью обнуляет столбец, который соответствует заданному числу.
 */
public class column {

     private  static int row = 4;
     private  static int column = 3;

    public static void main(String[] args) {

        int[][]mass = new int[row][column];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j <column ; j++) {
                mass[i][j] = (int)(Math.random() * 15);
            }
        }

       columnZero(2, mass);  // Applay our method

        for (int i = 0; i <mass.length ; i++) {
            for (int j = 0; j < mass[i].length ; j++) {
                System.out.print(mass[i][j] + "\t ");
            }

            System.out.println();
        }


    }

    public static void columnZero(int number, int[][] mass) {

        if(number > 0 && number < mass.length) {
            for (int i = 0; i < mass[number].length + 1 ; i++) {
                mass[i][number] = 0;
            }
        }
    }
}
