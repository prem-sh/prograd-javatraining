package game;

public class GameEntry {
    private String playerName; private int score;
    public GameEntry(String player, int score){
        this.playerName = player;
        this.score = score;
    }
    public String print(){
        return "Name : "+playerName+" | Score :"+score;
    }
    public int getScore() {
        return score;
    }
}
