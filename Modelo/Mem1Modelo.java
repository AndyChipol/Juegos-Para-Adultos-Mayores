package Modelo;
import Vista.*;
import Controlador.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Mem1Modelo {
    
    public Mem1Modelo(){}
    
    public void btnTarjeta(VistaMem1 vista, int i){
        vista.tarjetas[i].bt.setIcon(vista.tarjetas[i].imagen);
                if(vista.par==0){
                    vista.tarjetas[i].revel=true;
                    vista.temp=vista.tarjetas[i];
                    vista.par=1;
                }
                else{
                    vista.par=0;
                    if(vista.tarjetas[i].val==vista.temp.val){
                        vista.tarjetas[i].revel=true;
                        boolean ban=true;
                        for(Lib.Tarjeta elemento: vista.tarjetas){
                            if(elemento.revel==false){
                                ban=false;
                                break;
                            }
                        }
                        if(ban){
                           MemoGanador g = new MemoGanador();
                           g.setVisible(true);
                           g.setResizable(false);
                           g.setLocationRelativeTo(null);
                           g.setSize(478,273);
                           g.setDefaultCloseOperation(EXIT_ON_CLOSE);
                           System.out.println("paso");
                        }
                    }
                    else{
                        try {
                                vista.tarjetas[i].bt.update(vista.tarjetas[i].bt.getGraphics());
                                Thread.sleep(500);
                                vista.tapar(i);
                        } 
                        catch (Exception ex) {
                           System.out.println(ex);
                        }                                
                    }
                }
    }
    
    public void siguiente(){
        
    }
}
