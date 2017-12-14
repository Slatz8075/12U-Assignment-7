/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Slatz8075
 */
public class Cookie extends DessertItem{
    
    //initilize the variables that are not in the super class
    private int number;
    private double pricePer12;

    //actually bring in the information that we need
    public Cookie(String name, int number, int pricePer12) {
        //store the name using the super class
        super(name);
        //and store the rest of the info in the intilized variables above
        this.number = number;
        this.pricePer12 = pricePer12;
    }
    
    //create a function that returns the cost of cookie in cents
    public int getCost(){
        //multiply the number by the cost per cookie
        return (int)((number*(pricePer12/12)));
    }

    //this is the method that prints out the part of the receipt that corresponds to cookie
    public String toString() {
        //print out the first line: with its number, and its price dozen
        String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents((int)(this.pricePer12)) + " /dz" + "\n";
        //now add the name of the cookie
        output += super.getName();
        //now add spaces to this line but leave room for the total cost at the end of the line
        //(big blurb in middle is check to see if i is less that the receipt width minus cookie name plus the cost of the cookies)
        for(int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - (super.getName().length() + DessertShoppe.cents2dollarsAndCents(getCost()).length())); i++){
            //add one space to between the name and the total
            output += " ";
        }
        //finally add the total of this cookie purchase
        output += DessertShoppe.cents2dollarsAndCents(getCost());
        //return the formatted recipt part
        return output;
    }
}
