/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

/**
 *
 * @author David
 */
public class Util {
    private int valor;
        
    public void estaEnRango( int valor, int desde, int hasta) throws FueraDeRangoExcepcion{
        if (this.valor < desde){
            throw new FueraDeRangoExcepcion(desde, hasta, valor);
        }else if (this.valor > hasta){
            throw new FueraDeRangoExcepcion(desde, hasta, valor);
        }else{
            System.out.println("El valor dado se encuentra entre el rango seleccionado");
        }
    }
}
