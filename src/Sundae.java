/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Slatz8075
 */
public class Sundae extends IceCream {
    
    //initilize the variables that are not in the super class
    private String toppingName;
    private int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        //store the name and the cost of the icecream in the iceCream class
        super(icName, icCost);
        //and store the topping name and cost in this class
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }
    
    //create a function that returns the cost of iceCream in cents
    public int getCost(){
        //simply return the cost of this particular icecream
        return super.getCost() + toppingCost;
    }

    //this is the method that prints out the part of the receipt that corresponds to sundae
    public String toString() {
        //print out the test stating that this is a sundae
        String output = toppingName + " Sundae with" + "/n";
        //now reffer to the icecream class to print the rest
        output += super.toString();
        //finally return the output
        return output;
    }
}
