/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer3;

/**
 *
 * @author kilya
 */
public class Exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singer LawrenceMadriaga = new Singer("Lawrence Madriaga", 0, 0);
        Singer Clyde = new Singer("Clyde", 0, 0);
        System.out.println(LawrenceMadriaga.name + "\n" + LawrenceMadriaga.favSong.title + " "+ LawrenceMadriaga.earnings + " "+ LawrenceMadriaga.noOfPerformances);
        LawrenceMadriaga.performForAudience(12);
        System.out.println(LawrenceMadriaga.noOfPerformances + " " + LawrenceMadriaga.earnings);
        LawrenceMadriaga.changeFavSong();
        System.out.println(LawrenceMadriaga.favSong.title);
        System.out.println(LawrenceMadriaga.favSubject.subject);
        System.out.println(LawrenceMadriaga.favSubject.finalGrade);
        System.out.println(LawrenceMadriaga.favSubject.YearsSpentStudying);
        System.out.println(Singer.totalPerformances);
    }
    
}
