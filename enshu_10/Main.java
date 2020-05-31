public class Main {
    public static void main(String[] args) {
        Hero hr = new Hero("—EŽÒ");
        Matango mt = new Matango('A');
        PoisonMatango pm = new PoisonMatango('B');

        mt.attack(hr);
        pm.attack(hr);
    }
}