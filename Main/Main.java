package Main;
import Controlador.*;
import Modelo.*;
import Vista.*;
/**
 *
 * @author Andy
 */
public class Main {
    public static void main(String args[]){
        BaseVista V =  new BaseVista();
        BaseModelo M = new BaseModelo();
        BaseControlador C = new BaseControlador(V,M);
        C.iniciar();
    }
}
