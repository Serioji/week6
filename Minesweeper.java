import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Minesweeper {

    static final int PLAYER_ONE_ID     = 1;
    static final int PLAYER_TWO_ID   = 2;

    public static void main(String[] args) {
        boolean isGameOver    = false;
        boolean isGameRunning = true;
        Scanner Who_is_next = new Scanner(System.in);
        System.out.println("1 = Black 2 = White");
        int PlayerId = Who_is_next.nextInt();
        getActivePlayerId(PlayerId);
        getPiecePositionIndex(6,6);
        printGameboard(gameboard);
        System.out.println("Изберете действие");
        System.out.println("1. Анализ");
        System.out.println("2. обезвреждане");
        System.out.println("3. придвижване, по бойното поле.");
        }
    public static int getActivePlayerId(int currentId) {
        if (currentId == PLAYER_ONE_ID) {
            System.out.println("its Black Player turn");
        } else
            System.out.println("Its White player turn");

        return (currentId == PLAYER_ONE_ID) ? PLAYER_TWO_ID :
                PLAYER_ONE_ID;
    }
    public static int getPiecePositionIndex(int rowPosition, int colPosition) {

        int colOffset                = 6;
        final int ARRAY_INDEX_OFFSET = 6;
        int rowOffsetFormula         = (rowPosition - ARRAY_INDEX_OFFSET) * colOffset;

        return (colPosition + rowOffsetFormula) - ARRAY_INDEX_OFFSET;
    }
   public static String[][] gameboard = {{"0","|","F", "|", "X", "|",  "X","|","X","|", "X", "|" ,"X"},
            {"1","|", "X","|", "X","|", "X","|", "X","|", "X","|","X"},
            {"2","|", "*", "|","X","|", "X","|", "X","|", "X","|", "X"},
            {"3", "|","X", "|","X", "|","*", "|","X", "|","*", "|","X"},
            {"4", "|","X", "|","X", "|","X", "|","*","|", "X","|", "X"},
            {"5","|","X", "|", "*", "|",  "X","|","X","|", "X", "|" ,"S"},
            {"|","0", "|", "1", "|",  "2","|","3","|", "4", "|" ,"5"}



    };
    public static void printGameboard(String[][] gameBoard) {
        for (String[] row : gameBoard) {
            for (String S : row) {
                System.out.print(S);
            }
            System.out.println();
        }
    }
    public static void ReadFromFileGame() {


        File file = new File("C:\\Users\\user\\Desktop\\enemy_teretory.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
    public static void ReadFromFileSearch(){
        File file = new File("C:\\Users\\user\\Desktop\\configuration.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
