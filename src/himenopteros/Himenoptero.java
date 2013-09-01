/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package himenopteros;

/**
 *
 * @author David
 */
public class Himenoptero extends Insecto{
    private String tamanoAlas;
    private String tipoIndividuo;
    private String sexo;
    private int tiempoDesarrollo;
    private String tipoTrabajo;
    private String funcion;

    public String getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(String tamanoAlas) {
        this.tamanoAlas = tamanoAlas;
    }

    public String getTipoIndividuo() {
        return tipoIndividuo;
    }

    public void setTipoIndividuo(String tipoIndividuo) {
        this.tipoIndividuo = tipoIndividuo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTiempoDesarrollo() {
        return tiempoDesarrollo;
    }

    public void setTiempoDesarrollo(int tiempoDesarrollo) {
        this.tiempoDesarrollo = tiempoDesarrollo;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public void doMetamorfosis() {
        super.doMetamorfosis(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defenderColonia() {
        super.defenderColonia(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alimentarCrias() {
        super.alimentarCrias(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarAlimento() {
        super.buscarAlimento(); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    
}
