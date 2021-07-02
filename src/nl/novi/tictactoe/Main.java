package nl.novi.tictactoe;

import java.util.Scanner;

public class Main {
static Player playerA;
static Player playerB;


    public static void main(String[] args) {
        //welkom boodschap
        System.out.println("Welkom bij het spel Boter, Kaas & Eieren\n");

        //speler aanmaken
        playerA= new Player("Kruisje", "X");
        playerB= new Player("Rondje", "O");

        //maak een bord
        String[] board = new String[9];

        for (int i=0; i<9; i++){
            board[i] = Integer.toString(i);
        }

        //print bord

        printBoard(board);

        //2.speler vragen om waarde in te voeren -- invoer uitlezen met scanner
        Player currentPlayer = playerA;

        while (true){

            System.out.println("\n\nGeef het veld aan waar je een " + currentPlayer.getName()+ " wil zetten");

            Scanner userInput = new Scanner(System.in);
            int selectedField = userInput.nextInt();

            board [selectedField] = "x";

            //2.1 bord opnieuw afdrukken met geupdate waarden
            printBoard(board);

            //2.3 van speler wisselen
            currentPlayer = switchPlayer(currentPlayer);
        }
    }

    //print bord
    public static void printBoard(String[] board){

        for (int i=0; i< board.length; i++){
            System.out.print(board[i]);

            boolean isEndOfRow = (i +1 ) % 3 == 0;
            boolean isLastField = i == 8;

            if (!isEndOfRow){
                System.out.print(" | ");
            }
            if (isEndOfRow && !isLastField) {
                System.out.println("\n-----------");
            }
        }
    }
    //switch player
    public static Player switchPlayer(Player swap){
        if(swap == playerA){
            return playerB;
        }
        else{
            return playerA;
        }
    }
}

