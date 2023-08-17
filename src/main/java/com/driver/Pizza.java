package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean topping=false;
    private boolean cheese=false;
    private boolean away=false;
    private boolean billgenrated=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        cheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        topping=true;

    }

    public void addTakeaway(){
        // your code goes here
        away=true;

    }

    public String getBill(){
        // your code goes here
//        this.price=0;
        if(!billgenrated) {
            bill="";
            if (isVeg) {
                this.price += 300;
                bill += "Base Price Of The Pizza: 300";
                bill += "\n";
            } else {
                bill += "Base Price Of The Pizza: 400";
                bill+="\n";
                this.price += 400;
            }
            if (cheese) {
                this.price += 80;
                bill+="Extra Cheese Added: 80";
                bill+="\n";
            }
            if (topping) {
                if (isVeg) {
                    this.price += 70;
                    bill+="Extra Toppings Added: 70";
                    bill+="\n";
                } else {
                    this.price += 120;
                    bill+="Extra Toppings Added: 120";
                    bill+="\n";
                }
            }
            if (away) {
                this.price += 20;
                bill+="Paperbag Added: 20";
                bill+="\n";
            }
            billgenrated = true;
            bill+=("Total Price: " +this.price);
            bill+="\n";
        }
        return bill;
    }
}
