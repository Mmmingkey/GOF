package abstract_factory.after;

import abstract_factory.before.WhiteAnchor;
import abstract_factory.before.WhiteWheel;
import factory.after.ShipFactory;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
