package com.cchsu;

public class Product {
    int id;
    String name;
    int price;

    Product(){
        super();
    }

    Product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    Product(int id,String name){
        this.id=id;
        this.name=name;
    }



}
