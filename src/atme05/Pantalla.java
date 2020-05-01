/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atme05;
import javax.swing.JTextArea;

/**
 *
 * @author madri
 */
public class Pantalla{
    //Constructor
    private final JTextArea display;
    private int cuenta;
    private StringBuilder texto;
    
    public Pantalla(JTextArea display)
    {
        this.display = display;
    }
    
    
    public void mostrarMenu()
    {
        cuenta = ATM.numCuentaActual;
        texto = new StringBuilder("");
        texto.append("\t\t  Transacciones \t\t")
        .append("\n<------Retiro\t\t\t            Saldo------>")
        .append("\n\n\t\t                        Deposito------->")
        .append("\n\n\nCuenta: '")
                .append(cuenta)
                .append("'\t\t\t           Salir------->");
        
        
        display.setText(texto.toString());
        display.repaint();
    }
    
    public void mostrarPrincipal()
    {
        texto = new StringBuilder("");
        texto.append("*******************************************************")
        .append("\n*\t     Instituto Politecnico Nacional\t      *")
        .append("\n*\t  \t ATM - 3CM41 - E05\t              *")
        .append("\n*\t\t       Bienvenido!\t              *\n")
        .append("*******************************************************")
        
        .append("\n\n\t        Teclee su número de cuenta");
        
        display.setText(texto.toString());
        display.repaint();
    }
    
    public void actualizarPrincipal()
    {
        texto = new StringBuilder("");
        texto.append("*******************************************************")
            .append("\n*\t     Instituto Politecnico Nacional\t      *")
            .append("\n*\t  \t ATM - 3CM41 - E05\t              *")
            .append("\n*\t\t       Bienvenido!\t              *\n")
            .append("*******************************************************")
            .append("\n\n\t        Teclee su número de NIP");
        
        display.setText(texto.toString());
        display.repaint();
    }
    
    public void consultarSaldo(double saldoDisponible, double saldoTotal)
    {
        texto = new StringBuilder("");
        texto.append("\t\tBalance de Saldo\t\t\n")
                .append("Saldo Disponible: ")
                .append(saldoDisponible)
                .append("\n\n")
                .append("Saldo Total: ")
                .append(saldoTotal)
                .append("\n\n\n\t\t\t\tOtra Operacion------>");
                
        display.setText(texto.toString());
        display.repaint();
    }
    
    public void alertarUsuario()
    {
        texto = new StringBuilder("");
        texto.append("\n\n\n\n\t\t\tRetire su Efectivo\t\t");
        
        display.setText(texto.toString());
        display.repaint();
    }

    public void saldoInsuficienteATM()
    {
        texto = new StringBuilder("");
        texto.append("\n\n\n\n\t\t\tSaldo Insuficiente en el cajero\t\t");
        
        display.setText(texto.toString());
        display.repaint();
    }
    
    public void saldoInsuficienteCuenta()
    {
        texto = new StringBuilder("");
        texto.append("\n\n\n\n\t\t\tSaldoInsuficiente en la cuenta\t\t");
        
        display.setText(texto.toString());
        display.repaint();
    }
    
    public void realizarRetiro()
    {
        texto = new StringBuilder("");
        texto.append("\t\t  Indique Cantidad \t\t")
        .append("\n<------100\t\t\t            500------>")
        .append("\n\n\n<------200\t\t\t            Otro------>")
        .append("\n\n<------300\t\t\t            ");

        
        
        display.setText(texto.toString());
        display.repaint();        
    }
    
    public void actualizarRetiro()
    {
        texto = new StringBuilder("");
        texto.append("\t\t  Indique Cantidad \t\t")
        .append("\n\n\n\t\t     Teclee Monto");
        
        display.setText(texto.toString());
        display.repaint();        
    }
    
    public void solictarCantidad()
    {
        texto = new StringBuilder("");
        texto.append("*******************************************************")
            .append("\n*\t     Instituto Politecnico Nacional\t      *")
            .append("\n*\t  \t ATM - 3CM41 - E05\t              *")
            .append("\n*\t\t Deposito de Efectivo\t              *\n")
            .append("*******************************************************")
            .append("\n\n\t        Teclee cantidad a depositar");
        
        display.setText(texto.toString());
        display.repaint();
    }
    
    public void depositarSobre(double cantidad)
    {
        texto = new StringBuilder("");
        texto.append("*******************************************************")
            .append("\n*\t     Instituto Politecnico Nacional\t      *")
            .append("\n*\t  \t ATM - 3CM41 - E05\t              *")
            .append("\n*\t\t Deposito de Efectivo\t              *\n")
            .append("*******************************************************")
            .append("\n\n\t        Porfavor introduzca: $").append(cantidad);
        
        display.setText(texto.toString());
        display.repaint();
        
    }
    
    public void confirmacionDeposito()
    {
        texto = new StringBuilder("");
        texto.append("*******************************************************")
            .append("\n*\t     Instituto Politecnico Nacional\t      *")
            .append("\n*\t  \t ATM - 3CM41 - E05\t              *")
            .append("\n*\t\t Deposito de Efectivo\t              *\n")
            .append("*******************************************************")
            .append("\n\n\t        Deposito recibido!");
        
        display.setText(texto.toString());
        display.repaint();
    }
}
