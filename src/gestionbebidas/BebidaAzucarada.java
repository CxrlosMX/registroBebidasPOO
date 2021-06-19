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
public class BebidaAzucarada extends Bebida {

    private double porcentaje;
    private boolean promocion;

    public BebidaAzucarada(double porcentaje, boolean promocion, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.porcentaje = porcentaje;
        this.promocion = promocion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    //Polimorfismo

    @Override
    public double getPrecio() {
        if(this.promocion){
        return super.getPrecio()*0.9; //En este metodo realizamos el descuento de la bebida
        
        }
        return super.getPrecio();
    }

    @Override
    public String toString() {
        return super.toString() + "\nPorcentaje: " + porcentaje + "%" + "\nPromocion:" + promocion;
    }

}
