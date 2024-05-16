package com.pgm.gui;

import com.editor.pgm.exceptions.FileWriteError;
import com.pgm.biz.Editor;
import com.pgm.exceptions.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class ExecGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ExecGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabelImagen = new javax.swing.JLabel();
        jButtonRotIzq = new javax.swing.JButton();
        jButtonRotDer = new javax.swing.JButton();
        jButtonFlipHor = new javax.swing.JButton();
        jButtonFlipVer = new javax.swing.JButton();
        jButtonNegativo = new javax.swing.JButton();
        jButtonDesenfocar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CargarjMenuItem = new javax.swing.JMenuItem();
        GuardarjMenuItem = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelImagen.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButtonRotIzq.setText("Girar izquierda");
        jButtonRotIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotIzqActionPerformed(evt);
            }
        });

        jButtonRotDer.setText("Girar derecha");
        jButtonRotDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotDerActionPerformed(evt);
            }
        });

        jButtonFlipHor.setText("Flip horizontal.");
        jButtonFlipHor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFlipHorActionPerformed(evt);
            }
        });

        jButtonFlipVer.setText("Flip vertical.");
        jButtonFlipVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFlipVerActionPerformed(evt);
            }
        });

        jButtonNegativo.setText("Negativo");
        jButtonNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegativoActionPerformed(evt);
            }
        });

        jButtonDesenfocar.setText("Desenfocar");
        jButtonDesenfocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesenfocarActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        CargarjMenuItem.setText("Cargar Archivo");
        CargarjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(CargarjMenuItem);

        GuardarjMenuItem.setText("Guardar");
        GuardarjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(GuardarjMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonFlipHor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFlipVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNegativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDesenfocar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRotDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRotIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRotIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRotDer, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFlipHor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFlipVer, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDesenfocar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRotIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotIzqActionPerformed
        // TODO add your handling code here:
        if (editor != null) {
            editor.rotIzquierda();
            preview();
        }
    }//GEN-LAST:event_jButtonRotIzqActionPerformed

    private void jButtonRotDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotDerActionPerformed
        // TODO add your handling code here:
        if (editor != null) {
            editor.rotDerecha();
            preview();
        }
    }//GEN-LAST:event_jButtonRotDerActionPerformed

    private void jButtonFlipHorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFlipHorActionPerformed
        // TODO add your handling code here:
        if (editor != null) {
            editor.flipHorizontal();
            preview();
        }
    }//GEN-LAST:event_jButtonFlipHorActionPerformed

    private void jButtonFlipVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFlipVerActionPerformed
        // TODO add your handling code here:
        if (editor != null) {
            editor.flipVertital();
            preview();
        }
    }//GEN-LAST:event_jButtonFlipVerActionPerformed

    private void jButtonNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegativoActionPerformed
        // TODO add your handling code here:
        if (editor != null) {
            editor.negativo();
            preview();
        }
    }//GEN-LAST:event_jButtonNegativoActionPerformed

    private void jButtonDesenfocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesenfocarActionPerformed
        // TODO add your handling code here:
        if (editor != null) {
            editor.desenfocar();
            preview();
        }
    }//GEN-LAST:event_jButtonDesenfocarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //Centra el UI en la pantalla
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        ArchivoJDialog rj = new ArchivoJDialog(this, true);
        rj.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void CargarjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarjMenuItemActionPerformed
        // TODO add your handling code here:
        ArchivoJDialog rj = new ArchivoJDialog(this, true);
        rj.setVisible(true);
    }//GEN-LAST:event_CargarjMenuItemActionPerformed

    private void GuardarjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarjMenuItemActionPerformed
        // TODO add your handling code here:
        if (editor != null) {
            GuardarJDialog gd = new GuardarJDialog(this, true);
            gd.setVisible(true);

            if (!nombreFoto.endsWith(".pgm")) {
                nombreFoto += ".pgm";
            }

            try {
                editor.toWrite(nombreFoto);
            } catch (FileWriteError e) {
                showError("Error de guardado: El programa no pudo guardar el archivo.");
            }
        }
    }//GEN-LAST:event_GuardarjMenuItemActionPerformed

    /*----------------------Mis metodos----------------------*/
    public void cargarEditor(String filePath) {
        try {
            editor = new Editor(filePath);
            preview();

        } catch (NotPGMError e) {
            showError("Error de apertura: El archivo seleccionado no es PGM o está mal formado.");
        } catch (NumberFormatException e) {
            showError("Error de lectura: El programa esperaba un numero, revise su composición.");
        } catch (InputMismatchException e) {
            showError("Error de carga: El programa esperaba un numero, revise los datos.");
        } catch (NoSuchElementException e) {
            showError("Error de carga: El programa no obtuvo suficientes datos, compruebe el archivo.");
        } catch (Exception e) {
            showError("Ocurrió un error inesperado, contacte con un administrador.");
        }
    }

    private void preview() {
        int[][] datos = editor.toRGB();
        int nFilas = datos.length;
        int nColumnas = datos[0].length;
        int rgb;

        BufferedImage image = new BufferedImage(nColumnas, nFilas, BufferedImage.TYPE_INT_RGB);

        // Transformamos la escala de grises a rgb
        for (int f = 0; f < nFilas; f++) {
            for (int c = 0; c < nColumnas; c++) {
                rgb = datos[f][c] << 16 | datos[f][c] << 8 | datos[f][c];
                image.setRGB(c, f, rgb);
            }
        }

        ImageIcon iconoPreview = new ImageIcon(image);

        calcTamañoVentana(nColumnas, nFilas);
        this.jLabelImagen.setIcon(iconoPreview);
    }

    private void calcTamañoVentana(int ancho, int altura) {

        if (altura < 525) {
            this.setSize(ancho + 165, 670);

        } else {
            this.setSize(ancho + 165, altura + 50);
        }
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    private void showError(String mensaje) {
        ErrorJDialog ventanaError = new ErrorJDialog(this, true);
        ventanaError.setErrorText(mensaje);
        ventanaError.setVisible(true);
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
            java.util.logging.Logger.getLogger(ExecGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExecGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExecGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExecGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExecGUI().setVisible(true);
            }
        });
    }

    private Editor editor;
    private String nombreFoto = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CargarjMenuItem;
    private javax.swing.JMenuItem GuardarjMenuItem;
    private javax.swing.JButton jButtonDesenfocar;
    private javax.swing.JButton jButtonFlipHor;
    private javax.swing.JButton jButtonFlipVer;
    private javax.swing.JButton jButtonNegativo;
    private javax.swing.JButton jButtonRotDer;
    private javax.swing.JButton jButtonRotIzq;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
