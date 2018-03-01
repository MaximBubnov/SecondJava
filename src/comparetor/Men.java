package comparetor;

public class Men {

    public int age;
    public int childrenCount;
    public int weight;
    public int height;
    public String name;

    public Men(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Men{" +
                "age=" + age +
                '}';
    }
}
