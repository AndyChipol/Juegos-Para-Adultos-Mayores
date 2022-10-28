package Vista;
import Lib.Tarjeta;
import java.awt.Image;
import javax.swing.*;

public class VistaMem1 extends JFrame{
    public JButton botones[];
    public Tarjeta tarjetas[];
    public Tarjeta temp;
    public JButton sig;
    public JButton mem;
    public JButton bt;
    public JLabel jLabel1;
    public int par;
    
    public VistaMem1(){
        botones = new JButton[8];
        tarjetas = new Tarjeta[8];
        temp = new Tarjeta(0,"/Img/Tarjeta3.png",0);
        par = 0;
        initComponents();
        Image icon=new ImageIcon(getClass().getResource("/Img/icon.png")).getImage();
        setIconImage(icon);
    }
    
    public void initComponents(){
         for(int i=0;i<1;i++){
            for(int j=0;j<1;j++){
                mem = new JButton("",new ImageIcon(this.getClass().getResource("/Img/Title.png")));
                mem.setBounds((i+1)*250,(j + 1)*50,327,52);
                mem.setContentAreaFilled(false);
                mem.setBorder(null);
                this.add(mem);
            }
        }
        int i=0,j=0;
        
        sig = new JButton("",new ImageIcon(this.getClass().getResource("/Img/btn_sig.png")));
        sig.setBounds((i+1)*700,(j+1)*340,208,30);
        sig.setContentAreaFilled(false);
        sig.setBorder(null);
        sig.setFocusable(true);
        sig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.add(sig);
    }
    
    public void fondo(){
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/MemoramaFondo.png"))); // NOI18N
        jLabel1.setSize(1000,580);
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
