package create.factory.after;

public abstract class DefaultShipFactory implements ShipFactory{
    // 필요 시 interface를 상속받는 추상클래스를 만들어서 계층을 추가해도 좋은 방법임

    @Override
    public abstract Ship createShip();

    @Override
    public void validate(String name, String email) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
        System.out.println(ship);
    }

}
