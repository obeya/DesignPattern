package ink.cashflow.singleton;

public class SingletonPattern {

    private static final SingletonPattern singleton = new SingletonPattern();

    private SingletonPattern() {

    }

    public synchronized SingletonPattern getInstance() {
        return singleton;
    }

}
