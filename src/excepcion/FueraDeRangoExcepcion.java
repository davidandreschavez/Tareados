/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

/**
 *
 * @author David
 */
public class FueraDeRangoExcepcion extends Exception{
    public int rangoInferior,rangoSuperior,valor;
    public FueraDeRangoExcepcion(int rangoInferior, int rangoSuperior, int valor){
        super("El valor " + valor + " no se encuentra entre los rangos "+rangoInferior +" y "+rangoSuperior);
    }
}
