/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author kicho
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        botonera = new javax.swing.JPanel();
        jPinscripciones = new javax.swing.JPanel();
        jLinscripciones = new javax.swing.JLabel();
        jPformMateriasBtn = new javax.swing.JPanel();
        jLformMateriasBtn = new javax.swing.JLabel();
        jPnotasBtn = new javax.swing.JPanel();
        jLnotasBtn = new javax.swing.JLabel();
        jPformAlumnosBtn = new javax.swing.JPanel();
        jLformAlumnosBtn = new javax.swing.JLabel();
        jPalumnosXmateriaBtn = new javax.swing.JPanel();
        jLalumnosXmateriaBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        jPanel1.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 520, 504));

        botonera.setBackground(new java.awt.Color(0, 102, 204));

        jPinscripciones.setBackground(new java.awt.Color(0, 51, 102));

        jLinscripciones.setText("Inscripciones");

        javax.swing.GroupLayout jPinscripcionesLayout = new javax.swing.GroupLayout(jPinscripciones);
        jPinscripciones.setLayout(jPinscripcionesLayout);
        jPinscripcionesLayout.setHorizontalGroup(
            jPinscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPinscripcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLinscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPinscripcionesLayout.setVerticalGroup(
            jPinscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPinscripcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLinscripciones)
                .addContainerGap())
        );

        jPformMateriasBtn.setBackground(new java.awt.Color(0, 51, 102));
        jPformMateriasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPformMateriasBtnMouseClicked(evt);
            }
        });

        jLformMateriasBtn.setText("Formulario de Materias");

        javax.swing.GroupLayout jPformMateriasBtnLayout = new javax.swing.GroupLayout(jPformMateriasBtn);
        jPformMateriasBtn.setLayout(jPformMateriasBtnLayout);
        jPformMateriasBtnLayout.setHorizontalGroup(
            jPformMateriasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPformMateriasBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLformMateriasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPformMateriasBtnLayout.setVerticalGroup(
            jPformMateriasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPformMateriasBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLformMateriasBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnotasBtn.setBackground(new java.awt.Color(0, 51, 102));

        jLnotasBtn.setText("Manipulación de notas");

        javax.swing.GroupLayout jPnotasBtnLayout = new javax.swing.GroupLayout(jPnotasBtn);
        jPnotasBtn.setLayout(jPnotasBtnLayout);
        jPnotasBtnLayout.setHorizontalGroup(
            jPnotasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnotasBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLnotasBtn)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPnotasBtnLayout.setVerticalGroup(
            jPnotasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnotasBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLnotasBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPformAlumnosBtn.setBackground(new java.awt.Color(0, 51, 102));
        jPformAlumnosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPformAlumnosBtnMouseClicked(evt);
            }
        });

        jLformAlumnosBtn.setText("Formulario de Alumnos");

        javax.swing.GroupLayout jPformAlumnosBtnLayout = new javax.swing.GroupLayout(jPformAlumnosBtn);
        jPformAlumnosBtn.setLayout(jPformAlumnosBtnLayout);
        jPformAlumnosBtnLayout.setHorizontalGroup(
            jPformAlumnosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPformAlumnosBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLformAlumnosBtn)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPformAlumnosBtnLayout.setVerticalGroup(
            jPformAlumnosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPformAlumnosBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLformAlumnosBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPalumnosXmateriaBtn.setBackground(new java.awt.Color(0, 51, 102));

        jLalumnosXmateriaBtn.setText("Alumnos por materia");

        javax.swing.GroupLayout jPalumnosXmateriaBtnLayout = new javax.swing.GroupLayout(jPalumnosXmateriaBtn);
        jPalumnosXmateriaBtn.setLayout(jPalumnosXmateriaBtnLayout);
        jPalumnosXmateriaBtnLayout.setHorizontalGroup(
            jPalumnosXmateriaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPalumnosXmateriaBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLalumnosXmateriaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPalumnosXmateriaBtnLayout.setVerticalGroup(
            jPalumnosXmateriaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPalumnosXmateriaBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLalumnosXmateriaBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout botoneraLayout = new javax.swing.GroupLayout(botonera);
        botonera.setLayout(botoneraLayout);
        botoneraLayout.setHorizontalGroup(
            botoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoneraLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(botoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPformMateriasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPalumnosXmateriaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPinscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPformAlumnosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnotasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        botoneraLayout.setVerticalGroup(
            botoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoneraLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPformAlumnosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPformMateriasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPinscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPnotasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPalumnosXmateriaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jPanel1.add(botonera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 504));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPformAlumnosBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPformAlumnosBtnMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        
        formularioAlumnos alumnos = new formularioAlumnos();
        alumnos.setVisible(true);
        escritorio.add(alumnos);
        escritorio.moveToFront(alumnos);
        
    }//GEN-LAST:event_jPformAlumnosBtnMouseClicked

    private void jPformMateriasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPformMateriasBtnMouseClicked
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        
        formularioMaterias materias = new formularioMaterias();
        materias.setVisible(true);
        escritorio.add(materias);
        escritorio.moveToFront(materias);
    }//GEN-LAST:event_jPformMateriasBtnMouseClicked

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonera;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLalumnosXmateriaBtn;
    private javax.swing.JLabel jLformAlumnosBtn;
    private javax.swing.JLabel jLformMateriasBtn;
    private javax.swing.JLabel jLinscripciones;
    private javax.swing.JLabel jLnotasBtn;
    private javax.swing.JPanel jPalumnosXmateriaBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPformAlumnosBtn;
    private javax.swing.JPanel jPformMateriasBtn;
    private javax.swing.JPanel jPinscripciones;
    private javax.swing.JPanel jPnotasBtn;
    // End of variables declaration//GEN-END:variables
}
