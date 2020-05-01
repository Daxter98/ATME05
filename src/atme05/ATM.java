/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atme05;

import atme05.Transacciones.ConsultaSaldo;
import atme05.Transacciones.Deposito;
import atme05.Transacciones.Retiro;

/**
 *
 * @author madri
 */
public class ATM extends javax.swing.JFrame {
    //Atributos
    protected static int numCuentaActual;
    private int numCuenta, nip;
    private double cantidad; //Cantidad a depositar
    private boolean usuarioAutenticado; //Verifica si el login fue correcto
    private boolean btnAceptarClicked = false;
    private boolean btnRetiroClicked = false;
    private int operacionSeleccionada = 0;
    //Crea instancia de clases
    private Pantalla pantalla;
    private Dispensador dispensador;
    private Recibidor recibidor;
    private BDBanco bdBanco;
    /**
     * Creates new form ATMPrincipal
     */
    public ATM() {
        initComponents();
        
        usuarioAutenticado = false;
        pantalla = new Pantalla(txtDisplay);
        dispensador = new Dispensador();
        recibidor = new Recibidor();
        bdBanco = new BDBanco();
        pantalla.mostrarPrincipal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTeclado = new javax.swing.JPanel();
        Teclado = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        Pantalla = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblEntrada = new javax.swing.JLabel();
        panelIzquierdo = new javax.swing.JPanel();
        btnOpcion4 = new javax.swing.JButton();
        btnOpcion5 = new javax.swing.JButton();
        btnOpcion6 = new javax.swing.JButton();
        panelDerecho = new javax.swing.JPanel();
        btnOpcion1 = new javax.swing.JButton();
        btnOpcion2 = new javax.swing.JButton();
        btnOpcion3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM E05 3CM41");
        setResizable(false);

        panelTeclado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Teclado.setLayout(new java.awt.GridBagLayout());

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn9, gridBagConstraints);

