/*
 * Esta clase representa la baraja de juego, necesitará implementar las siguientes funcionalidades
 *  - Un constructor con las cartas de la baraja
 *  - Barajar las cartas
 *  - Devolver el número de cartas de la baraja
 *  - Coger una carta de la baraja
 *  - Insertar una carta en la baraja
 */

package es.uvigo.esei.cubirds.core;

import cola.*;


public final class Baraja {
    Cola <Carta> bCartas;
    public Baraja() {
        bCartas = new EnlazadaCola<>();
        insertarCartas();
    }

    public Cola<Carta> getbCartas() {
        return bCartas;
    }
    
    public void insertarCartas(){
        
        Carta carta1 = new Carta("Curruca de caña",6,9,20);
        Carta carta2 = new Carta("Flamenco",2,3,7);
        Carta carta3 = new Carta ("Petirrojo",6,9,20);
        Carta carta4 = new Carta ("Tucan",3,4,10);
        Carta carta5 = new Carta ("Pato",4,6,13);
        Carta carta6 = new Carta ("Urraca",5,7,17);
        Carta carta7 = new Carta ("Lechuza",3,4,10);
        Carta carta8 = new Carta("Luacamayo",4,6,13);
        
        for(int i = 0;i<carta1.getNumCartas();i++){
            bCartas.insertar(carta1);
        }
        for(int i = 0;i<carta2.getNumCartas();i++){
            bCartas.insertar(carta2);
        }
        for(int i = 0;i<carta3.getNumCartas();i++){
            bCartas.insertar(carta3);
        }
        for(int i = 0;i<carta4.getNumCartas();i++){
            bCartas.insertar(carta4);
        }
        for(int i = 0;i<carta5.getNumCartas();i++){
            bCartas.insertar(carta5);
        }
        for(int i = 0;i<carta6.getNumCartas();i++){
            bCartas.insertar(carta6);
        }
        for(int i = 0;i<carta6.getNumCartas();i++){
            bCartas.insertar(carta6);
        }
        for(int i = 0;i<carta6.getNumCartas();i++){
            bCartas.insertar(carta6);
        }
        for(int i = 0;i<carta7.getNumCartas();i++){
            bCartas.insertar(carta7);
        }
        for(int i = 0;i<carta8.getNumCartas();i++){
            bCartas.insertar(carta8);
        }
        barajar(bCartas);
        
        
    }
    
    public void barajar (Cola<Carta> baraja){
        Carta[] bEj = new Carta[baraja.tamaño()-1];
        int pos;
        do{
            pos = ((int)(Math.random()*(110)-1));
            if(bEj[pos] == null){
                bEj[pos]= baraja.primero();
                baraja.suprimir();
            }
        }while (!(baraja.esVacio()));
        for (int i = 0; i<109;i++){
            baraja.insertar(bEj[i]);
        }
    }
    
    public int CartasenBaraja(){
        return bCartas.tamaño();
    }
    
    public Carta darCarta(){
        return this.bCartas.primero();
 
    }
    public void anhadirCarta(Carta carta){
        this.bCartas.insertar(carta);
    }
    
}
