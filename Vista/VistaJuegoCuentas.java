
package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VistaJuegoCuentas extends javax.swing.JPanel {
    public JButton bt;
    public JButton botones[];
    public JLabel jLabel1;
    
    public int cont;
    public VistaJuegoCuentas() {
        botones = new JButton[15];
        jLabel1 = new JLabel();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        figura = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cuentas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnSalir.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnDale.png"))); // NOI18N
        aceptar.setBorder(null);
        aceptar.setBorderPainted(false);
        aceptar.setContentAreaFilled(false);
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.setFocusPainted(false);
        add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 630, -1, -1));

        sumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnSuma.png"))); // NOI18N
        sumar.setBorder(null);
        sumar.setBorderPainted(false);
        sumar.setContentAreaFilled(false);
        sumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sumar.setFocusPainted(false);
        add(sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 570, -1, -1));

        restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnRestar.png"))); // NOI18N
        restar.setBorder(null);
        restar.setBorderPainted(false);
        restar.setContentAreaFilled(false);
        restar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restar.setFocusPainted(false);
        add(restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 570, -1, -1));

        figura.setPreferredSize(new java.awt.Dimension(128, 123));
        add(figura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 153));
        jLabel6.setText("CUENTE LAS FIGURAS");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CUENTE LAS FIGURAS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        cuentas.setFont(new java.awt.Font("Tahoma", 1, 120)); // NOI18N
        cuentas.setForeground(new java.awt.Color(255, 255, 255));
        cuentas.setText("0");
        add(cuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FIGURA.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cuenta.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, 400, 390));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton aceptar;
    public javax.swing.JLabel cuentas;
    public javax.swing.JLabel figura;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JButton restar;
    public javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
