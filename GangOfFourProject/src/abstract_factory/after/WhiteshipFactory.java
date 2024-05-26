package abstract_factory.after;

import abstract_factory.before.WhiteAnchor;
import abstract_factory.before.WhiteWheel;
import factory.after.DefaultShipFactory;
import factory.after.Ship;
import factory.after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {
    // client
    // 해당 클래스 입장에서 어떤 구현체인지 숨김

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
