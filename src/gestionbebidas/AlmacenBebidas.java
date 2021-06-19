/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbebidas;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 14/06/2021
 *
 */
public class AlmacenBebidas {

    private Bebida[][] matriz;

    //Constructores
    public AlmacenBebidas(int filas, int columnas) {
        matriz = new Bebida[filas][columnas];
    }

    public AlmacenBebidas() {
        matriz = new Bebida[2][2];
    }

    //Creamos el metodo para agregar una Bebida
    public void agregarBebida(Bebida b) {
        boolean encontrado = false;
        for (int i = 0; i < matriz.length && !encontrado; i++) {
            for (int j = 0; j < matriz[0].length && !encontrado; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = b;
                    encontrado = true;
                }
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Bebida Agregada", "Agregada", 1);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar", "NO Agregada", 0);

        }
    }

    //Metodo para calcular el precio de las bebidas
    public void calcularPrecioBebidas() {
        double c = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != null) {
                    c += matriz[i][j].getPrecio();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El precio total de todas las bebidas es de: " + c, "Precio de todas las bebidas", 1);
    }

    //Metodo para mostrar todas las bebidas
    public void mostrarBebidas() {
        String cadena="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != null) {
                    cadena=cadena+"\n"+matriz[i][j].toString()+"\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null,cadena,"Mostrando Bebidas",1);
    }
    
    //Metodo para eliminar una bebida
    public void eliminarBebida(int id){
    boolean encontrado=false;
      for (int i = 0; i < matriz.length && !encontrado; i++) {
            for (int j = 0; j < matriz[0].length && !encontrado; j++) {
                if (matriz[i][j] != null && matriz[i][j].getId()==id) {
                   matriz[i][j]=null;
                    encontrado = true;
                }
            }
        }
    }
}
