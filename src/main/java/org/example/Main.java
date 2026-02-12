package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //se crean los objetos de las clases 3 productos y 2 Pedido
        Producto p1=new Producto("Sandwich");
        Producto p2=new Producto("Ensalada");
        Producto p3=new Producto("Hamburguesa");
        Pedido pe1= new Pedido ("66");
        Pedido pe2= new Pedido ("777");
        //se agrega en la lista de el pedido 1 las 3 cosas
        pe1.AgrProd(p1);
        pe1.AgrProd(p2);
        pe1.AgrProd(p3);
        //y en el pedido 2 solo 1
        pe2.AgrProd(p2);
        //muestra en el for los productos de la primera orden
        System.out.print("Productos de la orden "+ pe1.getNumero() + "=");
        for(Object e: pe1.getProducto()){
            System.out.print(e.toString());
        }
        //y en está los productos de la segunda orden
        System.out.print("Productos de la orden "+ pe2.getNumero() + "=");
        for(Object e: pe2.getProducto()){
            System.out.print(e.toString());
        }
    }
}

