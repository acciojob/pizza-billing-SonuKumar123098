package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price += 80;
        System.out.println("Extra Cheese Added: 80");

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            this.price+=70;
            System.out.println("Extra Toppings Added: 70");
        }
        else{
            this.price+=120;
            System.out.println("Extra Toppings Added: 120");
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price+=20;
        System.out.println("Paperbag Added: 20");
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            this.price+=300;
        }else this.price+=400;
        return "Total Price: "+this.price;
    }
}
