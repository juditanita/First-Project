package enums;

public class BasicEnumExample {
    public static void main(String[] args) {
     for (GameStatus gameStatus : GameStatus.values()) {
         System.out.println(gameStatus);
     }
     GameStatus gamestatus1 = GameStatus.PAUSED;
    }
}
