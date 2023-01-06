package games;

public enum AllGames {
    BIATHLON("biathlon"),
    CYCLING("cycling"),
    HOCKEY("hockey"),
    SKIING("skiing"),
    VOLLEYBALL("volleyball");

    public String sport;

    AllGames(String sport) {
        this.sport = sport;
    }
}
