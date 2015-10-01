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
public class Convocatoria {

    private String id_convocatoria;
    private String fecha_inicioconvocatoria;
    private String fecha_finconvocatoria;
    private String fk_funcionario;
    
    public Convocatoria() {
    }

    public String getId_convocatoria() {
        return id_convocatoria;
    }

    public void setId_convocatoria(String id_convocatoria) {
        this.id_convocatoria = id_convocatoria;
    }

    public String getFecha_inicioconvocatoria() {
        return fecha_inicioconvocatoria;
    }

    public void setFecha_inicioconvocatoria(String fecha_inicioconvocatoria) {
        this.fecha_inicioconvocatoria = fecha_inicioconvocatoria;
    }

    public String getFecha_finconvocatoria() {
        return fecha_finconvocatoria;
    }

    public void setFecha_finconvocatoria(String fecha_finconvocatoria) {
        this.fecha_finconvocatoria = fecha_finconvocatoria;
    }

    public String getFk_funcionario() {
        return fk_funcionario;
    }

    public void setFk_funcionario(String fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }
    
    
}
