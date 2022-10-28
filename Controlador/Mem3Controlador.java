
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

public class Mem3Controlador implements ActionListener{
    private VistaMem3 vista;
    private Mem3Modelo model;

    public Mem3Controlador(VistaMem3 vista, Mem3Modelo modelo){
        this.vista = vista;
        this.model = modelo;
    }
    
    public void iniciar(){
        vista.setSize(1000,700);
        vista.setLayout(null);
        vista.setLocationRelativeTo(null);
        vista.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vista.setVisible(true);
        vista.setTitle("Memorama Nivel 3");
        vista.setResizable(false);
        
        vista.sal.addActionListener(this);
        
        
        int cont=0;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                vista.bt= new JButton("",new ImageIcon(this.getClass().getResource("/Img/Tarjeta3.png")));
                vista.bt.setBounds((i+1)*150, (int) ((j+.5)*150),75,119);
                vista.bt.setName(cont+"");
                vista.bt.addActionListener(this);
                vista.bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                vista.botones[cont]= vista.bt;                
                cont++;
                 vista.add(vista.bt);
           }
       }
       int tarj=0;
        for(int i=1;i<=8;i++){
            Lib.Tarjeta t1 = new Lib.Tarjeta(i ,"/Img/"+ i+ ".png",tarj);
            Lib.Tarjeta t2 = new Lib.Tarjeta(i,"/Img/"+ i+ ".png",tarj+1 );
            vista.tarjetas[tarj] = t1;
            tarj++;
            vista.tarjetas[tarj]=t2;
            tarj++;
        }
        int llenar=0;
        Lib.Tarjeta tarjTemp[]= new Lib.Tarjeta[16];
        for(int i=0;i< tarjTemp.length;i++){
            tarjTemp[i] = new Lib.Tarjeta(0,"/Img/Tarjeta3.png",-1);
        }
        while(llenar<16){
            int aleatorio=((int)(Math.random()*16));
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
                model.btnTarjeta(vista,i);
            } 
        }
                
        if(ae.getSource()== vista.sal){
            BaseVista v =  new BaseVista();
            BaseModelo m = new BaseModelo();
            BaseControlador C = new BaseControlador(v,m);
            C.iniciar();
            vista.dispose();
        }
    }
}