        btnAceptar.setText("Aceptar");
        btnAceptar.setPreferredSize(new java.awt.Dimension(75, 23));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btnAceptar, gridBagConstraints);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn6, gridBagConstraints);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn3, gridBagConstraints);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn2, gridBagConstraints);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn1, gridBagConstraints);

        btnCancelar.setText("Cancelar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btnCancelar, gridBagConstraints);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn7, gridBagConstraints);

        btnBorrar.setText("Borrar");
        btnBorrar.setPreferredSize(new java.awt.Dimension(75, 23));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btnBorrar, gridBagConstraints);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn4, gridBagConstraints);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn8, gridBagConstraints);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn5, gridBagConstraints);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 45;
        Teclado.add(btn0, gridBagConstraints);

        javax.swing.GroupLayout panelTecladoLayout = new javax.swing.GroupLayout(panelTeclado);
        panelTeclado.setLayout(panelTecladoLayout);
        panelTecladoLayout.setHorizontalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTecladoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTecladoLayout.setVerticalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTecladoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLayeredPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLayeredPane2.setLayout(new java.awt.GridBagLayout());

        txtDisplay.setEditable(false);
        txtDisplay.setBackground(new java.awt.Color(153, 255, 255));
        txtDisplay.setColumns(20);
        txtDisplay.setFont(new java.awt.Font("Monospaced", 3, 14)); // NOI18N
        txtDisplay.setRows(5);
        jScrollPane1.setViewportView(txtDisplay);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 289;
        gridBagConstraints.ipady = 146;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jLayeredPane2.add(jScrollPane1, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrada.setPreferredSize(new java.awt.Dimension(6, 14));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jLayeredPane2.add(jPanel1, gridBagConstraints);

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelIzquierdo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelIzquierdo.setEnabled(false);
        panelIzquierdo.setLayout(new java.awt.GridBagLayout());

        btnOpcion4.setText(">>>");
        btnOpcion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpcion4MouseClicked(evt);
            }
        });
        btnOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        panelIzquierdo.add(btnOpcion4, gridBagConstraints);

        btnOpcion5.setText(">>>");
        btnOpcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 20, 0);
        panelIzquierdo.add(btnOpcion5, gridBagConstraints);

        btnOpcion6.setText(">>>");
        btnOpcion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 12, 0);
        panelIzquierdo.add(btnOpcion6, gridBagConstraints);

        panelDerecho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDerecho.setPreferredSize(new java.awt.Dimension(66, 0));
        panelDerecho.setLayout(new java.awt.GridBagLayout());

        btnOpcion1.setText("<<<");
        btnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 20, 0);
        panelDerecho.add(btnOpcion1, gridBagConstraints);

        btnOpcion2.setText("<<<");
        btnOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 20, 0);
        panelDerecho.add(btnOpcion2, gridBagConstraints);

        btnOpcion3.setText("<<<");
        btnOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 10, 0);
        panelDerecho.add(btnOpcion3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(panelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        lblEntrada.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        lblEntrada.setText(lblEntrada.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if(btnAceptarClicked && operacionSeleccionada == 0)
        {
           nip = Integer.parseInt(lblEntrada.getText());
           if(autenticarUsuario(numCuenta,nip))
           {
               lblEntrada.setText("");
               pantalla.mostrarMenu();
               btnAceptarClicked = false;
           }
           else
           {
               lblEntrada.setText("Usuario/Pin invalido");
               btnAceptarClicked = false;
               pantalla.mostrarPrincipal();
           }
        }
        else if(operacionSeleccionada == 0)
        {
            numCuenta = Integer.parseInt(lblEntrada.getText());
            lblEntrada.setText("");            
            pantalla.actualizarPrincipal();
        }
        
        //El boton aceptar tiene multiples utilidades
        if(usuarioAutenticado)
        {
            switch(operacionSeleccionada)
            {
                case 2:
                    cantidad = Double.parseDouble(lblEntrada.getText());
                    Operacion operacionDeposito = 
                            crearOperacion(2);

                    operacionDeposito.ejecutar();

                    operacionSeleccionada = 0;
                    pantalla.mostrarMenu();
                    lblEntrada.setText("");                    
                    break;
                case 3:
                    
                    cantidad = Double.parseDouble(lblEntrada.getText());
                    if(cantidad == 0)
                    {
                        pantalla.mostrarMenu();
                        lblEntrada.setText("");
                        operacionSeleccionada = 0;
                    }
                    else
                    {
                        Operacion operacionRetiro = crearOperacion(3);
                        operacionRetiro.ejecutar();

                        operacionSeleccionada = 0;
                        pantalla.mostrarMenu();
                        lblEntrada.setText("");
                    }
                    break;
            }

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion1ActionPerformed

        if(usuarioAutenticado && operacionSeleccionada == 3 && btnRetiroClicked)
        {
            lblEntrada.setText("500");
            btnRetiroClicked = false;
        }
        else if(usuarioAutenticado)
        {
            operacionSeleccionada = 1;
            Operacion operacionActual = crearOperacion(1);

            operacionActual.ejecutar();
        }
    }//GEN-LAST:event_btnOpcion1ActionPerformed

    private void btnOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion4ActionPerformed

        if(usuarioAutenticado && operacionSeleccionada == 3 && btnRetiroClicked)
        {
            lblEntrada.setText("100");
            btnRetiroClicked = false;
        }
        else if(usuarioAutenticado)
        {
            pantalla.realizarRetiro();
            operacionSeleccionada = 3;           
        }
    }//GEN-LAST:event_btnOpcion4ActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        btnAceptarClicked = true;
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion2ActionPerformed

        if(usuarioAutenticado && operacionSeleccionada == 3 && btnRetiroClicked)
        {
            pantalla.actualizarRetiro();
            //TODO al dar click en este boton habilitar Teclado para monto
            //TODO Deshabilitar teclado
            btnRetiroClicked = false;
        }
        else if(usuarioAutenticado)
        {
            pantalla.solictarCantidad();
            operacionSeleccionada = 2;            
        }
    }//GEN-LAST:event_btnOpcion2ActionPerformed

    private void btnOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion3ActionPerformed
        // BOTON para 'Otra Operacion', 'Salir', 'Otro monto'
        if(usuarioAutenticado)
        {
            switch(operacionSeleccionada)
            {
                case 1:
                    pantalla.mostrarMenu();
                    operacionSeleccionada = 0;
                    break;
                case 0:
                    pantalla.mostrarPrincipal();
                    usuarioAutenticado = false;
                    operacionSeleccionada = 0;
                    btnAceptarClicked = false; //Sin este causa error en login
                    break;
            }
        }
    }//GEN-LAST:event_btnOpcion3ActionPerformed

    private void btnOpcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcion4MouseClicked
        // TODO add your handling code here:
        if(btnRetiroClicked)
            lblEntrada.setText("");
        
        btnRetiroClicked = true;
    }//GEN-LAST:event_btnOpcion4MouseClicked

    private void btnOpcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion5ActionPerformed
        // TODO add your handling code here:
        if(usuarioAutenticado && operacionSeleccionada == 3 && btnRetiroClicked)
        {
            lblEntrada.setText("200");
            btnRetiroClicked = false;
        }
    }//GEN-LAST:event_btnOpcion5ActionPerformed

    private void btnOpcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion6ActionPerformed
        // TODO add your handling code here:
        if(usuarioAutenticado && operacionSeleccionada == 3 && btnRetiroClicked)
        {
            lblEntrada.setText("300");
            btnRetiroClicked = false;
        }        
    }//GEN-LAST:event_btnOpcion6ActionPerformed

    private boolean autenticarUsuario(int numCuenta, int nip)
    {
        usuarioAutenticado = bdBanco.autenticarUsuario(numCuenta, nip);
        
        if(usuarioAutenticado)
        {
            numCuentaActual = numCuenta;
            return true;
        }
        else
            return false;
    }
    
    private Operacion crearOperacion(int tipo)
    {
        Operacion temp = null;
        switch(tipo)
        {
            case 1:
                temp = new ConsultaSaldo(numCuentaActual, pantalla, bdBanco);
                break;
            case 2:
                temp = new Deposito(numCuentaActual, pantalla, bdBanco,
                recibidor, cantidad);
                break;
            case 3:
                temp = new Retiro(numCuentaActual, pantalla, bdBanco, 
                dispensador, cantidad);
                break;
            default:
                break;
        }
        return temp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ATM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pantalla;
    private javax.swing.JPanel Teclado;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOpcion1;
    private javax.swing.JButton btnOpcion2;
    private javax.swing.JButton btnOpcion3;
    private javax.swing.JButton btnOpcion4;
    private javax.swing.JButton btnOpcion5;
    private javax.swing.JButton btnOpcion6;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelTeclado;
    private javax.swing.JTextArea txtDisplay;
    // End of variables declaration//GEN-END:variables
}
