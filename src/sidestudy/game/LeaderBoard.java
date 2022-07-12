package sidestudy.game;

public class LeaderBoard {
    private GameEntry[] bord;
    public LeaderBoard(int capacity){
        bord = new GameEntry[capacity];
    }
    public boolean addEntry(GameEntry entry){
        int i = 0 ;
        for(i = 0 ; i<bord.length; i++){
            if(bord[i] == null){
                bord[i] = entry;
                break;
            }else{
                if(bord[i].getScore() < entry.getScore()){
                    if(i == bord.length-1) bord[i] = entry;
                    else {
                        while (i < bord.length){
                            GameEntry temp = bord[i];
                            bord[i] = entry;
                            entry = temp;
                            ++i;
                        }
                    }
                }
            }
        }
        return true;
    }

    public void showBoard(){
        System.out.println("\n\n===== Score board =====");
        for (GameEntry i : bord) if(i!=null) System.out.println(i.print());
    }
}
