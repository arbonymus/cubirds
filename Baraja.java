/*
 * Esta clase representa la baraja de juego, necesitará implementar las siguientes funcionalidades
 *  - Un constructor con las cartas de la baraja
 *  - Barajar las cartas
 *  - Devolver el número de cartas de la baraja
 *  - Coger una carta de la baraja
 *  - Insertar una carta en la baraja
 */

package es.uvigo.esei.cubirds.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Baraja {

    private Stack<Carta> baraja;
    private int numCartas;
    // Variables constantes de la cantidad de cartas de una especie determinada 
    private final int CURRUCA_DE_CANIA = 20;
    private final int FLAMENCO = 7;
    private final int PETIRROJO = 20;
    private final int TUCAN = 10;
    private final int PATO = 13;
    private final int URRACA = 17;
    private final int LECHUZA = 8;
    private final int GUACAMAYO = 13;
    /**
     * Crea una baraja nueva
     */
    public Baraja() {
        numCartas = 0;
        baraja = new Stack<Carta>();

        for (int i = 1; i <= CURRUCA_DE_CANIA; i++) {
            baraja.add(new Carta("Curruca de caña",6,9));
            numCartas++;
        }
        for (int i = 1; i <= FLAMENCO; i++) {
            baraja.add(new Carta("Flamenco",2,3));
            numCartas++;
        }
        for (int i = 1; i <= PETIRROJO; i++) {
            baraja.add(new Carta("Petirrojo",6,9));
            numCartas++;
        }
        for (int i = 1; i <= TUCAN; i++) {
            baraja.add(new Carta("Tucan",3,4));
            numCartas++;
        }
        for (int i = 1; i <= PATO; i++) {
            baraja.add(new Carta("Pato",4,6));
            numCartas++;
        }
        for (int i = 1; i <= URRACA; i++) {
            baraja.add(new Carta("Urraca",5,7));
            numCartas++;
        }
        for (int i = 1; i <= LECHUZA; i++) {
            baraja.add(new Carta("Lechuza",3,4));
            numCartas++;
        }
        for (int i = 1; i <= GUACAMAYO; i++) {
            baraja.add(new Carta("Guacamayo",4,6));
            numCartas++;
        }
    }
   
    /**
     * Este método coge las cartas de la baraja y las desordena
     * @return 
     */
    
    //Modifica: this
    //Produce: usando la librería math y un array, se van insertando las cartas de la baraja en un array de cartas y al finalizar se mete todo de nuevo en la baraja
    
    //Produce: devuelve el número de cartas totales de la baraja.
    public int getNumCartas() {
        return numCartas;
    }
    
    
    public void Barajar(){
        Carta cartas[] = new Carta[getNumCartas()];//nuevo array auxiliar
        int aleatorio;
        do{
            aleatorio = (int) (Math.random() * getNumCartas());
            if(cartas[aleatorio]==null){//si la nueva pos donde voy a meter la carta esta vacía meela, si no sigue barajando
                cartas[aleatorio] = baraja.pop();
            }
        }while(baraja.size() > 0);//hasta que la baraja original este vacía, baraja.
        for(int i = 0;i<getNumCartas();i++){
            baraja.push(cartas[i]);
        }
    }
    /**
     * Este método retira una carta de la baraja y la elimina
     * @return Carta
     */
    //Modifica:this
    //Produce: devuelve una carta de la baraja
    public Carta darCarta() {
        numCartas--;
        return baraja.pop();
    }
    //MODIFICA : INSERTA UNA CARTA EN LA BARAJA Y AUMENTA EL CONTADOR DE numCartas
    
    public void anhadirCarta(Carta carta){
        numCartas++;
        baraja.add(carta);
    }
    


}
