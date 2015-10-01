/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author AndreStereo
 */
public class Solicitud {

    private String id_solicitud;
    private String fk_estudiante;
    private String fk_convocatoria;
    private String fk_funcionario;
    private String estado_solicitud;
    private String fecha_solicitud;
    
    public Solicitud() {
    }

    public String getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(String id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getFk_estudiante() {
        return fk_estudiante;
    }

    public void setFk_estudiante(String fk_estudiante) {
        this.fk_estudiante = fk_estudiante;
    }

    public String getFk_convocatoria() {
        return fk_convocatoria;
    }

    public void setFk_convocatoria(String fk_convocatoria) {
        this.fk_convocatoria = fk_convocatoria;
    }

    public String getFk_funcionario() {
        return fk_funcionario;
    }

    public void setFk_funcionario(String fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }

    public String getEstado_solicitud() {
        return estado_solicitud;
    }

    public void setEstado_solicitud(String estado_solicitud) {
        this.estado_solicitud = estado_solicitud;
    }

    public String getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(String fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    
    
    
    
}
