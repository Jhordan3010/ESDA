
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jhord
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }
    Cola col;
    Cola colAux;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEncolar = new javax.swing.JButton();
        btnDesencolar = new javax.swing.JButton();
        btnVacia = new javax.swing.JButton();
        btnLlena = new javax.swing.JButton();
        btnNumElementos = new javax.swing.JButton();
        btnReprote = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        txtTamanio = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtMinimo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaResultado = new javax.swing.JTextArea();
        btnComprar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        btnAgotar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Estructura de Datos Cola");

        jLabel2.setText("Realizado por: Jhordan Huera");

        jLabel3.setText("Ingrese Tamaño Cola:");

        jLabel4.setText("Codigo:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Cantidad:");

        jLabel7.setText("Precio:");

        jLabel8.setText("Minimo:");

        btnEncolar.setText("Encolar");
        btnEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarActionPerformed(evt);
            }
        });

        btnDesencolar.setText("Desencolar");
        btnDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarActionPerformed(evt);
            }
        });

        btnVacia.setText("Vacia");
        btnVacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciaActionPerformed(evt);
            }
        });

        btnLlena.setText("Llena");
        btnLlena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenaActionPerformed(evt);
            }
        });

        btnNumElementos.setText("Num Elementos");
        btnNumElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumElementosActionPerformed(evt);
            }
        });

        btnReprote.setText("Reprote");
        btnReprote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproteActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        txtaResultado.setColumns(20);
        txtaResultado.setRows(5);
        jScrollPane1.setViewportView(txtaResultado);

        btnComprar.setText(" Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnAgotar.setText("Agotar");
        btnAgotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgotarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrear)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNumElementos)
                        .addGap(18, 18, 18)
                        .addComponent(btnReprote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComprar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVender)
                        .addGap(0, 108, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEncolar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDesencolar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVacia)
                        .addGap(18, 18, 18)
                        .addComponent(btnLlena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgotar)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnCrear)
                    .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEncolar)
                            .addComponent(btnDesencolar)
                            .addComponent(btnVacia)
                            .addComponent(btnLlena)
                            .addComponent(btnAgotar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumElementos)
                            .addComponent(btnReprote)
                            .addComponent(btnComprar)
                            .addComponent(btnVender)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
        // TODO add your handling code here:
        if (col != null && col.Llena() == false) {
            String Codigo = this.txtCodigo.getText();
            String Nombre = this.txtNombre.getText();
            int Cantidad = Integer.parseInt(this.txtCantidad.getText());
            double Precio = Double.parseDouble(this.txtPrecio.getText());
            int Minimo = Integer.parseInt(this.txtMinimo.getText());
            Producto productos = new Producto(Codigo, Nombre, Cantidad, Precio, Minimo);

            if (Cantidad > 0) {
                col.Encolar(productos);
                this.txtaResultado.setText("Producto encolado");
            } else {
                this.txtaResultado.setText("Producto no puede ser negativo o igual a 0");
            }
        } else {
            this.txtaResultado.setText("Producto no encolado");
        }
    }//GEN-LAST:event_btnEncolarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        this.txtaResultado.setText("Se creo la cola");
        int t = Integer.parseInt(this.txtTamanio.getText());
        col = new Cola(t);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarActionPerformed
        // TODO add your handling code here:
        Object aux = col.Desencolar();
        if (aux instanceof Producto) {
            Producto producto = (Producto) aux;
            this.txtaResultado.setText("[ " + producto.getCodigo() + " " + producto.getNombre() + " " + producto.getCantidad() + " " + producto.getPrecio() + " " + producto.getMinimo() + "]");
        } else {
            this.txtaResultado.setText("No se ha desencolado el producto");
        }
    }//GEN-LAST:event_btnDesencolarActionPerformed

    private void btnVaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciaActionPerformed
        // TODO add your handling code here:
        boolean r = col.Vacia();

        if (r == true) {
            this.txtaResultado.setText("La cola esta vacia");
        } else {
            this.txtaResultado.setText("La cola no esta vacia");
        }
    }//GEN-LAST:event_btnVaciaActionPerformed

    private void btnLlenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenaActionPerformed
        // TODO add your handling code here:
        boolean r = col.Llena();

        if (r) {
            this.txtaResultado.setText("La cola esta llena");
        } else {
            this.txtaResultado.setText("La cola no esta llena todavia");
        }
    }//GEN-LAST:event_btnLlenaActionPerformed

    private void btnNumElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumElementosActionPerformed
        // TODO add your handling code here:
        this.txtaResultado.setText("Hay " + col.NumElementos() + " elementos");
    }//GEN-LAST:event_btnNumElementosActionPerformed

    private void btnReproteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproteActionPerformed
        // TODO add your handling code here:
        String s = col.Reporte();
        this.txtaResultado.setText(s);
    }//GEN-LAST:event_btnReproteActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigo.getText();
        int cantidad = Integer.parseInt(txtCantidad.getText());

        boolean encontrado = false;
        colAux = new Cola(col.getTam());

        while (!col.Vacia()) {
            Object r = col.Desencolar();
            colAux.Encolar(r);
            if (r instanceof Producto) {
                Producto p = (Producto) r;
                if (p.getCodigo().equals(codigo)) {
                    p.setCantidad(p.getCantidad() + cantidad);
                    encontrado = true;
                }
            }
        }
        col = colAux;

        //Mostramos la actualizacion
        if (encontrado) {
            this.txtaResultado.setText("Se actualizó la cantidad del producto " + codigo);
            this.txtCodigo.setText("");
            this.txtCantidad.setText("");
            this.txtaResultado.setText(col.Reporte());
        } else {
            this.txtaResultado.setText("El producto " + codigo + " no está en la cola");
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigo.getText();
        int cantidadVenta = Integer.parseInt(txtCantidad.getText());
        int ne = col.getNe();
        boolean verificar = false;

        Producto prod;
        for (int i = 0; i < ne; i++) {
            prod = (Producto) col.Desencolar();
            col.Encolar(prod);
            if (codigo.equals(prod.getCodigo())) {
                if (cantidadVenta > prod.getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Inventario insuficiente");
                    verificar = true;
                    break;
                } else {
                    prod.setCantidad(prod.getCantidad() - cantidadVenta);
                    JOptionPane.showMessageDialog(null, "Venta registrada correctamente");
                    verificar = true;
                    break;
                }
            }
        }
        if (!verificar) {
            JOptionPane.showMessageDialog(null, "No se encontró el código");
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnAgotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgotarActionPerformed
        // TODO add your handling code here:
        Cola aux;
        aux = new Cola(col.getTam());
        Producto pro;
        String resultado = "";
        while (!col.Vacia()) {
            pro = (Producto) col.Desencolar();
            aux.Encolar(pro);
            if (pro.getCantidad() <= pro.getMinimo() || pro.getCantidad() <= 0) {
                resultado += "-->Este producto esta a punto de agotarse: \n"
                        + "Còdigo: " + pro.getCodigo()
                        + "\nNombre: " + pro.getNombre()
                        + "\nCantidad: " + pro.getCantidad()
                        + "\nPrecio " + pro.getPrecio()
                        + "\nMinimo: " + pro.getMinimo() + "\n\n";
            }
        }
        while (!aux.Vacia()) {
            col.Encolar(aux.Desencolar());
        }
        this.txtaResultado.setText(resultado);
    }//GEN-LAST:event_btnAgotarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgotar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDesencolar;
    private javax.swing.JButton btnEncolar;
    private javax.swing.JButton btnLlena;
    private javax.swing.JButton btnNumElementos;
    private javax.swing.JButton btnReprote;
    private javax.swing.JButton btnVacia;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMinimo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTamanio;
    private javax.swing.JTextArea txtaResultado;
    // End of variables declaration//GEN-END:variables
}
