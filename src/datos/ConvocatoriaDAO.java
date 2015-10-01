/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import negocio.Convocatoria;

import util.RHException;

import util.ServiceLocator;
/**
 *
 * @author AndreStereo
 */
public class ConvocatoriaDAO {

    public ConvocatoriaDAO() {
    }
    
    
    public void crearconvocatoria(Convocatoria convocatoria) throws RHException{
         try {
            
            String strSQL = "INSERT INTO convocatoria (k_convocatoria, f_fechainicio, f_fechafin, k_funcionario) VALUES(?,?,?,?)";
            
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, convocatoria.getId_convocatoria());
            prepStmt.setString(2, convocatoria.getFecha_inicioconvocatoria());
            prepStmt.setString(3, convocatoria.getFecha_finconvocatoria());
            prepStmt.setString(4, convocatoria.getFk_funcionario());
            
            System.out.println("Before : " + prepStmt.toString());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {
            throw new RHException("ConvocatoriaDAO", "No se ha podido ingresar la convocatoria" + e.getMessage());
        }

    }
        

    
    public void actualizarfechainicio(Convocatoria convocatoria) throws RHException{
        
         try {
            String strSQL = "UPDATE convocatoria SET f_fechainicio=" + convocatoria.getFecha_inicioconvocatoria() + " WHERE k_solicitud=" + convocatoria.getId_convocatoria();
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo crear el empleado" + e.getMessage());
        }
}
    public void actualizarfechafin(Convocatoria convocatoria) throws RHException{
        
         try {
            String strSQL = "UPDATE convocatoria SET f_fechafin=" + convocatoria.getFecha_finconvocatoria() + " WHERE k_solicitud=" + convocatoria.getId_convocatoria();
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo crear el empleado" + e.getMessage());
        }
}
}
