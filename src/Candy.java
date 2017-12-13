/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Slatz8075
 */
public class Candy extends DessertItem {
    
    //initilize the variables that don't exist in the dessertItem class
    private double weight;
    private double pricePerLbs;

    public Candy(String name, double weight, double pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    //create a function that returns the cost of candy based on its ammount
    public int getCost(double weight, double pricePerLbs){
        //multiply the weight (in pounds) with the price per pound
        return weight*pricePerLbs;
    }

    //this is the method that prints out the receipt that corresponds to candy
    public String toString() {
        //print out the first line: with its weight in pounds, and its price per pound
        String output = this.weight + " lbs. @ $" + this.pricePerLbs + " /lb" + "\n";
        //now calculate
        output += super.getName() + "\n";
        return output;
    }
}
