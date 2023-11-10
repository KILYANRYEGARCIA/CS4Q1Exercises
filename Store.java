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
public class Store {
    private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();
  private boolean found = false;

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.earnings = 0;
    this.itemList = new ArrayList<>();
    storeList.add(this);
  }
  
  public String getName(){
    return name;
  }
  
  public double getEarnings(){
    return earnings;
  }
  
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index >= itemList.size()){
        System.out.println("Sorry, there are only " + itemList.size() + " items in " + this.name);
    } else {
        Item item = itemList.get(index);
        earnings += item.getCost();
        System.out.println(item.getName() + " is sold at " + this.name +" for " + item.getCost());
    }
  }
  
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
     for (Item item : itemList){
         if (item.getName().equals(name)){
            earnings += item.getCost();
            System.out.println(name + " is sold at " + this.name +" for " + item.getCost());
            found = true;
            break;
         } 
     }
     if(!found){
          System.out.println(this.name +" doesn't sell " + name);
     }
  }
  
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale   
      for (Item item : itemList){
          if(item.equals(i)){     
              earnings += item.getCost();
              System.out.println(i.getName() + " is sold at " + this.name +" for " + item.getCost());
              found = true;
            } 
        }
     if(!found){
         System.out.println(this.name +" doesn't sell " + i.getName());
    }
  }

  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.print("Filter by Type: ");
    
    for (Item item: itemList){
        if (item.getType().equals(type)){
        System.out.print(item.getName() + " ");
        }    
    } 
    System.out.println();
  }
  
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.print("Filter by maxCost: ");
    for (Item item: itemList){
        if (item.getCost() <= maxCost ){
        System.out.print(item.getName() + " ");
        }
    }   
    System.out.println();
  }
  
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.print("Filter by minCost: ");
    for (Item item: itemList){
        if (item.getCost() >= minCost ){
        System.out.print(item.getName() + " ");
        }
    }  
    System.out.println();
  }
  
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (Store store: storeList) {
        System.out.println(store.getName() + " earnings: " + store.getEarnings());
    }
  }
}
