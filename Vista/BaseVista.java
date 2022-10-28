
package Vista;

import java.awt.Dimension;
import java.awt.*;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseVista extends JFrame {
    private final JPanel baseVista;
    
    public BaseVista(){
        
        initComponents();
        baseVista = new JPanel();
        try{
            Image icon=new ImageIcon(getClass().getResource("/Img/icon.png")).getImage();
            setIconImage(icon);
        }catch(Exception e){
            
        }
    }
    
    public void initComponents(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setLocationRelativeTo(null);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0,720, Short.MAX_VALUE)
        );
        
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }    
}
