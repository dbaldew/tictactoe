package nl.novi.tictactoe;

import java.util.Scanner;

public class Main {

    //main methode
    public static void main (String[] args) {

        //welkom boodschap
        System.out.println("Welkom bij het spel Boter, Kaas & Eieren!\n");

        //maak een bord
        String[] board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = Integer.toString(i);
            //System.out.println(board[i]);
        }
        //print board
        printBoard(board);

        //bepaal speler
        String currentPlayer = "X";
        boolean hasWon = false;

        //while loop , herhaal stappen tot er een winnaar is
        while (!hasWon){

            //geef de speler de mogelijkheid een X te zetten
            System.out.println("\n\nGeef het veld aan waar een "+ currentPlayer+" moet komen te staan\n");

            //input player
            Scanner input = new Scanner(System.in);
            int selectedField = input.nextInt();

            board [selectedField]= currentPlayer;

            //print board
            printBoard(board);

            // kijk of de speler heeft gewonnen
            hasWon = hasPlayerWon(board, currentPlayer);

            //speler heeft gewonnen, game over
            if (!hasWon){
                System.out.println("\nGame Over! De winnaar is "+currentPlayer+".");
            }

            //switch player
            currentPlayer = switchPlayer(currentPlayer);

        }

    }

    //print bord methode
    public static void printBoard (String[] board){
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i]);

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

    //switch player methode
    public static String switchPlayer (String currentPlayer){
        if (currentPlayer == "X"){
            return "0";
        }
        else {
            return "X";
        }
    }

    //methode winconditie
    public static boolean hasPlayerWon (String[] board, String currentPlayer) {

        //horizontaal
        if (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) {
            return true;
        }
        if (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) {
            return true;
        }
        if (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }

        //verticaal
        if (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) {
            return true;
        }
        if (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) {
            return true;
        }
        if (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }

        //diagonaal
        if (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }
        if (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer) {
            return true;
        }

        //geen winnaar
        return false;

    }

}










