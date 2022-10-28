package Modelo;
import Vista.*;
import Controlador.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ModeloCuentas {
    public int contador;
    public int figura;

    public ModeloCuentas(){
        contador = 0;
    }
   
    public void setContadorSumar(VistaJuegoCuentas vista){
        this.contador = this.contador + 1;
        vista.cuentas.setText(String.valueOf(this.contador));
    }
    
    public void setContadorRestar(VistaJuegoCuentas vista){        
        if(this.contador > 0)
            this.contador = this.contador - 1;
        vista.cuentas.setText(String.valueOf(this.contador));        
    }
    
    public void checar(int figura,VistaJuegoCuentas vista){
        if(this.contador == figura){
            GanadorCuenta v = new GanadorCuenta(vista);
            v.setVisible(true);
            v.setSize(370,200);
            v.setLocationRelativeTo(null);
            v.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        else{
            PerdedorCuenta p = new PerdedorCuenta(vista);
            p.setVisible(true);
            p.setSize(390,200);
            p.setLocationRelativeTo(null);
            p.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        this.contador = 0;
    }
    
    public void salir(BaseVista vista){
        vista.dispose();
        BaseModelo m = new BaseModelo();
        BaseVista v = new BaseVista();
        BaseControlador c =  new BaseControlador(v,m);
        c.iniciar();
    }
}
