package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class VistaAhorcado extends javax.swing.JFrame {
    
    public ImageIcon imgs[];
    public JButton btns[];
    public String msgs[];
    public int ran;
    public int err;
    public int err2;
    public String res[];
    public JButton bt;
    
    public VistaAhorcado() {
        initComponents();

        Image icon=new ImageIcon(getClass().getResource("/Img/icon.png")).getImage();
        setIconImage(icon);
        
        imgs = new ImageIcon[12];
        btns = new JButton[28];
        msgs = new String[20];
        
        
        imgs[0] = new ImageIcon(getClass().getResource("/Img/im1.jpg"));
        imgs[1] = new ImageIcon(getClass().getResource("/Img/im2.jpg"));
        imgs[2] = new ImageIcon(getClass().getResource("/Img/im3.jpg"));
        imgs[3] = new ImageIcon(getClass().getResource("/Img/im4.jpg"));
        imgs[4] = new ImageIcon(getClass().getResource("/Img/im5.jpg"));
        imgs[5] = new ImageIcon(getClass().getResource("/Img/im6.jpg"));

        
       imgs[6] = new ImageIcon(getClass().getResource("/Img/fallo0.png"));
       imgs[7] = new ImageIcon(getClass().getResource("/Img/fallo1.png"));
       imgs[8] = new ImageIcon(getClass().getResource("/Img/fallo2.png"));
       imgs[9] = new ImageIcon(getClass().getResource("/Img/fallo3.png"));
       imgs[10] = new ImageIcon(getClass().getResource("/Img/fallo4.png"));
       imgs[11] = new ImageIcon(getClass().getResource("/Img/fallo5.png"));
        //botones para las letras
        btns[1]=button_1;
        btns[2]=button_2;
        btns[3]=button_3;
        btns[4]=button_4;
        btns[5]=button_5;
        btns[6]=button_6;
        btns[7]=button_7;
        btns[8]=button_8;
        btns[9]=button_9;
        btns[10]=button_10;
        btns[11]=button_11;
        btns[12]=button_12;
        btns[13]=button_13;
        btns[14]=button_14;
        btns[15]=button_16;
        btns[16]=button_17;
        btns[17]=button_18;
        btns[18]=button_19;
        btns[19]=button_20;
        btns[20]=button_21;
        btns[21]=button_22;
        btns[22]=button_23;
        btns[23]=button_24;
        btns[24]=button_25;
        btns[25]=button_26;
        btns[26]=button_27;
        btns[27]=button_15;
        
        //palabras por advinar, para agregar una nueva palabra sera necesario declararla al inicio
        msgs[0] = "Alejandro".toUpperCase();
        msgs[1] = "Israel".toUpperCase();
        msgs[2] = "Juan".toUpperCase();
        msgs[3] = "Esteban".toUpperCase();
        msgs[4] = "Victor".toUpperCase();
        msgs[5] = "Carlos".toUpperCase();
        msgs[6] = "David".toUpperCase();
        msgs[7] = "Pablo".toUpperCase();
        msgs[8] = "Ramiro".toUpperCase();
        msgs[9] = "Fernando".toUpperCase();
        msgs[10] = "Gonzalo".toUpperCase();
        msgs[11] = "Ana".toUpperCase();
        msgs[12] = "Cecilia".toUpperCase();
        msgs[13] = "Zoe".toUpperCase();
        msgs[14] = "Natalia".toUpperCase();
        msgs[15] = "Esmeralda".toUpperCase();
        msgs[16] = "Lucia".toUpperCase();
        msgs[17] = "Ines".toUpperCase();
        msgs[18] = "Patricia".toUpperCase();
        msgs[19] = "Dulce".toUpperCase();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        Iniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        errores = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Dibujo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_1 = new javax.swing.JButton();
        button_7 = new javax.swing.JButton();
        button_13 = new javax.swing.JButton();
        button_19 = new javax.swing.JButton();
        button_25 = new javax.swing.JButton();
        button_26 = new javax.swing.JButton();
        button_20 = new javax.swing.JButton();
        button_14 = new javax.swing.JButton();
        button_8 = new javax.swing.JButton();
        button_2 = new javax.swing.JButton();
        button_3 = new javax.swing.JButton();
        button_9 = new javax.swing.JButton();
        button_15 = new javax.swing.JButton();
        button_21 = new javax.swing.JButton();
        button_27 = new javax.swing.JButton();
        button_22 = new javax.swing.JButton();
        button_16 = new javax.swing.JButton();
        button_10 = new javax.swing.JButton();
        button_4 = new javax.swing.JButton();
        button_5 = new javax.swing.JButton();
        button_11 = new javax.swing.JButton();
        button_17 = new javax.swing.JButton();
        button_23 = new javax.swing.JButton();
        button_24 = new javax.swing.JButton();
        button_18 = new javax.swing.JButton();
        button_12 = new javax.swing.JButton();
        button_6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iniciar.setBackground(new java.awt.Color(255, 255, 255));
        Iniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnPalabraNueva.png"))); // NOI18N
        Iniciar.setBorder(null);
        Iniciar.setBorderPainted(false);
        Iniciar.setContentAreaFilled(false);
        Iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iniciar.setFocusPainted(false);
        Iniciar.setFocusable(false);
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 320, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnSalir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 40));
        getContentPane().add(errores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 30));

        txtPalabra.setEditable(false);
        txtPalabra.setBackground(new java.awt.Color(255, 255, 255));
        txtPalabra.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtPalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });
        getContentPane().add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 270, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/table.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 170, -1, -1));
        getContentPane().add(Dibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 90, 260, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ahorcado.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 20, -1, 370));

        button_1.setBackground(new java.awt.Color(204, 204, 204));
        button_1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/A.png"))); // NOI18N
        button_1.setBorder(null);
        button_1.setBorderPainted(false);
        button_1.setContentAreaFilled(false);
        button_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_1.setFocusPainted(false);
        button_1.setFocusable(false);
        button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_1ActionPerformed(evt);
            }
        });
        getContentPane().add(button_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 40));

        button_7.setBackground(new java.awt.Color(204, 204, 204));
        button_7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/G.png"))); // NOI18N
        button_7.setBorder(null);
        button_7.setContentAreaFilled(false);
        button_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_7.setFocusPainted(false);
        button_7.setFocusable(false);
        button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_7ActionPerformed(evt);
            }
        });
        getContentPane().add(button_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        button_13.setBackground(new java.awt.Color(204, 204, 204));
        button_13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/M.png"))); // NOI18N
        button_13.setBorder(null);
        button_13.setContentAreaFilled(false);
        button_13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_13.setFocusPainted(false);
        button_13.setFocusable(false);
        button_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_13ActionPerformed(evt);
            }
        });
        getContentPane().add(button_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        button_19.setBackground(new java.awt.Color(204, 204, 204));
        button_19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/R.png"))); // NOI18N
        button_19.setBorder(null);
        button_19.setContentAreaFilled(false);
        button_19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_19.setFocusPainted(false);
        button_19.setFocusable(false);
        button_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_19ActionPerformed(evt);
            }
        });
        getContentPane().add(button_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        button_25.setBackground(new java.awt.Color(204, 204, 204));
        button_25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/X.png"))); // NOI18N
        button_25.setBorder(null);
        button_25.setContentAreaFilled(false);
        button_25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_25.setFocusPainted(false);
        button_25.setFocusable(false);
        button_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_25ActionPerformed(evt);
            }
        });
        getContentPane().add(button_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        button_26.setBackground(new java.awt.Color(204, 204, 204));
        button_26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Y.png"))); // NOI18N
        button_26.setBorder(null);
        button_26.setContentAreaFilled(false);
        button_26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_26.setFocusPainted(false);
        button_26.setFocusable(false);
        button_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_26ActionPerformed(evt);
            }
        });
        getContentPane().add(button_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, -1));

        button_20.setBackground(new java.awt.Color(204, 204, 204));
        button_20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/S.png"))); // NOI18N
        button_20.setBorder(null);
        button_20.setContentAreaFilled(false);
        button_20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_20.setFocusPainted(false);
        button_20.setFocusable(false);
        button_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_20ActionPerformed(evt);
            }
        });
        getContentPane().add(button_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, -1));

        button_14.setBackground(new java.awt.Color(204, 204, 204));
        button_14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/N.png"))); // NOI18N
        button_14.setBorder(null);
        button_14.setContentAreaFilled(false);
        button_14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_14.setFocusPainted(false);
        button_14.setFocusable(false);
        button_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_14ActionPerformed(evt);
            }
        });
        getContentPane().add(button_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        button_8.setBackground(new java.awt.Color(204, 204, 204));
        button_8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/H.png"))); // NOI18N
        button_8.setBorder(null);
        button_8.setContentAreaFilled(false);
        button_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_8.setFocusPainted(false);
        button_8.setFocusable(false);
        button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_8ActionPerformed(evt);
            }
        });
        getContentPane().add(button_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        button_2.setBackground(new java.awt.Color(204, 204, 204));
        button_2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/B.png"))); // NOI18N
        button_2.setBorder(null);
        button_2.setContentAreaFilled(false);
        button_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_2.setFocusPainted(false);
        button_2.setFocusable(false);
        button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_2ActionPerformed(evt);
            }
        });
        getContentPane().add(button_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        button_3.setBackground(new java.awt.Color(204, 204, 204));
        button_3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/C.png"))); // NOI18N
        button_3.setBorder(null);
        button_3.setContentAreaFilled(false);
        button_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_3.setFocusPainted(false);
        button_3.setFocusable(false);
        button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_3ActionPerformed(evt);
            }
        });
        getContentPane().add(button_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        button_9.setBackground(new java.awt.Color(204, 204, 204));
        button_9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/I.png"))); // NOI18N
        button_9.setBorder(null);
        button_9.setContentAreaFilled(false);
        button_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_9.setFocusPainted(false);
        button_9.setFocusable(false);
        button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_9ActionPerformed(evt);
            }
        });
        getContentPane().add(button_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        button_15.setBackground(new java.awt.Color(204, 204, 204));
        button_15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ñ.png"))); // NOI18N
        button_15.setBorder(null);
        button_15.setContentAreaFilled(false);
        button_15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_15.setFocusPainted(false);
        button_15.setFocusable(false);
        button_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_15ActionPerformed(evt);
            }
        });
        getContentPane().add(button_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        button_21.setBackground(new java.awt.Color(204, 204, 204));
        button_21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/T.png"))); // NOI18N
        button_21.setBorder(null);
        button_21.setContentAreaFilled(false);
        button_21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_21.setFocusPainted(false);
        button_21.setFocusable(false);
        button_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_21ActionPerformed(evt);
            }
        });
        getContentPane().add(button_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, -1, -1));

        button_27.setBackground(new java.awt.Color(204, 204, 204));
        button_27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Z.png"))); // NOI18N
        button_27.setBorder(null);
        button_27.setContentAreaFilled(false);
        button_27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_27.setFocusPainted(false);
        button_27.setFocusable(false);
        button_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_27ActionPerformed(evt);
            }
        });
        getContentPane().add(button_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, -1));

        button_22.setBackground(new java.awt.Color(204, 204, 204));
        button_22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/U.png"))); // NOI18N
        button_22.setBorder(null);
        button_22.setContentAreaFilled(false);
        button_22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_22.setFocusPainted(false);
        button_22.setFocusable(false);
        button_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_22ActionPerformed(evt);
            }
        });
        getContentPane().add(button_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        button_16.setBackground(new java.awt.Color(204, 204, 204));
        button_16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/O.png"))); // NOI18N
        button_16.setBorder(null);
        button_16.setContentAreaFilled(false);
        button_16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_16.setFocusPainted(false);
        button_16.setFocusable(false);
        getContentPane().add(button_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, -1, -1));

        button_10.setBackground(new java.awt.Color(204, 204, 204));
        button_10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/j.png"))); // NOI18N
        button_10.setBorder(null);
        button_10.setContentAreaFilled(false);
        button_10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_10.setFocusPainted(false);
        button_10.setFocusable(false);
        button_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_10ActionPerformed(evt);
            }
        });
        getContentPane().add(button_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        button_4.setBackground(new java.awt.Color(204, 204, 204));
        button_4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/D.png"))); // NOI18N
        button_4.setBorder(null);
        button_4.setContentAreaFilled(false);
        button_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_4.setFocusPainted(false);
        button_4.setFocusable(false);
        button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_4ActionPerformed(evt);
            }
        });
        getContentPane().add(button_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        button_5.setBackground(new java.awt.Color(204, 204, 204));
        button_5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/E.png"))); // NOI18N
        button_5.setBorder(null);
        button_5.setContentAreaFilled(false);
        button_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_5.setFocusPainted(false);
        button_5.setFocusable(false);
        button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_5ActionPerformed(evt);
            }
        });
        getContentPane().add(button_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        button_11.setBackground(new java.awt.Color(204, 204, 204));
        button_11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/K.png"))); // NOI18N
        button_11.setBorder(null);
        button_11.setContentAreaFilled(false);
        button_11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_11.setFocusPainted(false);
        button_11.setFocusable(false);
        button_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_11ActionPerformed(evt);
            }
        });
        getContentPane().add(button_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        button_17.setBackground(new java.awt.Color(204, 204, 204));
        button_17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/P.png"))); // NOI18N
        button_17.setBorder(null);
        button_17.setContentAreaFilled(false);
        button_17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_17.setFocusPainted(false);
        button_17.setFocusable(false);
        button_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_17ActionPerformed(evt);
            }
        });
        getContentPane().add(button_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        button_23.setBackground(new java.awt.Color(204, 204, 204));
        button_23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/V.png"))); // NOI18N
        button_23.setBorder(null);
        button_23.setContentAreaFilled(false);
        button_23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_23.setFocusPainted(false);
        button_23.setFocusable(false);
        button_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_23ActionPerformed(evt);
            }
        });
        getContentPane().add(button_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        button_24.setBackground(new java.awt.Color(204, 204, 204));
        button_24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/W.png"))); // NOI18N
        button_24.setBorder(null);
        button_24.setContentAreaFilled(false);
        button_24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_24.setFocusPainted(false);
        button_24.setFocusable(false);
        button_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_24ActionPerformed(evt);
            }
        });
        getContentPane().add(button_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        button_18.setBackground(new java.awt.Color(204, 204, 204));
        button_18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Q.png"))); // NOI18N
        button_18.setBorder(null);
        button_18.setContentAreaFilled(false);
        button_18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_18.setFocusPainted(false);
        button_18.setFocusable(false);
        button_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_18ActionPerformed(evt);
            }
        });
        getContentPane().add(button_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, -1, -1));

        button_12.setBackground(new java.awt.Color(204, 204, 204));
        button_12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/L.png"))); // NOI18N
        button_12.setBorder(null);
        button_12.setContentAreaFilled(false);
        button_12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_12.setFocusPainted(false);
        button_12.setFocusable(false);
        button_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_12ActionPerformed(evt);
            }
        });
        getContentPane().add(button_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        button_6.setBackground(new java.awt.Color(204, 204, 204));
        button_6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/F.png"))); // NOI18N
        button_6.setBorder(null);
        button_6.setContentAreaFilled(false);
        button_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_6.setFocusPainted(false);
        button_6.setFocusable(false);
        button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_6ActionPerformed(evt);
            }
        });
        getContentPane().add(button_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Teclado.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoAhorcado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 700));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_ÃActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ÃActionPerformed
        
    }//GEN-LAST:event_button_ÃActionPerformed

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraActionPerformed

    private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_2ActionPerformed

    private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_1ActionPerformed

    private void button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_3ActionPerformed

    private void button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_4ActionPerformed

    private void button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_5ActionPerformed

    private void button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_6ActionPerformed

    private void button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_7ActionPerformed

    private void button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_8ActionPerformed

    private void button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_9ActionPerformed

    private void button_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_10ActionPerformed

    private void button_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_11ActionPerformed

    private void button_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_12ActionPerformed

    private void button_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_13ActionPerformed

    private void button_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_14ActionPerformed

    private void button_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_17ActionPerformed

    private void button_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_18ActionPerformed

    private void button_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_19ActionPerformed

    private void button_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_20ActionPerformed

    private void button_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_21ActionPerformed

    private void button_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_22ActionPerformed

    private void button_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_23ActionPerformed

    private void button_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_24ActionPerformed

    private void button_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_25ActionPerformed

    private void button_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_26ActionPerformed

    private void button_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_27ActionPerformed

    private void button_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_15ActionPerformed
   private void button_00ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Dibujo;
    public javax.swing.JButton Iniciar;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton button_1;
    public javax.swing.JButton button_10;
    public javax.swing.JButton button_11;
    public javax.swing.JButton button_12;
    public javax.swing.JButton button_13;
    public javax.swing.JButton button_14;
    public javax.swing.JButton button_15;
    public javax.swing.JButton button_16;
    public javax.swing.JButton button_17;
    public javax.swing.JButton button_18;
    public javax.swing.JButton button_19;
    public javax.swing.JButton button_2;
    public javax.swing.JButton button_20;
    public javax.swing.JButton button_21;
    public javax.swing.JButton button_22;
    public javax.swing.JButton button_23;
    public javax.swing.JButton button_24;
    public javax.swing.JButton button_25;
    public javax.swing.JButton button_26;
    public javax.swing.JButton button_27;
    public javax.swing.JButton button_3;
    public javax.swing.JButton button_4;
    public javax.swing.JButton button_5;
    public javax.swing.JButton button_6;
    public javax.swing.JButton button_7;
    public javax.swing.JButton button_8;
    public javax.swing.JButton button_9;
    public javax.swing.JLabel errores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
