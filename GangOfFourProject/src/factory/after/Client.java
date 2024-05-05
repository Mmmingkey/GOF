package factory.after;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "tjals9139@naver.com");

        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "tjals9139@gmail.com");

    }
}
