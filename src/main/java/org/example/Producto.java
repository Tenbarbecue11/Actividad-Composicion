package org.example;

public class Producto {

    private String tipo;

    public Producto() {
    }

    public Producto(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return   tipo + ", ";
    }
}
