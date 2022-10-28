package Lib;
import javax.swing.*;

public class Tarjeta {
    public int pos=0, val=0;
    public boolean revel=false;
    public ImageIcon imagen;
    public JButton bt;
    
    public Tarjeta(int val,String nom,int pos){
        this.pos=pos;
        this.val=val;
        try{
           imagen=new ImageIcon(this.getClass().getResource(nom));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}

