package Controlador;
import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Andy
 */
public class CuentasControlador implements ActionListener {
    private final BaseVista baseVista;
    private final VistaJuegoCuentas vJuego;
    private ModeloCuentas mJuego;
    private int cont;
    private int figura;
    private int contadorFigura;
    private int carta;
    
    public CuentasControlador(BaseVista vista, ModeloCuentas modelo){
        baseVista = vista;
        mJuego = modelo;
        vJuego = new VistaJuegoCuentas();
        
    }
    
    public void iniciar(){
        baseVista.setVisible(true);
        baseVista.setTitle("Cuenta Figuras");
        vJuego.setSize(1300,720);
        
        figura = (int)(Math.random()*(8-1)+ 1);
        baseVista.setSize(1300,749);
        baseVista.add(vJuego); 
        baseVista.setLocationRelativeTo(null);
        vJuego.jButton1.addActionListener(this);        
        vJuego.sumar.addActionListener(this);        
        vJuego.restar.addActionListener(this);        
        vJuego.aceptar.addActionListener(this);        
        
        vJuego.figura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/p"+figura+".png")));
               cont = 0;
        for(int i=0;i<5;i++){             
             for(int j=0;j<3;j++){
                 carta =(int)(Math.random()*(8-1)+ 1);
                 //System.out.println("/Img/"+carta+".png" + "carta:" + figura );
                 vJuego.bt = new JButton("",new ImageIcon(this.getClass().getResource("/Img/p"+carta+".png")));
                 if(carta == figura){
                     contadorFigura++;
                 }
                 vJuego.bt.setName(cont+"");
                 vJuego.bt.setBorder(BorderFactory.createRaisedSoftBevelBorder());
                 vJuego.bt.setBorderPainted(true);
                 vJuego.bt.setContentAreaFilled(false);
                 vJuego.botones[cont]= vJuego.bt;
                 cont++;
                 vJuego.add(vJuego.bt,new org.netbeans.lib.awtextra.AbsoluteConstraints((i+1)*150,(int) ((j+1)*150),128,123 ));
            }
        }   
        vJuego.jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/InterfazInicio.png"))); // NOI18N
        vJuego.add(vJuego.jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 720));
    }
    
    public void cambiar(){        
        contadorFigura = 0;
        figura = (int)(Math.random()*(8-1)+ 1);
        vJuego.figura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/p"+figura+".png")));
        cont = 0;
        carta = 0;
        for(int i=0; i<15;i++){
            carta =(int)(Math.random()*(8-1)+ 1);
            vJuego.botones[i].setIcon(new ImageIcon(this.getClass().getResource("/Img/p"+carta+".png")));            
            if(carta == figura){
                contadorFigura++;
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vJuego.jButton1){
            mJuego.salir(baseVista);
            mJuego = null;
        }
        
        if(ae.getSource() == vJuego.sumar){      
            
            mJuego.setContadorSumar(vJuego);            
        }
        
        if(ae.getSource() == vJuego.restar){
            mJuego.setContadorRestar(vJuego);            
        }
        
        if(ae.getSource() == vJuego.aceptar){
            vJuego.restar.setEnabled(false);
            vJuego.sumar.setEnabled(false);
            vJuego.aceptar.setEnabled(false);
            mJuego.checar(contadorFigura,vJuego);
            cambiar();
            vJuego.cuentas.setText("0");
        }
    }
}
