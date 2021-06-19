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
public class AppBebida {

    public static void main(String args[]) {
        int op = 0;
        Bebida b;

        AlmacenBebidas almacen = new AlmacenBebidas();
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "--ALMACEN DE BEBIDAS--"
                    + "\n1.-Agregar Bebidas"
                    + "\n2.-Eliminar Bebida"
                    + "\n3.-Mostrar Informacion"
                    + "\n4.-Calcular Precio de Todas las Bebidas"
                    + "\n5.-Salir\n¿Que desea realizar?", "MENU", 1));
            switch (op) {
                case 1: {

                    break;
                }
                case 2: {

                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Cerrando Programa", "Saliendo", 1);

                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Elige una opcion correcta", "Opcion incorrecta", 0);

                    break;
                }
            }
        } while (op != 5);
    }
}
