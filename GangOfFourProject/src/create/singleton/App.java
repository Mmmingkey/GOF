package create.singleton;

import java.io.*;

public class App{
    public App() {
    }

    public static void main(String[] args) throws Exception{
        Settings st = Settings.getInstance5();
        Settings st2 = null;
        //private 생성자 무시하고 객체 생성하는 방법

        // 1. reflection사용 시 class는 대응이 안됨 -> 단 enum으로 구현 시 대응 가능 (enum은 reflection으로 인스턴스생성 행위를 막아놨음 단, eager singleton으로 동작)
//        Constructor<Settings> ct = Settings.class.getDeclaredConstructor();
//        ct.setAccessible(true);
//        Settings settings = ct.newInstance();

        // 2. 직렬화 -> 역직렬화
        // 대응이 됨. 역직렬화 할 때 해당 클래스의 readResolve 메소드에서 return new Settings()의 작업이 이루어지는데 이를 재정의
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(st);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            st2 = (Settings) in.readObject();
        }

        System.out.println(st2);
        System.out.println(st == st2);
    }
}