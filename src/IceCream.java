/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Slatz8075
 */
public class IceCream extends DessertItem{
    
    //initilize the variable that are not in the super class
    private int cost;

    //actually bring in the information that we need
    public IceCream(String name, int cost){
        //store the name using the super class
        super(name);
        //and store the cost
        this.cost = cost;
    }
    
    //create a function that returns the cost of iceCream in cents
    public int getCost(){
        //simply return the cost of this particular icecream
        return this.cost;
    }

    //this is the method that prints out the part of the receipt that corresponds to icecream
    public String toString() {
        //start with the name for the icecream
        String output = super.getName();
        //now add spaces to this line but leave room for the total cost at the end of the line
        //(big blurb in middle is check to see if i is less that the receipt width minus cookie name plus the cost of the cookies)
        for(int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - (super.getName().length() + DessertShoppe.cents2dollarsAndCents(getCost()).length())); i++){
            //add one space to between the name and the total
            output += " ";
           
        }
        //finally add the total of this candy purchase
        output += DessertShoppe.cents2dollarsAndCents(getCost());
        //return the formatted recipt part
        return output;
    }
    
}
