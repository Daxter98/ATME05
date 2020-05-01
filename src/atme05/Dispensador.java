/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atme05;

/**
 *
 * @author madri
 */
public class Dispensador {
    private final static int BILLETES = 500;
    private int conteo;
    
    public Dispensador()
    {
        conteo = BILLETES;
    }
    
    public void darDinero(double cantidad)
    {
        double billetesRequeridos = cantidad / 20;
        conteo -= billetesRequeridos;
    }
    
    public boolean haySuficienteDinero(double cantidad)
    {
        double billetesRequeridos = cantidad / 20;
        
        return conteo >= billetesRequeridos;
    }
}
