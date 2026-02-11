package org.example;

import javax.swing.*;

class Pedido{
    private String numero;
    List <Productos> Producto;

    public Pedido() {
    }
    public Pedido(String numero, list<productos> producto) {
        this.numero = numero;
        this.producto = producto;
    }

    public String getNumero() {
        return numero;
    }

    public list<productos> getProducto() {
        return producto;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setProducto(list<productos> producto) {
        this.producto = producto;
    }

    public void AgrProd(Producto producto){
        this.producto.add (productos);
    }
    public void mostrardetalles(Producto producto){

    }
}