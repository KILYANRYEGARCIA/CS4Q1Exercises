/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer2;

/**
 *
 * @author kilya
 */
public class Singer {
    String name; 
    int noOfPerformances;
    double earnings;
    Song favSong = new Song();
    Electives favSubject = new Electives();
    int numOfPeople; 
    public Singer(String name, int noOfPerformances, double earnings){
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
    }
    public void performForAudience(int numOfPeople){
        noOfPerformances = noOfPerformances + 1;
        earnings = earnings + 100 * numOfPeople;
    }
    public void changeFavSong() {
        favSong.changeSong("Alumni Homecoming");
    }
}
