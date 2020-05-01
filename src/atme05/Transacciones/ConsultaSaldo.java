/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atme05.Transacciones;

import atme05.*;

/**
 *
 * @author madri
 */
public class ConsultaSaldo extends Operacion{
    
    public ConsultaSaldo(int numCuenta, Pantalla pantalla, BDBanco bdBanco)
    {
        super(numCuenta, pantalla, bdBanco);
    }
    
    @Override
    public void ejecutar()
    {
        BDBanco bdBanco = obtenerBDBanco();
        Pantalla pantalla = obtenerPantalla();
        
        double saldoDisponible = bdBanco.mostrarSaldoDisponible(
                obtenerNumCuenta());
        
        double saldoTotal = bdBanco.mostrarSaldoTotal(obtenerNumCuenta());
        
        pantalla.consultarSaldo(saldoDisponible, saldoTotal);
    }
}
