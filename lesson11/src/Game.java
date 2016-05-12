import java.io.Console;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Statistics statistics = new Statistics();

        Scanner console = new Scanner(System.in);

        String input = console.next();
        while (!input.equals("exit")) {

            System.out.println("Game started...");

            Player playerX = new Player("Ivanov", "Ivan", "Petrovich", 25, 'X');
            Player playerO = new Player("Petrov", "Petr", "Petrovich", 35, 'O');

            Board board = new Board(playerX, playerO);
            board.printBoard();

            while (!board.gameFinished()) {
                System.out.println("Player " + board.currentPlayer + " moves...");
                System.out.print("Enter your move: ");
                String move = console.next();
                if (!board.makeMove(move)) {
                    System.out.println("Input was incorrect. Repeat your move.");
                }

                board.printBoard();
            }

            System.out.println("The winner is " + board.calculateWinner());
            System.out.println();

            GameResult resultWinner = new GameResult(board.calculateWinner(), "win");
            GameResult resultLoser = new GameResult(board.calculateLoser(), "lost");
            statistics.addResult(resultWinner);
            statistics.addResult(resultLoser);

            input = console.next();

        }
    }
}
