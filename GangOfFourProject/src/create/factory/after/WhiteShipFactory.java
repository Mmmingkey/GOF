package create.factory.after;

public class WhiteShipFactory extends DefaultShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
