import java.util.Arrays;
import java.util.Scanner;

public class PlayGame {
    private String playerName;
    private String player2Name;
    private int turn=1;
    private int moveCount=0;
    Scanner s=new Scanner(System.in);
    private String[][] a=new String[5][5];

    public PlayGame(){
        System.out.println("What is your name player 1?");
        playerName=s.nextLine();
        System.out.println("What is your name player 2?");
        player2Name=s.nextLine();
        Board game=new Board();
        a=game.generate();
    }

    public void play(){
        while (determineWinner().equals(" ")) {
            String player=playerName;
            if (turn==2)
                player=player2Name;
            System.out.println(player+", in which column would you like to mark?");
            int c=s.nextInt();
            System.out.println("In which row would you like to mark?");
            int r=s.nextInt();
            move(r, c);
            determineWinner();
        }
        System.out.println("Congratulations, "+determineWinner()+"!");
    }

    private void move(int col, int row){
        String mark;
        if (turn==1)
            mark="X";
        else mark="O";
        if (a[col][row].equals(" ")) {
            a[col][row] = mark;
            moveCount++;
            changeTurn();
        } else System.out.println("Invalid space. No. Please try again.");
        for (int i=0; i<5; i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }

    private void changeTurn(){
        if (turn==1)
            turn=2;
        else turn=1;
    }

    private String determineWinner(){
        for (int row=0; row<5; row++){
            if (Arrays.toString(a[row]).contains("XXX"))
                return playerName;
            else if (Arrays.toString(a[row]).contains("OOO"))
                return player2Name;
        }
        for (int i=0; i<5; i++){
            String str="";
            for (int x=0; x<5; x++){
                str+=a[x][i];
            }
            if (str.contains("XXX"))
                return playerName;
            if (str.contains("OOO"))
                return player2Name;
        }
        if (a[0][1].equals("X")&&a[1][2].equals("X")&&a[2][3].equals("X"))
            return playerName;
        else if (a[3][4].equals("X")&&a[1][2].equals("X")&&a[2][3].equals("X"))
            return playerName;
        else if (a[0][1].equals("O")&&a[1][2].equals("O")&&a[2][3].equals("O"))
            return player2Name;
        else if (a[3][4].equals("O")&&a[1][2].equals("0")&&a[2][3].equals("O"))
            return player2Name;
        else if (a[2][0].equals("X")&&a[1][1].equals("X")&&a[0][2].equals("X"))
            return playerName;
        else if (a[2][0].equals("X")&&a[1][1].equals("X")&&a[0][2].equals("O"))
            return player2Name;
        else if (a[3][0].equals("X")&&a[2][1].equals("X")&&a[1][2].equals("O"))
            return player2Name;
        else if (a[3][0].equals("X")&&a[2][1].equals("X")&&a[1][2].equals("X"))
            return playerName;
        else if (a[0][3].equals("X")&&a[2][1].equals("X")&&a[1][2].equals("O"))
            return player2Name;
        else if (a[0][3].equals("X")&&a[2][1].equals("X")&&a[1][2].equals("X"))
            return playerName;
        else if (a[0][2].equals("X")&&a[1][3].equals("X")&&a[2][4].equals("X"))
            return playerName;
        else if (a[0][2].equals("O")&&a[1][3].equals("O")&&a[2][4].equals("O"))
            return player2Name;
        else if (a[2][0].equals("O")&&a[3][1].equals("O")&&a[4][2].equals("O"))
            return player2Name;
        else if (a[2][0].equals("X")&&a[3][1].equals("X")&&a[4][2].equals("X"))
            return playerName;
        else if (a[4][2].equals("O")&&a[3][3].equals("O")&&a[2][4].equals("O"))
            return player2Name;
        else if (a[4][2].equals("X")&&a[3][3].equals("X")&&a[2][4].equals("X"))
            return playerName;
        else if (a[1][0].equals("O")&&a[2][1].equals("O")&&a[3][2].equals("O"))
            return player2Name;
        else if (a[1][0].equals("X")&&a[2][1].equals("X")&&a[3][2].equals("X"))
            return playerName;
        else if (a[4][3].equals("O")&&a[2][1].equals("O")&&a[3][2].equals("O"))
            return player2Name;
        else if (a[4][3].equals("X")&&a[2][1].equals("X")&&a[3][2].equals("X"))
            return playerName;
        else if (a[4][1].equals("O")&&a[3][2].equals("O")&&a[2][3].equals("O"))
            return player2Name;
        else if (a[4][1].equals("X")&&a[3][2].equals("X")&&a[2][3].equals("X"))
            return playerName;
        else if (a[1][4].equals("O")&&a[3][2].equals("O")&&a[2][3].equals("O"))
            return player2Name;
        else if (a[1][4].equals("X")&&a[3][2].equals("X")&&a[2][3].equals("X"))
            return playerName;
        return " ";
    }
}
