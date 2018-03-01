package Singleton;

public class SingletonSun {
    private static SingletonSun INSTANCE;
    public String value;


    public static synchronized SingletonSun getINSTANCE(String value) {

        if(INSTANCE == null)
            INSTANCE = new SingletonSun(value);

        return INSTANCE;

    }

    private SingletonSun(String value) {
        this.value = value;
    }
}


 /*if (INSTANCE == null) {
synchronized (SingletonSun.class) {
        if (INSTANCE == null) {
        INSTANCE = new SingletonSun(value);
        }
        }
        }
        return INSTANCE;*/