/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer5;

import java.util.ArrayList;

/**
 *
 * @author kilya
 */
public class Item {
      private String name, type;
  private double cost;
  private static ArrayList<Item> completeItemList = new ArrayList();

  public Item(String name, String type, double cost){
    this.name = name;
    this.type = type;
    this.cost = cost;
    completeItemList.add(this);
  }
  public String getName(){
    return name;
  }
  public String getType(){
    return type;
  }
  public double getCost(){
    return cost;
  }
  public static Item getItem(int index){
    return completeItemList.get(index);
  }
  public static void printAllItems(){
    for(Item i : completeItemList){
      System.out.printf("Name: %s%nType: %s%nCost:%.2f%n");
    }
  }
}
