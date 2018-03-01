package Singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n" +
                "Если вы видите одно и то же значение, то singleton был повторно использован ( =) !) " + "\n" +
                "Если вы видите разные значения, то были созданы 2 синглтона ( =( !!)" + "\n\n" +
                "RESULT:" + "\n");

       Thread threadFoo = new Thread(new ThreadFoo());
       Thread threadBar = new Thread(new ThreadBar());
       threadFoo.start();
       threadBar.start();

    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            SingletonSun sun = SingletonSun.getINSTANCE("FOO");
            System.out.println(sun.value);
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SingletonSun sun = SingletonSun.getINSTANCE("BAR");
            System.out.println(sun.value);
        }
    }
}
