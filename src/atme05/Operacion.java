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
public abstract class Operacion {
    private int numCuenta;
    private Pantalla pantalla;
    private BDBanco bdBanco;
    
    public Operacion(int numCuenta, Pantalla pantalla,BDBanco bdBanco)
    {
        this.numCuenta = numCuenta;
        this.pantalla = pantalla;
        this.bdBanco = bdBanco;
    }
    
    public int obtenerNumCuenta()
    {
        return numCuenta;
    }
    
    public Pantalla obtenerPantalla()
    {
        return pantalla;
    }
    
    public BDBanco obtenerBDBanco()
    {
        return bdBanco;
    }
    
    abstract public void ejecutar();
}
