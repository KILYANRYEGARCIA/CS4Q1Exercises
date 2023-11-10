/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer1;

/**
 *
 * @author kilya
 */
public class ChessPlayers {
    String name;
    int age;
    double CurrentElo;
    double PeakElo;
        
    public ChessPlayers(String name, int age, double CurrentElo, double PeakElo){
        this.name = name;
        this.age =age;
        this.CurrentElo = CurrentElo;
        this.PeakElo = PeakElo;
    }
}
