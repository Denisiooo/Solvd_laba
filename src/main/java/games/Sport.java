package games;

public class Sport {
    protected String winner;
    protected String currentSport;
    private AllGames games;

    public Sport(String currentSport) {
        this.currentSport = currentSport;
    }

    public Sport(AllGames allGames) {
        this.games = allGames;
    }


    public String getCurrentSport() {
        return currentSport;
    }

    public void setCurrentSport(String currentSport) {
        this.currentSport = currentSport;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
