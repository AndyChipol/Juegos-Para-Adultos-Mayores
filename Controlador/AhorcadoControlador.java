
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AhorcadoControlador implements ActionListener{
    private VistaAhorcado vista;
    private AhorcadoModelo model;
    
    public AhorcadoControlador(VistaAhorcado vista, AhorcadoModelo model){
        this.vista = vista;
        this.model = model;
    }
    
    public void Iniciar(){
        vista.setSize(645,700);
        vista.setLocationRelativeTo(null);//posicion de la ventana
        vista.setResizable(false);
        vista.setVisible(true);
        vista.setTitle("Ahorcado");
        vista.Iniciar.addActionListener(this);
        vista.btnSalir.addActionListener(this);
        for (int i = 1; i < 28; i++) {
            vista.btns[i].addActionListener(this);
            vista.btns[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }
        
        model.iniciar(vista);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vista.Iniciar){
            model.generarPalabra(vista);
        }
        
        if(ae.getSource() == vista.btnSalir){
            model.salir(vista);
        }
        
        for(int i=1;i <28;i++){
            if(ae.getSource() == vista.btns[i]){
               model.checarLetra(vista,vista.btns[i]); 
            }
        }
    }
    
}
