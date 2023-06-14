
public class Main {
    public static void main(String[] args) {
        System.out.println("HEllo from Main class");

        SingletonDemo ins = SingletonDemo.getInstance();
        System.out.println(ins.getInfo());

        SingletonDemo ins2 = SingletonDemo.getInstance();
        ins2.setnfo("New Singleton Class");

        System.out.println(ins2.getInfo());
        System.out.println(ins.getInfo());

    }
}
