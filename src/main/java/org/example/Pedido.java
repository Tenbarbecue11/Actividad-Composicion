package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Pedido{
    private String numero;
    List<Producto> productos=new ArrayList<>();

    public Pedido() {
    }
    public Pedido(String numero) {
        this.numero = numero;
        this.productos = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public List<Producto> getProducto() {
        return productos;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setProducto(List<Producto> producto) {
        this.productos = producto;
    }

    public void AgrProd(Producto producto){
        this.productos.add (producto);
    }

}