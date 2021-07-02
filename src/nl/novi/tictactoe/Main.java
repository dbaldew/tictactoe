package nl.novi.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //welkom boodschap
        System.out.println("Welkom bij het spel Boter, Kaas & Eieren!\n");

        //maak een bord
        String[] board = new String[9];
        for (int i=0; i<9; i++){
            board[i] = Integer.toString(i);
            //System.out.println(board[i]);
        }
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i]);

            boolean endOfRow = (i + 1) %3 == 0;
            boolean lastField = i==8;

            if(!endOfRow){
                System.out.print(" | ");
            }
            if (endOfRow && !lastField){
                System.out.println("\n----------");
            }




        }
    }
}       // geef de speler de mogelijkheid een X te zetten
        // kijk of de speler heeft gewonnen
        // geef de andere speler de mogelijkheid om een O te zetten
        // kijk of de speler heeft gewonnen
        // herhaal stappen tot er een winnaar is

