package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isTakeAway;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
        }else{
            this.price=400;
        }
        this.isExtraCheese=false;
        this.isExtraToppings=false;
        this.isTakeAway=false;
        this.bill="";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isExtraCheese){
            this.price = this.price + 80;
            this.isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isExtraToppings){
            if(this.isVeg){
                this.price=this.price + 70;
            }else{
                this.price=this.price+120;
            }
            this.isExtraToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeAway){
            this.price=this.price+20;
            this.isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!this.bill.isEmpty()){
            return this.bill;
        }

        if(isVeg){
            this.bill+="Base Price Of The Pizza: 300\n";
        }else{
            this.bill+="Base Price Of The Pizza: 400\n";
        }
        if(this.isExtraCheese){
            this.bill+="Extra Cheese Added: "+80+"\n";
        }
        if(this.isExtraToppings && this.isVeg){
            this.bill+="Extra Toppings Added: "+70+"\n";
        }else if(this.isExtraToppings){
            this.bill+="Extra Toppings Added: "+120+"\n";
        }
        if(this.isTakeAway){
            this.bill+="Paperbag Added: "+20+"\n";

        }
        this.bill+="Total Price: "+this.getPrice()+"\n";
        return this.bill;
    }
}
