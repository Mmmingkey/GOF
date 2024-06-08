package create.factory.after;

public class Client {

    public static void main(String[] args) {
//        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "tjals9139@naver.com");
//        System.out.println(whiteShip);
//
//        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "tjals9139@gmail.com");
//        System.out.println(blackShip);

        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "mk@google.com");
        client.print(new BlackShipFactory(), "blackship", "mk2@google.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
