/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer1;

/**
 *
 * @author kilya
 */
public class Exer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChessPlayers MagnusCarlsen = new ChessPlayers("Magnus Carlsen", 32, 2839, 2882);
        ChessPlayers FabianoCaruana = new ChessPlayers("Fabiano Caruana", 31, 2786, 2844);
        ChessPlayers GarryKasparov = new ChessPlayers("Garry Kasparov", 60, 2600, 2851);
        
        System.out.println(MagnusCarlsen.age + FabianoCaruana.age - GarryKasparov.age);
        System.out.println(MagnusCarlsen.PeakElo > GarryKasparov.PeakElo);
        System.out.println(MagnusCarlsen.PeakElo > ((GarryKasparov.CurrentElo + FabianoCaruana.CurrentElo)/2)); 
    }
    
}
