package create.abstract_factory.after;

import create.factory.after.DefaultShipFactory;
import create.factory.after.Ship;
import create.factory.after.WhiteShip;

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
