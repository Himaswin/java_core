package Feb14;

public class GameImpl implements IGame {

    @Override
    public String drawGame(String team1, String team2) {
        return Math.random()> 0.5?team1:team2;
    }
}
