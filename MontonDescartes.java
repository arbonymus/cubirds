/*
 * Esta clase representa el montón de descartes. Funcionalidades a implementar:
 * - Constructor para crear un montón
 * - añadir carta
 */
package es.uvigo.esei.cubirds.core;
import java.util.Stack;


public class MontonDescartes {
    private final Stack<Carta> montonDescartes;
  // private Stack <Carta> montonDescartes;
    
    
    //
    public MontonDescartes (){
        montonDescartes = new Stack<>();
       // montonDescartes = new Stack<>();
    }
    
    //añades una carta al  monton de descartes
    public void anhadirCarta(Carta c){
        montonDescartes.push(c);    
    }
}
