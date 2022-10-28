package Vista;


import Modelo.BaseModelo;
import Vista.BaseVista;
import Controlador.BaseControlador;
import Lib.Tarjeta;
import java.awt.Image;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class VistaMem3 extends JFrame{
    public JButton botones[];
    public Tarjeta tarjetas[];
    public Tarjeta temp;
    public JButton sal;
    public JButton mem;
    public JButton bt;
    public JLabel jLabel1;
    public int par;

    public VistaMem3(){
        botones = new JButton[16];
        tarjetas = new Tarjeta[16];
        temp = new Tarjeta(0,"/Img/Tarjeta3.png",0);
        par  = 0;
        initComponents();
        
        Image icon=new ImageIcon(getClass().getResource("/Img/icon.png")).getImage();
        setIconImage(icon);
    }
    
    public void initComponents(){
        for(int i=0;i<1;i++){
            for(int j=0;j<1;j++){
                mem = new JButton("",new ImageIcon(this.getClass().getResource("/Img/Title.png")));
                mem.setBounds((i+1)*250,(j)*100,327,52);
                mem.setContentAreaFilled(false);
                mem.setBorder(null);
                this.add(mem);
            }
        }
        int i=0,j=0;
        sal = new JButton("",new ImageIcon(this.getClass().getResource("/Img/btnSalir.png")));
        sal.setBounds((i+1)*700,(j+1)*340,192,47);
        sal.setContentAreaFilled(false);
        sal.setBorder(null);
        sal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(sal);
        //sal.addActionListener(this);
    }
    
    public void fondo(){
       jLabel1 = new javax.swing.JLabel();
       jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/MemoramaFondo3.png"))); // NOI18N
       jLabel1.setSize(1000,700);
       add(jLabel1);
    }
    
    public boolean busNum(int num,Tarjeta tarj[]){
        int cont=0;
        for  (Tarjeta t1: tarj){
            if(num == t1.pos){
                cont++;
            }
        }
        return (cont<1);
    }
    public void tapar(int a){
       tarjetas[a].bt.setIcon(new ImageIcon(this.getClass().getResource("/Img/Tarjeta3.png")));
       tarjetas[Integer.valueOf(temp.bt.getName())].revel=false;
       tarjetas[Integer.valueOf(temp.bt.getName())].bt.setIcon(new ImageIcon(this.getClass().getResource("/Img/Tarjeta3.png")));
    }
}    
