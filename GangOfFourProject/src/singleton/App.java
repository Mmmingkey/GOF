//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package singleton;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Settings instance = Settings.getInstance5();
        Settings instance2 = Settings.getInstance5();
        System.out.println(instance);
        System.out.println(instance == instance2);
    }
}
