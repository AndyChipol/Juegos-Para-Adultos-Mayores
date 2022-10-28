
package Controlador;

import Lib.Tarjeta;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;

public class Mem1Controlador implements ActionListener{
    
    private VistaMem1 vista;
    private Mem1Modelo modelo;
    private int cont;
    
    public Mem1Controlador(VistaMem1 vista, Mem1Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void Iniciar(){
        vista.setSize(1000,580);
        vista.setLayout(null);
        vista.setLocationRelativeTo(null);
        vista.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vista.setVisible(true);
        vista.setTitle("Memorama");
        vista.setResizable(false);
        
        vista.sig.addActionListener(this);      
        
        cont = 0;
        for(int i=0;i<4;i++){
             for(int j=0;j<2;j++){
                 vista.bt= new JButton("",new ImageIcon(this.getClass().getResource("/Img/Tarjeta3.png")));
                 vista.bt.setBounds((i+1)*150, (int) ((j+1.5)*150),75,119);
                 vista.bt.setName(cont+"");
                 vista.bt.addActionListener(this);
                 vista.bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                 vista.botones[cont]= vista.bt;
                 cont++;
                 vista.add(vista.bt);
            }
        }
        
        int tarj=0;
        for(int i=1;i<=4;i++){
            Tarjeta t1 = new Tarjeta(i ,"/Img/"+ i+".png",tarj);
            Tarjeta t2 = new Tarjeta(i,"/Img/"+ i+ ".png",tarj+1 );
            vista.tarjetas[tarj] = t1;
            tarj++;
            vista.tarjetas[tarj]=t2;
            tarj++;
        }
        int llenar=0;
        Tarjeta tarjTemp[]= new Tarjeta[8];
        for(int i=0;i< tarjTemp.length;i++){
            tarjTemp[i] = new Tarjeta(0,"/Img/Tarjeta3.png",-1);
        }
        while(llenar<=7){
            int aleatorio=((int)(Math.random()*8));
            if(vista.busNum(aleatorio,tarjTemp)){
                tarjTemp[llenar]=vista.tarjetas[aleatorio];
                tarjTemp[llenar].bt= vista.botones[llenar];
                llenar++;
            }

        }
        vista.tarjetas = tarjTemp;

        vista.fondo();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        for(int i=0;i<vista.botones.length;i++){
            if(vista.tarjetas[i].bt== ae.getSource()&& vista.tarjetas[i].revel==false){
                modelo.btnTarjeta(vista,i);
            }  
        }
        
        if(ae.getSource()==vista.sig){
            modelo.siguiente();
            modelo = null;
            VistaMem2 v2 = new VistaMem2();
            Mem2Modelo m2 = new Mem2Modelo();
            Mem2Controlador c = new Mem2Controlador(v2,m2);
            c.iniciar();
            vista.dispose();
        }
    }
}
