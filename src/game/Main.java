package game;

public class Main {
    public static void main(String[] args) {
        Game mainGame = new Game("PikaPika Game");
        LeaderBoard leaderBoard = new LeaderBoard(5);
        leaderBoard.addEntry(new GameEntry("Prem",100));
        leaderBoard.addEntry(new GameEntry("Hari",45));
        leaderBoard.addEntry(new GameEntry("Ravi",89));
        leaderBoard.addEntry(new GameEntry("Vimal",67));
        leaderBoard.addEntry(new GameEntry("Balaji",80));
        leaderBoard.addEntry(new GameEntry("Nandha",90));
        leaderBoard.addEntry(new GameEntry("pradeep",80));
        leaderBoard.showBoard();
    }
}

class Game{
    String name = "";
    Game(String name){
        this.name = name;
        System.out.println("Welcome To "+name);
    }

}