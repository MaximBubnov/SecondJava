package comparetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Women> women = new ArrayList<>();
        women.add(new Women(12));
        women.add(new Women(20));
        women.add(new Women(3));
        women.add(new Women(80));

        Collections.sort(women);

        for (int i = 0; i < women.size() ; i++) {
            System.out.println(women.get(i));
        }

        System.out.println();

        ArrayList<Men> men = new ArrayList<>();
        men.add(new Men(60));
        men.add(new Men(80));
        men.add(new Men(12));
        men.add(new Men(3));

        Comparator<Men> menComparator = new Comparator<Men>() {
            @Override
            public int compare(Men o1, Men o2) {
                return o1.age - o2.age;
            }
        };

        Collections.sort(men, menComparator);

        for (int i = 0; i < men.size(); i++) {
            System.out.println(men.get(i));
        }

        System.out.println();

        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Vaska"));
        cats.add(new Cat("Maxim"));
        cats.add(new Cat("Alica"));
        cats.add(new Cat("Cat"));

        //Если нужно отсортировать строку по убыванию, то нужно поменять о1 и о2 местами.

        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(cats, catComparator);

        for (int i = 0; i < cats.size() ; i++) {
            System.out.println(cats.get(i));
        }
    }
}
