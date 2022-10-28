package Vista;
import javax.swing.ImageIcon;

public class VistaMenu extends javax.swing.JPanel {

    public VistaMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnMemorama = new javax.swing.JButton();
        btnArc = new javax.swing.JButton();
        btnCuentas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnMemorama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnMemo.png"))); // NOI18N
        BtnMemorama.setBorder(null);
        BtnMemorama.setBorderPainted(false);
        BtnMemorama.setContentAreaFilled(false);
        BtnMemorama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMemorama.setFocusable(false);
        add(BtnMemorama, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        btnArc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sombras.png"))); // NOI18N
        btnArc.setBorder(null);
        btnArc.setBorderPainted(false);
        btnArc.setContentAreaFilled(false);
        btnArc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArc.setFocusable(false);
        add(btnArc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        btnCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btncuentas.png"))); // NOI18N
        btnCuentas.setBorder(null);
        btnCuentas.setBorderPainted(false);
        btnCuentas.setContentAreaFilled(false);
        btnCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCuentas.setFocusable(false);
        add(btnCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnSalir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnMemorama;
    public javax.swing.JButton btnArc;
    public javax.swing.JButton btnCuentas;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
