package create.abstract_factory.after;

import create.factory.after.Ship;
import create.factory.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFac = new WhiteshipFactory(new WhiteshipPartsFactory());
        ShipFactory shipFacPro = new WhiteshipFactory(new WhitePartsProFactory());

        Ship ship = shipFac.orderShip("ship", "mk.kim");

        Ship shipPro = shipFacPro.orderShip("shipPro", "mk.seo");

        System.out.println(ship.getAnchor().getClass());
        System.out.println(shipPro.getAnchor().getClass());
    }
}
