
package es.uvigo.esei.cubirds.core;

import static es.uvigo.esei.cubirds.iu.ES.pideNumero;
import pila.*;

/*
 * Esta clase representa a cada jugador. Tendrá las siguientes funcionalidades (Jugador)
 * - Un constructor para crear el jugador (hecho)
 * - Añadir y eliminar cartas de la mano (hecho)
 * - Colocar cartas en la mesa (hecho)
 * - Colocar cartas en su zona de juego (hecho)
 * - Número de cartas en la mano (hecho)
 * - Número de cartas en la zona de juego (hecho)
 * - Número de especies distintas en la zona de juego (hecho)
 * - Mostrar mano, zona de juego del jugador (hecho)
 */
public class Jugador {

    private String nombre;
    private Mano manoJugador;
    private ZonaJuego ZonaJuegoJugador;

    public Jugador(String nombre, Mano mano, ZonaJuego zonajuego) {
        this.nombre = nombre;
        this.manoJugador = mano;
        this.ZonaJuegoJugador = zonajuego;
    }

    public void eliminarCartaManoJugador(Carta c, MontonDescartes md) {
        manoJugador.sacarCartaMano(c, md);
    }

    public void anhadirCartaManoJugador(Carta c) {
        manoJugador.anhadirCartaMano(c);
    }

    public void colocarCartasMesa(Carta carta,Mesa mesa, int fila, int pos, MontonDescartes md) {
        String opc= carta.getNombre();
        switch (opc){
            case "Curruca de caña":
                for (int i = 0; i < manoJugador.mano[0].tamaño(); i++) {
                    mesa.insertarCarta(carta, fila, pos);
                }
                manoJugador.sacarCartaMano(carta, md);
                    break;
                case "Flamenco":
                for (int i = 0; i < manoJugador.mano[1].tamaño(); i++) {
                    mesa.insertarCarta(carta, fila, pos);
                }
                  manoJugador.sacarCartaMano(carta, md);
                    break;
                case "Petirrojo":
                for (int i = 0; i < manoJugador.mano[2].tamaño(); i++) {
                    mesa.insertarCarta(carta, fila, pos);
                }
                    manoJugador.sacarCartaMano(carta, md);
                    break;
                case "Tucan":
                  
                for (int i = 0; i < manoJugador.mano[3].tamaño(); i++) {
                    mesa.insertarCarta(carta, fila, pos);
                }
                  manoJugador.sacarCartaMano(carta, md); 
                    break;
                case "Pato":
               
                for (int i = 0; i < manoJugador.mano[4].tamaño(); i++) {
                    mesa.insertarCarta(carta, fila, pos);
                }
                 manoJugador.sacarCartaMano(carta, md);   
                    break;
                case "Urraca":
                  
                for (int i = 0; i < manoJugador.mano[5].tamaño(); i++) {
                    mesa.insertarCarta(carta, fila, pos);
                }
                 manoJugador.sacarCartaMano(carta, md);  
                    break;
                case "Lechuza":
                  
                for (int i = 0; i < manoJugador.mano[6].tamaño(); i++) {
                    mesa.insertarCarta(carta, fila, pos);
                }
                  manoJugador.sacarCartaMano(carta, md);  
                    break;
                case "Luacamayo":
                   
                for (int i = 0; i < manoJugador.mano[7].tamaño(); i++) {
                    mesa.insertarCarta(carta, fila, pos);
                }
                 manoJugador.sacarCartaMano(carta, md);   
                    break;
        }
              
    }
    public void colocarCartasZonadeJuego (Carta carta, MontonDescartes md) {
      ZonaJuegoJugador.anhadirCarta(carta, manoJugador, md);
      manoJugador.sacarCartaMano(carta, md);
    }
    public int numCartasMano(){
        return manoJugador.numCartasenMano;
    }   
    public int numCartasZonaJugador(){
        return this.ZonaJuegoJugador.numCartasenZonadeJuego;
    }
    public int numEspeciesDistintasJugador(){
        return this.ZonaJuegoJugador.numEspeciesDistintas;
    }
    public void mostrarManoJugador(){
        this.manoJugador.mostrarMano();
    }
    public void mostrarZonaJuegoJugador(){
        this.ZonaJuegoJugador.mostrarZonadeJuego();
    }
    
    private class ZonaJuego {

        private final Pila<Carta>[] zonaJuego;
        private int numCartasenZonadeJuego;
        private int numEspeciesDistintas;
        private final static int TAM_ZONA_JUEGO = 8;

