/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

/**
 *
 * @author David
 */
public class Rango {

    public static void main(String[] args) throws FueraDeRangoExcepcion {
        Util compara = new Util();
        compara.estaEnRango(200, 1, 100);
    }
}
