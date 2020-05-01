/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atme05;

/***
 * Clase que hace la representanción de una cuenta bancaria
 * @author madri
 */
public class Cuenta {
    private int numCuenta;
    private int nip;
    private double saldoDisponible;
    private double saldoTotal;
    
    /***
     * Constructor de cuenta recibe los siguientes params
     * @param numCuenta
     * @param nip
     * @param saldoDisponible
     * @param saldoTotal 
     */
    public Cuenta(int numCuenta, int nip, double saldoDisponible, 
                 double saldoTotal)
    {
        this.numCuenta = numCuenta;
        this.nip = nip;
        this.saldoDisponible = saldoDisponible;
        this.saldoTotal = saldoTotal;
    }
    
    /***
     * Retorna true si los NIP son iguales
     * @param nip
     * @return boolean
     */
    public boolean validarNIP(int nip)
    {
        return this.nip == nip;
    }
    /***
     * Muestra el saldo disponible en la cuenta
     * @return 
     */
    public double mostrarSaldoDisponible()
    {
        return saldoDisponible;
    }
    /***
     * Muestra el saldo total del usuario
     * @return 
     */
    public double mostrarSaldoTotal()
    {
        return saldoTotal;
    }
    /***
     * Simula el deposito a cuenta bancaria
     * @param cantidad 
     */
    public void depositar(double cantidad)
    {
        saldoTotal += cantidad;
    }
    
    /***
     * Simula el retiro de efectivo
     * @param cantidad 
     */
    public void retirar(double cantidad)
    {
        saldoDisponible -= cantidad;
        saldoTotal -= cantidad;
    }
    
    public int obtenerNumerodeCuenta()
    {
        return numCuenta;
    }
}