        public int getNumCartasenZonadeJuego() {
            return numCartasenZonadeJuego;
        }

        public int getNumEspeciesDistintas() {
            return numEspeciesDistintas;
        }

        public ZonaJuego(Mano mano) {
            zonaJuego = new EnlazadaPila[TAM_ZONA_JUEGO];
            this.numCartasenZonadeJuego = 0;
            this.numEspeciesDistintas = 0;
        }

        public void anhadirCarta(Carta carta, Mano mano, MontonDescartes md) {
            mano.sacarCartaMano(carta,md);
            switch (carta.getNombre()) {
                case "Curruca de caña":
                    if(zonaJuego[0].tamaño()==0){
                        numEspeciesDistintas++;
                    }
                    zonaJuego[0].push(carta);
                    numCartasenZonadeJuego++;
                    break;
                case "Flamenco":
                    if(zonaJuego[1].tamaño()==0){
                        numEspeciesDistintas++;
                    }
                    zonaJuego[1].push(carta);
                    numCartasenZonadeJuego++;
                    break;
                case "Petirrojo":
                    if(zonaJuego[2].tamaño()==0){
                        numEspeciesDistintas++;
                    }
                    zonaJuego[2].push(carta);
                    numCartasenZonadeJuego++;
                    break;
                case "Tucan":
                    if(zonaJuego[3].tamaño()==0){
                        numEspeciesDistintas++;
                    }
                    zonaJuego[3].push(carta);
                    numCartasenZonadeJuego++;
                    break;
                case "Pato":
                    if(zonaJuego[4].tamaño()==0){
                        numEspeciesDistintas++;
                    }
                    zonaJuego[4].push(carta);
                    numCartasenZonadeJuego++;
                    break;
                case "Urraca":
                    if(zonaJuego[5].tamaño()==0){
                        numEspeciesDistintas++;
                    }
                    zonaJuego[5].push(carta);
                    numCartasenZonadeJuego++;
                    break;
                case "Lechuza":
                    if(zonaJuego[6].tamaño()==0){
                        numEspeciesDistintas++;
                    }
                    zonaJuego[6].push(carta);
                    numCartasenZonadeJuego++;
                    break;
                case "Luacamayo":
                    if(zonaJuego[7].tamaño()==0){
                        numEspeciesDistintas++;
                    }
                    zonaJuego[7].push(carta);
                    numCartasenZonadeJuego++;
                    break;
            }
        }

