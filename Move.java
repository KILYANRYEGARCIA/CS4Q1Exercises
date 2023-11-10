/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer4;

/**
 *
 * @author kilya
 */
public class Move {
    private final String name;
    private Move strongAgainst;
    
    public Move(String name){
        this.name = name;
        this.strongAgainst = null;
    }
	public String getName(){
		return this.name;
	}
	public Move getStrongAgainst(){
		return this.strongAgainst;
	}
	public void setStrongAgainst(Move strongAgainst){
		this.strongAgainst = strongAgainst;
	}
    public static int compareMoves(Move m1, Move m2){
		// This method returns 0 if m1 wins, 1 if m2 wins, and 2 if neither wins
		if(m1.getStrongAgainst() ==  m2) return 0;
		else if (m2.getStrongAgainst() == m1) return 1;
		else return 2;
	}
}
