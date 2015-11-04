/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.tanque.modelo;

/**
 *
 * @author a044888329b
 */
public class ControlRiego {

    String mensaje;
    int sequia, humedad;
    EstadoTanque estado;

    public ControlRiego(EstadoTanque estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getSequia() {
        return sequia;
    }

    public void setSequia(int sequia) {
        this.sequia = sequia;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public EstadoTanque getEstado() {
        return estado;
    }

    public void setEstado(EstadoTanque estado) {
        this.estado = estado;
    }
    
    public ControlRiego() {
        
    }
    
    
    
    
    
    
    
    //Permitirá llenar el tanque
    public int permitidoLLenar() {
       
        
        return 0;
        
    }
    
    
    //Permitirá vaciar el tanque
    public int permitidoVaciar() {
        return 0;
        
    }
}