        public void mostrarZonadeJuego() {
            for (int i = 0; i < TAM_ZONA_JUEGO; i++) {
                for (int j = 0; j < zonaJuego[i].tamaño(); j++) {
                    if (zonaJuego[i].top() != null) {
                        System.out.println(zonaJuego[i].top() + " ");
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

        public int gettamanhoMano() {
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

        public void sacarCartaMano(Carta c, MontonDescartes md) {
            String opc = c.getNombre();
            switch (opc) {
                case "Curruca de caña":
                    for (int i = 0; i < mano[0].tamaño(); i++) {
                        mano[0].pop();
                        md.anhadirCarta(c);
                    }
                    break;
                case "Flamenco":
                    for (int i = 0; i < mano[1].tamaño(); i++) {
                        mano[1].pop();
                         md.anhadirCarta(c);
                    }
                    break;
                case "Petirrojo":
                    for (int i = 0; i < mano[2].tamaño(); i++) {
                        mano[2].pop();
                         md.anhadirCarta(c);
                    }
                    break;
                case "Tucan":
                    for (int i = 0; i < mano[3].tamaño(); i++) {
                        mano[3].pop();
                         md.anhadirCarta(c);
                    }
                    break;
                case "Pato":
                    for (int i = 0; i < mano[4].tamaño(); i++) {
                        mano[4].pop();
                         md.anhadirCarta(c);
                    }
                    break;
                case "Urraca":
                    for (int i = 0; i < mano[5].tamaño(); i++) {
                        mano[5].pop();
                        md.anhadirCarta(c);
                    }
                    break;
                case "Lechuza":
                    for (int i = 0; i < mano[6].tamaño(); i++) {
                        mano[6].pop();
                         md.anhadirCarta(c);
                    }
                    break;
                case "Luacamayo":
                    for (int i = 0; i < mano[7].tamaño(); i++) {
                        mano[7].pop();
                         md.anhadirCarta(c);
                    }
                    break;
            }
        }

        public void hayBandadaPequenha(ZonaJuego z, MontonDescartes md) {
            int opc;
            if (mano[0].tamaño() == 6) {
                do {
                    opc = pideNumero("Hay bandada pequeña de Curruca de caña. Quieres bajar la bandada a la zona de juego? (0 para si, 1 para no) ");
                    switch (opc) {
                        case 0:
                            z.anhadirCarta(mano[0].top(),this, md);
                            break;
                        case 1:
                            break;
                    }
                } while (opc != 1 || opc != 1);
            }else if (mano[1].tamaño() == 2) {
                do {
                    opc = pideNumero("Hay bandada pequeña de Flamenco. Quieres bajar la bandada a la zona de juego? (0 para si, 1 para no) ");
                    switch (opc) {
                        case 0:
                            z.anhadirCarta(mano[1].top(),this, md);
                            break;
                        case 1:
                            break;
                    }
                } while (opc != 1 || opc != 1);
            }else  if (mano[2].tamaño() == 6 ) {
                do {
                    opc = pideNumero("Hay bandada pequeña de Petirrojo. Quieres bajar la bandada a la zona de juego? (0 para si, 1 para no) ");
                    switch (opc) {
                        case 0:
                            z.anhadirCarta(mano[2].top(),this, md);
                            break;
                        case 1:
                            break;
                    }
                } while (opc != 1 || opc != 1);
            } else  if (mano[3].tamaño() == 3) {
                do {
                    opc = pideNumero("Hay bandada pequeña de Tucan. Quieres bajar la bandada a la zona de juego? (0 para si, 1 para no) ");
                    switch (opc) {
                        case 0:
                            z.anhadirCarta(mano[3].top(),this, md);
                            break;
                        case 1:
                            break;
                    }
                } while (opc != 1 || opc != 1);
            }else  if (mano[4].tamaño() == 4) {
                do {
                    opc = pideNumero("Hay bandada pequeña de Pato. Quieres bajar la bandada a la zona de juego? (0 para si, 1 para no) ");
                    switch (opc) {
                        case 0:
                            z.anhadirCarta(mano[4].top(),this, md);
                            break;
                        case 1:
                            break;
                    }
                } while (opc != 1 || opc != 1);
            }else  if (mano[5].tamaño() == 5) {
                do {
                    opc = pideNumero("Hay bandada pequeña de Urraca. Quieres bajar la bandada a la zona de juego? (0 para si, 1 para no) ");
                    switch (opc) {
                        case 0:
                            z.anhadirCarta(mano[5].top(),this, md);
                            break;
                        case 1:
                            break;
                    }
                } while (opc != 1 || opc != 1);
            } else  if (mano[6].tamaño() == 3) {
                do {
                    opc = pideNumero("Hay bandada pequeña de Lechuza. Quieres bajar la bandada a la zona de juego? (0 para si, 1 para no) ");
                    switch (opc) {
                        case 0:
                            z.anhadirCarta(mano[6].top(),this, md);
                            break;
                        case 1:
                            break;
                    }
                } while (opc != 1 || opc != 1);
            } else  if (mano[7].tamaño() == 4) {
                do {
                    opc = pideNumero("Hay bandada pequeña de Luacamayo. Quieres bajar la bandada a la zona de juego? (0 para si, 1 para no) ");
                    switch (opc) {
                        case 0:
                            z.anhadirCarta(mano[7].top(),this, md);
                            break;
                        case 1:
                            break;
                    }
                } while (opc != 1 || opc != 1);
            }
            
        }

        public void mostrarMano() {
            for (int i = 0; i < TAM_MANO_INICIAL; i++) {
                for (int j = 0; j < mano[i].tamaño(); j++) {
                    if (mano[i].top() != null) {
                        System.out.println(mano[i].top() + " ");
                    }
                }
            }
        }
    }
    /*
    * Esta clase representa la zona de juego de un jugador. Tendrá las siguientes funcionalidades (zona de juego)
    * - Un constructor para crear la zona de juego(hecho)
    * - añadir cartas(hecho)
    * - Número de cartas (hecho)
    * - Número de especies distintas(hecho)
    * - mostrar zona de juego (hecho)
     */

 /*
    * Esta clase representa la mano de un jugador. Tendrá las siguientes funcionalidades (mano)
    * - Un constructor para crear la mano (hecho)
    * - añadir cartas(hecho)
    * - eliminar cartas (hecho)
    * - número de cartas (hecho)
    * - comprobar si hay cartas suficientes para bandada pequeña (planteado)
    * - mostrar mano (hecho)
     */
}

