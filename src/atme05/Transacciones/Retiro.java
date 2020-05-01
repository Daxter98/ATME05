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
public class Retiro extends Operacion{
    private double cantidad;
    private Dispensador dispensador;
    
    public Retiro(int numCuenta, Pantalla pantalla, BDBanco bdBanco,
            Dispensador dispensador, double cantidad)
    {
        super(numCuenta, pantalla, bdBanco);
        this.cantidad = cantidad;
        this.dispensador = dispensador;
    }
    
    @Override
    public void ejecutar()
    {
        boolean dioDinero = false;
        double saldoDisponible;
        
        BDBanco bdBanco = obtenerBDBanco();
        Pantalla pantalla = obtenerPantalla();
        
        do
        {
            if(cantidad != 0)
            {
                saldoDisponible = bdBanco.mostrarSaldoDisponible(
                obtenerNumCuenta());
                if(cantidad <= saldoDisponible)
                {
                    if(dispensador.haySuficienteDinero(cantidad))
                    {
                        bdBanco.retirar(obtenerNumCuenta(), cantidad);
                        dispensador.darDinero(cantidad);
                        dioDinero = true;
                        
                        pantalla.alertarUsuario();
                    }
                    else
                        pantalla.saldoInsuficienteATM();
                }
                else
                    pantalla.saldoInsuficienteCuenta();
            }
            else
                pantalla.mostrarMenu();
        }while(!dioDinero);
    }
}
