/*
 * Esta clase representa el montón de descartes. Funcionalidades a implementar:
 * - Constructor para crear un montón
 * - añadir carta
 */
package es.uvigo.esei.cubirds.core;
import pila.*;

public class MontonDescartes {
    private final Pila<Carta> montonDescartes;
  // private Stack <Carta> montonDescartes;
    
    public MontonDescartes (){
        montonDescartes = new EnlazadaPila<>();
       // montonDescartes = new Stack<>();
    }
    
    public void anhadirCarta(Carta c){
        montonDescartes.push(c);    
    }
}
