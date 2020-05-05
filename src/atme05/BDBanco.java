/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atme05;

import java.util.Objects;

/***
 * Clase que hace la representación de una Base de Datos Bancaria
 * Contiene cuentas y detalles de las mismas
 * @author madri
 */
public class BDBanco {
    private Cuenta [] cuentas; //Arreglo de cuentas para N usuarios
    
    public BDBanco()
    {
        cuentas = new Cuenta[2]; //Inicializamos con dos usuarios
        cuentas[0] = new Cuenta(12345, 98072, 1000.0, 1500.0);
        cuentas[1] = new Cuenta(54321, 27079, 2000.0, 2700.0);
    }
    
    /***
     * Recorre la BD en busca del numero de cuenta
     * Regresa null si no encuentra el dato solicitado
     * @param numCuenta
     * @return 
     */
    private Cuenta obtenerCuenta(int numCuenta)
    {
        //cuentaActual es un objeto de Cuenta
        for(Cuenta cuentaActual : cuentas) //For mejorado que recorre la BD
        {
            if(cuentaActual.obtenerNumerodeCuenta() == numCuenta)
                return cuentaActual; //Obtiene la cuenta que se introdujo
        }
        return null;
    }
    
    /***
     * Verifica si el usuario introdujo las credenciales adecuadas
     * @param numCuenta
     * @param nip
     * @return 
     */
    public boolean autenticarUsuario(int numCuenta, int nip)
    {
        Cuenta cuentaUsuario = obtenerCuenta(numCuenta);
        
        if(cuentaUsuario != null)
            return cuentaUsuario.validarNIP(nip);
        else
            return false;
    }
    /***
     * Con el metodo cuenta y el id introducido podemos
     * mostrar el saldo de la cuenta
     * @param numCuenta:cuenta
     * @return 
     */
    public double mostrarSaldoDisponible(int numCuenta)
    {
        return Objects.requireNonNull(obtenerCuenta(numCuenta)).mostrarSaldoDisponible();
    }
    
    /***
     * Lo mismo que para mostrarSaldoDisponible
     * @param numCuenta
     * @return 
     */
    public double mostrarSaldoTotal(int numCuenta)
    {
        return Objects.requireNonNull(obtenerCuenta(numCuenta)).mostrarSaldoTotal();
    }
    
    public void depositar(int numCuenta, double cantidad)
    {
        Objects.requireNonNull(obtenerCuenta(numCuenta)).depositar(cantidad);
    }
    
    public void retirar(int numCuenta, double cantidad)
    {
        Objects.requireNonNull(obtenerCuenta(numCuenta)).retirar(cantidad);
    }
}
