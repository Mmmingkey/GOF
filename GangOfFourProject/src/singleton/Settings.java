//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {
    }

    //1. eager singleton
    // 장점 : thread safe함, 성능이 좋음, 단순함
    // 단점 : 해당 클래스가 로드될 때 인스턴스가 무조건 초기화됨 (해당 인스턴스를 사용하지 않아도 초기화가 될 수 있음 -> 메모리 낭비)
    private static final Settings INSTANCE = new Settings();
    public static Settings getInstance() {
        return INSTANCE;
    }

    //2. not synchronized lazy singleton
    // 장점 : 처리속도가 비교적 빠름, 인스턴스를 사용하려할 때 초기화 되므로 필요할 때만 메모리에 적재하는 효율적인 방식
    // 단점 : thread safe하지 않음
    private static Settings instance2;
    public static Settings getInstance2() {
        if (instance2 == null) {
            instance2 = new Settings();
        }
        return instance2;
    }

    //3. synchronized lazy singleton
    // 장점 : thread safe함
    // 단점 : 메소드가 synchronized 하게 동작하는데, 특정 thread가 해당 메소드에 접근했을 때 lock을 걸어 타 메소드에서 접근이 불가능 -> multi thread환경에서 성능이 안좋음
    private static Settings instance3;
    public static synchronized Settings getSyncInstance3() {
        if (instance3 == null) {
            instance3 = new Settings();
        }

        return instance3;
    }

    //4. double checked locking singleton
    // 장점 : thread safe함, instance4가 null일 때 (초기화 전)에만 synchronized 하게 즉, 필요한 부분만 동기적으로 동작함 -> synchronized lazy singleton 보다 성능이 좋음
    // 단점 : innerclass singleton 보다 성능이 안좋음, 복잡함
    private static volatile Settings instance4;
    public static Settings getInstance4() {
        if (instance4 == null) {
            synchronized(Settings.class) {
                if (instance4 == null) {
                    instance4 = new Settings();
                }
            }
        }
        return instance4;
    }

    //5. inner static class singleton
    // 장점 : thread safe함, getInstance5 메소드가 처음 실행될 때 SettingsHolder 내부클래스가 load되며 인스턴스 초기화됨 즉, 성능이 앞서 말한 singleton중 가장 좋음
    // 단점 : 음,, 내부 메소드를 사용하므로 java runtime data area의 methoad area의 메모리 낭비가 조금 있을 수 있다,,? 정도 ㅋㅋ
    private static class SettingsHolder {
        private static final Settings INSTANCE_5 = new Settings();
    }
    public static Settings getInstance5() {
        return SettingsHolder.INSTANCE_5;
    }

    // 객체 역직렬화 할 때 실행되는 메소드 (원랜 여기서 new Settings() 등의 작업이 이루어짐)
    protected Object readResolve(){
        return getInstance5();
    }
}
