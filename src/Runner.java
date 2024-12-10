public class Runner {
    public static void main(String[] args) {
        PlayGame game=new PlayGame();
        System.out.println("This is tic tac toe on a 5x5 square. The goal is still to get 3 of the same symbol in a row, column, or diagonal. However, the middle square is unavailable.");
        game.play();
    }
}
