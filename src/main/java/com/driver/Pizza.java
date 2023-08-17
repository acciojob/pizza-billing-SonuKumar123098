package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean topping=false;
    protected boolean cheese=false;
    protected boolean away=false;

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
        if(isVeg){
            this.price+=300;
            System.out.println("Base Price Of The Pizza: 300");
        }else {
            System.out.println("Base Price Of The Pizza: 400");
            this.price += 400;
        }
        if(cheese){
            this.price+=80;
            System.out.println("Extra Cheese Added: 80");
        }
        if(topping){
            if(isVeg){
                this.price+=70;
                System.out.println("Extra Toppings Added: 70");
            }
            else{
                this.price+=120;
                System.out.println("Extra Toppings Added: 120");
            }
        }
        if(away){
            this.price+=20;
            System.out.println("Paperbag Added: 20");
        }
//        isVeg=false;
//        topping=false;
//        cheese=false;
//        away=false;
        return "Total Price: "+this.price;
    }
}
