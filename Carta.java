/*
 * Esta clase representa cada carta del juego, con todos sus atributos, constructor y métodos observadores
 */

package es.uvigo.esei.cubirds.core;


public class Carta {
    private String nombre;
    private int numbandpeq;
    private int numbandgrande;
    
    public Carta(String nombre, int numbandpeq, int numbandgrande) {
        this.nombre = nombre;
        this.numbandpeq = numbandpeq;
        this.numbandgrande = numbandgrande;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumbandpeq() {
        return numbandpeq;
    }

    public int getNumbandgrande() {
        return numbandgrande;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(nombre);
        sb.append(" (").append(numbandpeq);
        sb.append("/").append(numbandgrande).append(")");
       
        return sb.toString();
    }
}

