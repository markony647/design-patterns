package patterns.singleton;

public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
