package nl.novi.tictactoe;

import java.util.Scanner;

//Every program in Java is written as a class.
//All code (programs) in Java must be defined inside a class in a source file, and the name of the class must match the file name.
public class Main {

    //main methode
    public static void main (String[] args) {

        //welkom boodschap
        System.out.println("\nWelkom bij het spel Boter, Kaas & Eieren!\n");

        //maak een bord
        Field [] board = new Field[9];
        for (int i = 0; i < 9; i++) {
            board[i] = new Field(Integer.toString(i));
            //System.out.println(board[i]);
        }
        //print board
        printBoard(board);

        //Object is an instance of a class / a variable of a class type
        //maak twee nieuwe instanties (objecten) aan van de Player class voor player A en player B
        //ClassName ReferenceVariable = new ClassName();
        Player playerA = new Player("Kruisje", "X");
        Player playerB = new Player("Rondje", "O");

        //nieuw spel aanmaken
        Game game = new Game(playerA, playerB);

        //bepaal speler, zit nu in het game object
        //Player currentPlayer = playerA;
        boolean hasWon = false;

        //while loop , herhaal stappen tot er een winnaar is
        while (!hasWon){

            //geef de speler de mogelijkheid een X te zetten
            System.out.println("\nGeef het veld aan waar een "+ game.getCurrentPlayer().getName()+" moet komen te staan");

            //input player
            Scanner input = new Scanner(System.in);
            int selectedField = input.nextInt();

            String currentPlayerToken = game.getCurrentPlayer().getToken();
            board [selectedField].setToken(currentPlayerToken);

            //print board
            printBoard(board);

            // kijk of de speler heeft gewonnen
            hasWon = game.hasPlayerWon(board);

            if (hasWon){
                game.getCurrentPlayer().setScore(1);
            }

            //als niet gewonnen, switch player
            game.switchPlayer();

        }
        System.out.println("\nGame Over!");
        System.out.println ("\nSpeler "+ playerA.getName() + " heeft een score van " +playerA.getScore());
        System.out.println ("\nSpeler "+ playerB.getName() + " heeft een score van " +playerB.getScore());

    }

    //print bord methode
    public static void printBoard (Field[] board){
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i].getToken());

            boolean endOfRow = (i + 1) % 3 == 0;
            boolean lastField = i == 8;

            if (!endOfRow) {
                System.out.print(" | ");
            }
            if (endOfRow && !lastField) {
                System.out.println("\n---------");
            }
            if (endOfRow && lastField){
                System.out.println(" ");
            }
        }
    }

//    // oude switch player methode - nu in player class opgenomen
//    public static Player switchPlayer (Player currentPlayer, Player playerA, Player playerB){
//        if (currentPlayer.getToken() == "X"){
//            return playerB;
//        }
//        else {
//            return playerA;
//        }
//    }

    // oude methode winconditie - nu in game class opgenomen
//    public static boolean hasPlayerWon (String[] board, String currentPlayer) {
//
//        //horizontaal
//        if (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) {
//            return true;
//        }
//        if (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) {
//            return true;
//        }
//        if (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) {
//            return true;
//        }
//
//        //verticaal
//        if (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) {
//            return true;
//        }
//        if (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) {
//            return true;
//        }
//        if (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) {
//            return true;
//        }
//
//        //diagonaal
//        if (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) {
//            return true;
//        }
//        if (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer) {
//            return true;
//        }
//
//        //geen winnaar
//        return false;
//
//    }

}










