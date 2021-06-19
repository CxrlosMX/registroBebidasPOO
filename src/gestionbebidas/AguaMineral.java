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
public class AguaMineral extends Bebida{
    private String manantial;

    public AguaMineral(String manantial, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.manantial = manantial;
    }

    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nManantial: " + manantial;
    }
    
    
}
