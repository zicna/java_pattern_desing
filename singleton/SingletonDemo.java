
public final class SingletonDemo {
    private static SingletonDemo INSTANCE;
    private String info = "Singleton Class Info";

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SingletonDemo();
        return INSTANCE;
    }

    public void setnfo(String getInfo) {
        this.info = getInfo;
    }

    public String getInfo() {
        return info;
    }
}
