/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package himenopteros;

/**
 *
 * @author David
 */
public abstract class Insecto implements himenopteros.interfaces.Colonia{
    private int numeroAlas;
    private int numeroPatas;
    private String tipoCabeza;
    private String tipoTorax;
    private String tipoabdomen;
    private String Tipoexoesqueleto;
    
    public void doMetamorfosis(){
        
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipoCabeza() {
        return tipoCabeza;
    }

    public void setTipoCabeza(String tipoCabeza) {
        this.tipoCabeza = tipoCabeza;
    }

    public String getTipoTorax() {
        return tipoTorax;
    }

    public void setTipoTorax(String tipoTorax) {
        this.tipoTorax = tipoTorax;
    }

    public String getTipoabdomen() {
        return tipoabdomen;
    }

    public void setTipoabdomen(String tipoabdomen) {
        this.tipoabdomen = tipoabdomen;
    }

    public String getTipoexoesqueleto() {
        return Tipoexoesqueleto;
    }

    public void setTipoexoesqueleto(String Tipoexoesqueleto) {
        this.Tipoexoesqueleto = Tipoexoesqueleto;
    }

    @Override
    public void defenderColonia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alimentarCrias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarAlimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
