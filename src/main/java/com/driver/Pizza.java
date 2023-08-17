package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean topping=false;
    protected boolean cheese=false;
    protected boolean away=false;
    protected boolean billgenrated=false;

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
        if( isVeg){
            if(!billgenrated)this.price+=300;
            System.out.println("Base Price Of The Pizza: 300");
        }else  {
            System.out.println("Base Price Of The Pizza: 400");
           if(!billgenrated)this.price += 400;
        }
        if(cheese){
            if(!billgenrated)this.price+=80;
            System.out.println("Extra Cheese Added: 80");
        }
        if( topping){
            if(isVeg){
                if(!billgenrated)this.price+=70;
                System.out.println("Extra Toppings Added: 70");
            }
            else{
                if(!billgenrated)this.price+=120;
                System.out.println("Extra Toppings Added: 120");
            }
        }
        if(away){
            if(!billgenrated)this.price+=20;
            System.out.println("Paperbag Added: 20");
        }
       billgenrated=true;
        return "Total Price: "+this.price;
    }
}
