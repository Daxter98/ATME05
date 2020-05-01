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
public class Deposito extends Operacion{
    private double cantidad;
    private Recibidor recibidor;
    private final static int CANCELAR = 0;
    
    public Deposito(int numCuenta, Pantalla pantalla, BDBanco bdBanco,
            Recibidor recibidor, double cantidad)
    {
        super(numCuenta, pantalla, bdBanco);
        this.recibidor = recibidor;
        this.cantidad = cantidad;
    }
    
    @Override
    public void ejecutar()
    {
        BDBanco bdBanco = obtenerBDBanco();
        Pantalla pantalla = obtenerPantalla();
        
        if(cantidad != CANCELAR)
        {
            pantalla.depositarSobre(cantidad);
            
            boolean sobreRecibido = recibidor.paqueteInsertado();
            
            if(sobreRecibido)
            {
                pantalla.confirmacionDeposito();
                bdBanco.depositar(obtenerNumCuenta(), cantidad);
            }
            else
            {
                //TO DO Mensaje de sobre no recibido;
            }
        }
        else
        {
            // TO DO Mostrar mensaje de cancelacion esperar y regresar a
            // Menu Principal
            pantalla.mostrarMenu();
        }
    }
    
   
}
