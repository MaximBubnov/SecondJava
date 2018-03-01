package comparetor;

public class Cat {

    public int age;
    public int weight;
    public int height;
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
