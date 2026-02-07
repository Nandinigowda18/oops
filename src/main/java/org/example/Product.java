package org.example;

public abstract class Product {


     String name ;
     double price ;
     double discount;
     boolean isPrime;

     Product(String name , double price, double discount, boolean isPrime){
         this.name = name;
         this.price= price;
         this.discount = discount;
         this.isPrime = isPrime;
     }

     public double totaldisc(){
         discount = ( discount * price )/100;
         return price - discount;
     }


}
