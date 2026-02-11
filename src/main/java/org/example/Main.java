package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> voidlist=new ArrayList<>();
        Producto c1=new Producto("Sandwich");
        Producto c2=new Producto("Ensalada");
        Producto c3=new Producto("Hamburguesa");
        Pedido p1= new Pedido ("1014661030",voidlist);
        p1.AgrProd(c1);
        p1.AgrProd(c2);
        p1.AgrProd(c3);

        for(object e: p1.getProducto){
            System.out.println(e.toString());
        }
    }
}

