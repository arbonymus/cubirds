/*
 * Esta clase representa cada carta del juego, con todos sus atributos, constructor y métodos observadores
 */

package es.uvigo.esei.cubirds.core;


public class Carta {
    private String nombre;
    private int numbandpeq;
    private int numbandgrande;
    private int numCartas;
    public Carta(String nombre, int numbandpeq, int numbandgrande, int numCartas) {
        this.nombre = nombre;
        this.numbandpeq = numbandpeq;
        this.numbandgrande = numbandgrande;
        this.numCartas=numCartas;
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

    public int getNumCartas() {
        return numCartas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumbandpeq(int numbandpeq) {
        this.numbandpeq = numbandpeq;
    }

    public void setNumbandgrande(int numbandgrande) {
        this.numbandgrande = numbandgrande;
    }

    public void setNumCartas(int numCartas) {
        this.numCartas = numCartas;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(nombre);
        sb.append(" (").append(numbandpeq);
        sb.append("/").append(numbandgrande);
        sb.append("): ").append(numCartas).append(" cartas");
       
        return sb.toString();
    }

    
    
    

}
