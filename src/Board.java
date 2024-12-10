import java.util.Arrays;

public class Board {
    private String[][]board=new String[5][5];
    public Board(){}

    public String[][] generate(){
        for (int i=0; i<5; i++){
            for (int a=0; a<5; a++){
                board[a][i]=" ";
            }
        }
        board[2][2]="-";
        for (int i=0; i<5; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        return board;
    }
}
