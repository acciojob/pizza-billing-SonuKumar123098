package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean topping;
    private boolean cheese;
    private boolean away;
    private boolean billgenrated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        billgenrated=false;
        topping=false;
        away=false;
        cheese=false;
        if(isVeg) {
            this.price = 300;
        }else this.price=400;
        this.bill="";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese && !billgenrated){
            cheese=true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!topping && !billgenrated){
            if(isVeg) this.price+=70;
            else this.price+=120;
            topping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!away && !billgenrated){
            away=true;
            this.price+=20;
        }

    }

    public String getBill(){
        // your code goes here
        if(!billgenrated) {
            if (isVeg) {
//                this.price += 300;
                this.bill += "Base Price Of The Pizza: 300";
                this.bill += "\n";
            } else {
                bill += "Base Price Of The Pizza: 400";
                bill+="\n";
//                this.price += 400;
            }
            if (cheese) {
                bill+="Extra Cheese Added: 80";
                bill+="\n";
            }
            if (topping) {
                if (isVeg) {

                    bill+="Extra Toppings Added: 70";
                    bill+="\n";
                } else {
//                    this.price += 120;
                    bill+="Extra Toppings Added: 120";
                    bill+="\n";
                }
            }
            if (away) {
//                this.price += 20;
                bill+="Paperbag Added: 20";
                bill+="\n";
            }
            billgenrated = true;
            bill+=("Total Price: " +this.price);
            bill+="\n";
        }
        return this.bill;
    }
}
