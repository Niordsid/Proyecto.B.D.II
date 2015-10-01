/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.ConvocatoriaDAO;
import util.RHException;
/**
 *
 * @author AndreStereo
 */
public class ApoyoAlimentario {
private Convocatoria convocatoria;
private ConvocatoriaDAO convocatoriaDAO;

    public ApoyoAlimentario() {
        convocatoriaDAO= new ConvocatoriaDAO();
    }
    /**
     * @param id
     * @param fechainicio
     * @param fechafin
     * @param id_funcionario
    **/
    public void crearconvocatoria(String id_convocatoria,String fechainicio, String fechafin, String id_funcionario)throws RHException {
      convocatoria = new Convocatoria();
      convocatoria.setId_convocatoria(id_convocatoria);
      convocatoria.setFecha_inicioconvocatoria(fechainicio);
      convocatoria.setFecha_finconvocatoria(fechafin);
      convocatoria.setFk_funcionario(id_funcionario);
   
      //TODO llamar metodo dao
      convocatoriaDAO.crearconvocatoria(convocatoria);
      
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }
    
}
