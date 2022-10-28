
package Modelo;
import Vista.*;
import Controlador.*;
import Vista.VistaMem1;

public class BaseModelo {
    public BaseModelo(){}
     
    public void abrirMemorama(BaseVista vista){
        vista.dispose();
        VistaMem1 v = new VistaMem1();
        Mem1Modelo m =  new Mem1Modelo();
        Mem1Controlador c = new Mem1Controlador(v,m);
        c.Iniciar();
    }
    
    public void abrirAhorcado(BaseVista vista){
        vista.dispose();
        System.out.println("Ahorcado");
        VistaAhorcado v = new VistaAhorcado();
        AhorcadoModelo m = new AhorcadoModelo();
        AhorcadoControlador c = new AhorcadoControlador(v,m);
        c.Iniciar();
    }
    
    public void abrirCuentas(BaseVista vista){
        vista.dispose();
        System.out.println("Cuentas");
        BaseVista v = new BaseVista();
        ModeloCuentas m = new ModeloCuentas();
        CuentasControlador C = new CuentasControlador(v,m);
        C.iniciar();
    }
    
    public void salir(){
        System.exit(0);
    }
    
}
