public class Factory {

    public static CardType getCard(String type) {
        switch (type) {
            case "Silver":
                return new SilverCard();

            case "Gold":
                return new GoldCard();

            case "Platinum":
                return new PlatinumCard();

            default:
                return null;
        }
    }
}
