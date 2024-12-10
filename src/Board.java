import java.util.Arrays;

public class Board {
    private String[][]board=new String[5][5];
    public Board(){}

    public String[][] generate(){
        System.out.println("This is tic tac toe on a 5x5 square. The goal is still to get 3 of the same symbol in a row, column, or diagonal. However, the middle square is unavailable.");
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
