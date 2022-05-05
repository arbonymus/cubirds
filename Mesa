/*
 * Esta clase representa la mesa común a todos los jugadores. Funcionalidades a implementar:
 * - Constructor que cree la mesa
 * - Colocar la mesa inicial cumpliendo las restricciones
 * - Rellenar fila de la mesa cumpliendo las restricciones
 * - Insertar cartas
 * - Eliminar cartas rodeadas
 * - Mostrar mesa
 */
package es.uvigo.esei.cubirds.core;

import java.util.LinkedList;
import java.util.List;


public class Mesa {
    private final static int MAX_FILAS=4;
    private final static int MAX_COLUMNAS_INICIAL=3;
    private final List<Carta>[] cartasMesa;
    
    public Mesa(){
        cartasMesa = new LinkedList[MAX_FILAS];
        
        for(int i=0; i<MAX_FILAS; i++){
            cartasMesa[i]= new LinkedList<> ();
        }
    }
    
    private boolean contieneCarta(int fila, String carta){
        for(Carta cartaFila : cartasMesa[fila]){
            if(cartaFila.getNombre().equals(carta)){
                return true;
            }
        }
        return false;
    }
    
    public void colocarMesaInicial (Baraja baraja){
        for(int i=0; i<MAX_FILAS; i++){
            Carta carta;
            List<Carta> cartasFila = cartasMesa[i];
            while(cartasFila.size() < MAX_COLUMNAS_INICIAL){
                carta = baraja.darCarta();
                if(contieneCarta(i, carta.getNombre())){
                    baraja.anhadirCarta(carta);
                }else {
                    cartasFila.add(carta);
                }
            }
        }
            
    }
    
    public void insertarCarta(Carta c, int fila, int extremo){
        if (extremo==0){
            cartasMesa[fila].add(0, c); 
        }
        else{
            cartasMesa[fila].add(c);
        }
    }
    
    public List<Carta> cartasRodeadas (String c, int fila, int extremo){
        int tamanhoFila = cartasMesa[fila].size();
        List<Carta> CartasParaMano = new LinkedList<>();
        boolean existeCarta = contieneCarta(fila, c);
        
        if(extremo==0){
            if(existeCarta){
                int posicion = obtenerPrimeraAparicionCarta(fila, c);
                
                while(posicion != 0){ 
                    CartasParaMano.add(cartasMesa[fila].remove(0));
                    posicion --;
                }
            }
        }else{
            if(existeCarta){
                int posicion = obtenerUltimaAparicionCarta(fila,c);
                posicion++;
                
                while(posicion < tamanhoFila){
                    CartasParaMano.add(cartasMesa[fila].remove(0));
                    tamanhoFila--;
                }
            }
        }
        return CartasParaMano;
    }
    
    public int obtenerPrimeraAparicionCarta(int fila,String c){
        int toRet = 0;
        for (int i = 0; i < cartasMesa[fila].size(); i++) {
            if(c.equals(cartasMesa[i].get(i).getNombre())){
                toRet=i;
            }
        }
        return toRet;
    }
    public int obtenerUltimaAparicionCarta(int fila,String c){
        int toRet = 0;
        for (int i = cartasMesa[fila].size(); i > 0; i--) {
            if(c.equals(cartasMesa[fila].get(i).getNombre())){
                toRet=i;
            }
        }
        return toRet;
    }
    public void MostrarMesa (){
        for (int i = 0; i < MAX_FILAS; i++) {
            for( int j=0; j < cartasMesa[i].size(); j++) {
                System.out.println("\t"+ cartasMesa[i].get(j).toString()+ "  ");
            }
            System.out.println("\n");
        }
        
    }
}
