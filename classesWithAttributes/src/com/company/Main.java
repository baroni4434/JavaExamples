package com.company;

public class Main {

    public static void main(String[] args)
    {
        Product product = new Product(1,"laptop","Asus laptop",3000,2,"Siyah");
        // product.name = "  laptop";
        //product.setId(1);
       // product.description = "Asus laptop";
        //product.price = 5000;
        //product.stockAmount = 3 ;

        ProductManeger productManeger = new ProductManeger();
        productManeger.Add(product);
        System.out.println(product.getKod());


    }
}
