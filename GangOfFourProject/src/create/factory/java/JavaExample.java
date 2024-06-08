package create.factory.java;

import java.util.Calendar;
import java.util.Locale;

public class JavaExample {

    public static void main(String[] args) {
        //Calendar 적용 예시
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());


        /*
            구성도는 아래와 같음.
            ㅡㅡㅡㅡㅡ                      ㅡㅡㅡㅡㅡ
            | Creator|          ---->       | Product|
            ㅡㅡㅡㅡㅡ          (use)       ㅡㅡㅡㅡㅡ
                 ^                              ^
                 |                              |
                 |                              |
           ㅡㅡㅡㅡㅡㅡㅡㅡㅡ            ㅡㅡㅡㅡㅡㅡㅡㅡㅡ
           | ConcreteCreator|            | ConcreteProduct |
           ㅡㅡㅡㅡㅡㅡㅡㅡㅡ            ㅡㅡㅡㅡㅡㅡㅡㅡㅡ

        */

        // factory.after 패키지
        // Creator -> ShipFactory
        // ConcreteCreator -> WhiteShipFactory, BlackShipFactory
        // Product -> Ship
        // ConcreteProduct -> WhiteShip, BlackShip

        //BeanFactory도 factory 패턴 적용
        // BeanFactory bf = new AnnotationConfigApplicationContext(Ex.class);
        // 여기서 BeanFactory가 *Creator*, AnnotationConfigApplicationContext가 *ConcreteCreator*
        //String hi = bf.getBean("hi", String.class);
        // 여기서 hi가 *ConcreteProduct* getBean이 Product


    }
}
