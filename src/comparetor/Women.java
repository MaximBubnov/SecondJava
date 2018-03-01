package comparetor;

public class Women implements Comparable<Women>{

    public int age;
    public int childrenCount;
    public int weight;
    public int height;
    public String name;

    public Women(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Women o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Women{" +
                "age=" + age +
                '}';
    }
}
