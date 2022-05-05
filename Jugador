
package es.uvigo.esei.cubirds.core;

import static es.uvigo.esei.cubirds.iu.ES.pideNumero;
import pila.*;
/*
 * Esta clase representa a cada jugador. Tendrá las siguientes funcionalidades
 * - Un constructor para crear el jugador
 * - Añadir y eliminar cartas de la mano
 * - Colocar cartas en la mesa
 * - Colocar cartas en su zona de juego
 * - Número de cartas en la mano
 * - Número de cartas en la zona de juego
 * - Número de especies distintas en la zona de juego
 * - Mostrar mano, zona de juego del jugador
 */
public class Jugador {

    /*
    * Esta clase representa la zona de juego de un jugador. Tendrá las siguientes funcionalidades
    * - Un constructor para crear la zona de juego(hecho)
    * - añadir cartas(hecho)
    * - Número de cartas (hecho)
    * - Número de especies distintas(hecho)
    * - mostrar zona de juego (hecho)
     */
    private class ZonaJuego {
        private final Pila<Carta>[] zonaJuego;
        private final int numCartasenZonadeJuego;
        private final int numEspeciesDistintas;
        private final static int TAM_ZONA_JUEGO = 8;

        public int getNumCartasenZonadeJuego() {
            return numCartasenZonadeJuego;
        }

        public int getNumEspeciesDistintas() {
            return numEspeciesDistintas;
        }
        public ZonaJuego(Mano mano){
            zonaJuego = new EnlazadaPila[TAM_ZONA_JUEGO];
            this.numCartasenZonadeJuego=0;
            this.numEspeciesDistintas=0;
        }
        public void anhadirCarta(Carta carta,Mano mano){
            mano.sacarCartaMano(carta);
            switch (carta.getNombre()) {
                    case "Curruca de caña":
                        zonaJuego[0].push(carta);
                        break;
                    case "Flamenco":
                        zonaJuego[1].push(carta);
                        break;
                    case "Petirrojo":
                        zonaJuego[2].push(carta);
                        break;
                    case "Tucan":
                        zonaJuego[3].push(carta);
                        break;
                    case "Pato":
                        zonaJuego[4].push(carta);
                        break;
                    case "Urraca":
                        zonaJuego[5].push(carta);
                        break;
                    case "Lechuza":
                        zonaJuego[6].push(carta);
                        break;
                    case "Luacamayo":
                        zonaJuego[7].push(carta);
                        break;
            }
        }
        public void mostrarZonadeJuego(){
            for (int i = 0; i < TAM_ZONA_JUEGO; i++) {
                for (int j = 0; j < zonaJuego[i].tamaño(); j++) {
                    if(zonaJuego[i].top()!=null){
                        System.out.println(zonaJuego[i].top()+" ");
                    } 
                }
            }
        }
        
         
    }
    private final class Mano {

        private final Pila<Carta>[] mano;
        private int numCartasenMano;
        private final static int TAM_MANO_INICIAL = 8;

        public Mano(Baraja baraja) {
            mano = new EnlazadaPila[TAM_MANO_INICIAL];
            numCartasenMano = 0;
            crearMano(baraja);
        }
        
        public int gettamanhoMano(){
            return numCartasenMano;
        }

        public void crearMano(Baraja b) {
            Carta carta;
            Pila<Carta>[] aux = null;
            for (int i = 0; i < TAM_MANO_INICIAL; i++) {
                carta = b.darCarta();
                aux[i].push(carta);
                numCartasenMano++;
                String opc = aux[i].top().getNombre();

                switch (opc) {
                    case "Curruca de caña":
                        mano[0].push(aux[i].top());
                        break;
                    case "Flamenco":
                        mano[1].push(aux[i].top());
                        break;
                    case "Petirrojo":
                        mano[2].push(aux[i].top());
                        break;
                    case "Tucan":
                        mano[3].push(aux[i].top());
                        break;
                    case "Pato":
                        mano[4].push(aux[i].top());
                        break;
                    case "Urraca":
                        mano[5].push(aux[i].top());
                        break;
                    case "Lechuza":
                        mano[6].push(aux[i].top());
                        break;
                    case "Luacamayo":
                        mano[7].push(aux[i].top());
                        break;


            }
          

        }
     }

        public void anhadirCartaMano(Carta c) {
            String opc = c.getNombre();
            switch (opc) {
                case "Curruca de caña":
                    mano[0].push(c);
                    numCartasenMano++;
                    break;
                case "Flamenco":
                    mano[1].push(c);
                    numCartasenMano++;
                    break;
                case "Petirrojo":
                    mano[2].push(c);
                    numCartasenMano++;
                    break;
                case "Tucan":
                    mano[3].push(c);
                    numCartasenMano++;
                    break;
                case "Pato":
                    mano[4].push(c);
                    numCartasenMano++;
                    break;
                case "Urraca":
                    mano[5].push(c);
                    numCartasenMano++;
                    break;
                case "Lechuza":
                    mano[6].push(c);
                    numCartasenMano++;
                    break;
                case "Luacamayo":
                    mano[7].push(c);
                    numCartasenMano++;
                    break;

            }
        }
        //igual hay que borrarla.
        public void sacarCartaMano(Carta c) {
            String opc = c.getNombre();
            switch (opc) {
                case "Curruca de caña":
                    for (int i = 0; i < mano[0].tamaño(); i++) {
                        mano[0].pop();
                    }
                    break;
                case "Flamenco":
                    for (int i = 0; i < mano[1].tamaño(); i++) {
                        mano[1].pop();
                    }
                    break;
                case "Petirrojo":
                   for (int i = 0; i < mano[2].tamaño(); i++) {
                        mano[2].pop();
                    }
                    break;
                case "Tucan":
                   for (int i = 0; i < mano[3].tamaño(); i++) {
                        mano[3].pop();
                    }
                    break;
                case "Pato":
                    for (int i = 0; i < mano[4].tamaño(); i++) {
                        mano[4].pop();
                    }
                    break;
                case "Urraca":
                    for (int i = 0; i < mano[5].tamaño(); i++) {
                        mano[5].pop();
                    }
                    break;
                case "Lechuza":
                  for (int i = 0; i < mano[6].tamaño(); i++) {
                        mano[6].pop();
                    }
                    break;
                case "Luacamayo":
                    for (int i = 0; i < mano[7].tamaño(); i++) {
                        mano[7].pop();
                    }
                    break;
            }
        }
        public void hayBandadaPequenha(){
             int opc;
            if (mano[0].tamaño()==6){
                do  { 
                opc = pideNumero("Hay bandada pequeña de Curruca de caña. Quieres bajar la bandada a la zona de juego? (0 para si, 1 para no) ");
                switch (opc){
                    case 0:
                        //anhadir a la zona de juego
                        break;
                    case 1:
                        break;
                }
              }while(opc!=1 || opc!=1);
            }
        }
        public void mostrarMano(){
            for (int i = 0; i < TAM_MANO_INICIAL; i++) {
                for (int j = 0; j < mano[i].tamaño(); j++) {
                    if(mano[i].top()!=null){
                        System.out.println(mano[i].top()+" ");
                    } 
                }
            }
        }
    }
    /*
    * Esta clase representa la mano de un jugador. Tendrá las siguientes funcionalidades
    * - Un constructor para crear la mano (hecho)
    * - añadir cartas(hecho)
    * - eliminar cartas (hecho)
    * - número de cartas (hecho)
    * - comprobar si hay cartas suficientes para bandada pequeña (planteado)
    * - mostrar mano (hecho)
     */
}
