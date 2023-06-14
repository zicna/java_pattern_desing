public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Builder atern");
        
        Label cocaCola = new Label.Builder("dsd", 90).addSugar(100).build();
        System.out.println("Hello from Builder atern");

    }
}
