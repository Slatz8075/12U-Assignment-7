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
    
    //create a function that returns the cost of candy in cents
    public int getCost(){
        //multiply the weight (in pounds) with the price per pound
        return (int)((weight*pricePerLbs)*100);
    }

    //this is the method that prints out the part of the receipt that corresponds to candy
    public String toString() {
        //print out the first line: with its weight in pounds, and its price per pound
        String output = this.weight + " lbs. @ $" + this.pricePerLbs + " /lb" + "\n";
        //now add the name of the candy
        output += super.getName();
        //now add spaces to this line but leave room for the total cost at the end of the line
        //(big blurb in middle is check to see if i is less that the receipt width minus candy name plus the cost of candy)
        for(int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - (super.getName().length() + DessertShoppe.cents2dollarsAndCents(getCost()).length())); i++){
            //add one space to between the name and the total
            output += " ";
        }
        //finally add the total of this candy purchase
        output += getCost();
        //return the formatted recipt part
        return output;
    }
}
