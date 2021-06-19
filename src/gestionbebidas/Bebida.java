/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbebidas;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 14/06/2021
 *
 */
public class Bebida {

    //Creamos nuestra variable que gestionara el ID de nuestros productos
    private static int idActual = 1;
    //Creamos los atributos de nuestra clase
    private int id;
    private double cantidad;
    private double precio;
    private String marca;

    public Bebida(double cantidad, double precio, String marca) {
        id = idActual++;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nCantidad: " + cantidad + "\nPrecio: " + precio + "\nMarca: " + marca;
    }

}
