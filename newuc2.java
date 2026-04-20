import java.util.Random;

class TicTacToe {

    static char player1Symbol;
    static char player2Symbol;
    static String currentPlayer;

    static void toss() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'X';
            player2Symbol = 'O';
        }

        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " will start first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }

    public static void main(String[] args) {
        toss();
    }
}