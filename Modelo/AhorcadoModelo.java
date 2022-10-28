
package Modelo;
import Vista.*;
import Modelo.*;
import Controlador.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

public class AhorcadoModelo {
    public AhorcadoModelo(){
        
    }
    
    public void iniciar(VistaAhorcado vista){
         vista.err = 0;
            vista.err2=6;
            vista.Dibujo.setIcon(vista.imgs[0]);
            vista.txtPalabra.setText("");
            vista.errores.setIcon(vista.imgs[6]);//:___________________________________----
            //para activar las letras del tablero
            for (int i = 1; i < 28; i++) {
                vista.btns[i].setEnabled(true);
            }
            //para generar una palabra aleatoriamente
            vista.ran = (int) 0 + (int) (Math.random() * ((vista.msgs.length - 1) + 1));
            //SEPARA EL MENSAJE POR PALABRAS
            String pal[] = vista.msgs[vista.ran].split(" ");
            vista.res = new String[vista.msgs[vista.ran].length() + 1];
            int j = 0;
            // seran los guiones que van debajo de las letras como una separacion
            for (String pal1 : pal) {
                for (int i = 0; i < pal1.length(); i++) {
                    vista.txtPalabra.setText(vista.txtPalabra.getText() + "_ ");
                    vista.res[j++] = "_";
                }
                vista.txtPalabra.setText(vista.txtPalabra.getText() + "\n");
                vista.res[j++] = " ";
            }
    }
    
    public void generarPalabra(VistaAhorcado vista){
        if (JOptionPane.showConfirmDialog(
                null, 
                "¿Estas seguro de querer una palabra nueva?",
                "Ahorcado", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
        {
            iniciar(vista);
        }
        else{
                vista.setDefaultCloseOperation(0);
        }
    }
    
    public void salir(VistaAhorcado vista){
        vista.dispose();
        BaseVista v = new BaseVista();
        BaseModelo m = new BaseModelo();
        BaseControlador c = new BaseControlador(v,m);
        c.iniciar();
        
    }
    
    public void checarLetra(VistaAhorcado vista,JButton bt){   
        char c[];
        //busca la letra en la palabra despues de haber sido presionada
        for (int i = 1; i < 28; i++) {
            if (bt == vista.btns[i]) {
                //la tecla es inicializada
                c = Character.toChars(64 + i);
                //busca si la letra esta en la frase
                boolean esta = false;
                for (int j = 0; j < vista.msgs[vista.ran].length(); j++) {
                    if (c[0] == vista.msgs[vista.ran].charAt(j)) {
                        vista.res[j] = c[0] + "";
                        esta = true;
                    }
                }
                //SI LA LETRA ESTA EN EL MENSAJE SE MUESTRA EN EL TEXTPANEL
                if (esta) {
                    vista.txtPalabra.setText("");
                    for (String re : vista.res) {
                        if (" ".equals(re)) {
                            vista.txtPalabra.setText(vista.txtPalabra.getText() + "\n");
                        } else {
                            vista.txtPalabra.setText(vista.txtPalabra.getText() + re + " ");
                        }
                    }
                    //hace una comprobacion de las letras restantes y faltantes, en caso de que ya no haya letras sera ganador
                    boolean gano = true;
                    for (String re : vista.res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    //al ser correcta se muestra un mensaje y se reinicia el juego
                    
                    if (gano) { 
                        GanadorAhorcado g = new GanadorAhorcado();
                        g.setVisible(true);
                        g.setResizable(false);
                        g.setLocationRelativeTo(null);
                        g.setSize(525, 261);
                        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
                        iniciar(vista);
                        return;
                    }
                    //SI LA LETRA NO ESTA EN EL MENSAGE, SE INCREMENTA EL ERROR Y SE CAMBIA LA IMAGEN
                } else {
                    vista.Dibujo.setIcon(vista.imgs[++vista.err]);
                    vista.errores.setIcon(vista.imgs[++vista.err2]);
                    //SI SE LLEGA A LOS 5 ERRORES ENTONCES SE PIERDE EL JUEGO Y SE MANDA EL MENSAGE DE:
                    if (vista.err == 5) {                        
                        AhorcadoPierde g = new AhorcadoPierde();
                        g.respuesta.setText(vista.msgs[vista.ran]);
                        g.setVisible(true);
                        g.setResizable(false);
                        g.setLocationRelativeTo(null);
                        g.setSize(507, 300);
                        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
                        iniciar(vista);
                        return;
                    }
                }
                //esta es la linea que desactiva las letras despues de ser usadas :3
                bt.setEnabled(false);
                break;
            }
        }
    }
    
}
