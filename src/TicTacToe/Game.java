package TicTacToe;

import java.util.Objects;

public class Game {
    public static String[][] gameBoard = new String[3][3];
    Player player = new Player();
    static boolean isWon;
    int row;
    int column;
public void letGameBoardToZero(){
        for (int i = 0; i < gameBoard.length ; i++) {
            for (int j = 0; j < gameBoard.length ; j++) {
                gameBoard[i][j] = " ";
            }
        }
    }
    public String[][] displayGameBoard(){
    letGameBoardToZero();
    return gameBoard;
}
    public static void checkDraw(){
    if (!isWon){
    int count = 0;
    for (String[] row : gameBoard){
    for (String space : row){
     if (!space.equals(TicTacToeEnum.EMPTY.getName())){
    count++;
     }
    }
    }
    if (count == 9){
    isWon = true;
    printCheckMessage();
    }
    }
    }

    private static void printCheckMessage() {
    TicTacToeMain.displayTicTacBoardAsGameIsOn();
        System.out.println("It's a tie");
        System.exit(0);
    }
    public void takePositionForPlayerAndComputer(int position){
        row = (position - 1) / 3;
        column = (position - 1) % 3;

        if (!Objects.equals(gameBoard[row][column], TicTacToeEnum.EMPTY.getName()))
            throw new IllegalArgumentException("Position has been taken " +
                    " Please enter a valid position:");

        validatePosition(position);
        gameBoard[row][column] = player.getNextPlayer();

    }
 public void takePosition(int position) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        if (!Objects.equals(gameBoard[row][col], TicTacToeEnum.EMPTY.getName()))
            throw new IllegalArgumentException("Position has been taken " +
                    " Please enter a valid position:");

        validatePosition(position);
        gameBoard[row][col] = player.getNextPlayer();
    }
 private static void validatePosition(int position) {
        if (position < 1 || position > 9)
            throw new IllegalArgumentException("Position can only be between 1 and 9");
    }
 public static boolean winningPosition() {

        if (gameBoard[0][0].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[0][1].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[0][2].equalsIgnoreCase(TicTacToeValues.X.getName())) {
            printWinningMessage();
            isWon = true;
        }

        if (gameBoard[1][0].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[1][1].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[1][2].equalsIgnoreCase(TicTacToeValues.X.getName())) {
            printWinningMessage();
            isWon = true;
        }
 if (gameBoard[2][0].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[2][1].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[2][2].equalsIgnoreCase(TicTacToeValues.X.getName())) {
            printWinningMessage();
            isWon = true;
        }
 if (gameBoard[0][0].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[1][0].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[2][0].equalsIgnoreCase(TicTacToeValues.X.getName())) {
            printWinningMessage();
            isWon = true;
  }
 if (gameBoard[0][1].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[1][1].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[2][1].equalsIgnoreCase(TicTacToeValues.X.getName())) {
            printWinningMessage();
            isWon = true;
        }
       if (gameBoard[0][2].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[1][1].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[2][0].equalsIgnoreCase(TicTacToeValues.X.getName())) {
            printWinningMessage();
            isWon = true;
       }
  if (gameBoard[0][2].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[1][2].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[2][2].equalsIgnoreCase(TicTacToeValues.X.getName())) {
            printWinningMessage();
            isWon = true;
        }

        if (gameBoard[0][0].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[1][1].equalsIgnoreCase(TicTacToeValues.X.getName()) &&
                gameBoard[2][2].equalsIgnoreCase(TicTacToeValues.X.getName())) {
            printWinningMessage();
            isWon = true;
        }
      if (gameBoard[0][0].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[0][1].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[0][2].equalsIgnoreCase(TicTacToeValues.O.getName())) {
            printWinningMessage();
            isWon = true;
        }
      if (gameBoard[1][0].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[1][1].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[1][2].equalsIgnoreCase(TicTacToeValues.O.getName())) {
            printWinningMessage();
            isWon = true;
  }

        if (gameBoard[0][0].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[1][1].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[2][2].equalsIgnoreCase(TicTacToeValues.O.getName())) {
            printWinningMessage();
            isWon = true;

        }

        if (gameBoard[2][0].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[2][1].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[2][2].equalsIgnoreCase(TicTacToeValues.O.getName())) {
            printWinningMessage();
            isWon = true;
        }

        if (gameBoard[0][0].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[1][0].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[2][0].equalsIgnoreCase(TicTacToeValues.O.getName())) {
            printWinningMessage();
            isWon = true;
      }
       if (gameBoard[0][1].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[1][1].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[2][1].equalsIgnoreCase(TicTacToeValues.O.getName())) {
            printWinningMessage();
            isWon = true;
      }
   if (gameBoard[0][2].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[1][2].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[2][2].equalsIgnoreCase(TicTacToeValues.O.getName())) {
            printWinningMessage();
            isWon = true;

        }
     if (gameBoard[0][2].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[1][1].equalsIgnoreCase(TicTacToeValues.O.getName()) &&
                gameBoard[2][0].equalsIgnoreCase(TicTacToeValues.O.getName())) {
            printWinningMessage();
            isWon = true;
    }
        return true;
    }
 public static void printWinningMessage() {
        TicTacToeMain.displayTicTacBoardAsGameIsOn();
        System.out.println("Congratulations, You won this round!!!");
        System.exit(0);
    }
}
