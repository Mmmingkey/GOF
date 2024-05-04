package singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App{
    public App() {
    }

    public static void main(String[] args) throws Exception{
        Settings st = Settings.getInstance5();
        Settings st2 = null;
        //private 생성자 무시하고 객체 생성하는 방법

        // 1. reflection 대응이 안됨
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