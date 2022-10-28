package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BaseControlador implements ActionListener {
    
    private final BaseVista baseVista;  //JFRAME PRINCIPAL
    private final VistaMenu menu;   //VistaMenu
    private BaseModelo baseModelo;  //MODELO PRINCiPAL MENU
    
    public BaseControlador(BaseVista vista, BaseModelo modelo){
        this.baseVista = vista;
        this.baseModelo = modelo;
        this.menu = new VistaMenu();  //VISTAMENU JPANEL
        
    }
    
    public void iniciar(){
        baseVista.setVisible(true);
        baseVista.setTitle("Juegos");
        menu.setSize(1280,720);
        
        baseVista.add(menu);
        baseVista.setSize(1280,749);
        baseVista.setLocationRelativeTo(null);
        
        menu.BtnMemorama.addActionListener(this);
        menu.btnArc.addActionListener(this);
        menu.btnCuentas.addActionListener(this);
        menu.btnSalir.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == menu.BtnMemorama){
            baseModelo.abrirMemorama(baseVista);
            baseModelo = null;
        }
        
        if(ae.getSource() == menu.btnArc){
            baseModelo.abrirAhorcado(baseVista);
            baseModelo = null;
        }
        
        if(ae.getSource() == menu.btnCuentas){
           baseModelo.abrirCuentas(baseVista);
           baseModelo = null;
        }
        
        if(ae.getSource() == menu.btnSalir){
            baseModelo.salir();
        }
        
    }
    
    
    
}
