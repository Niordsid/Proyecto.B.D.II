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

import negocio.Solicitud;

import util.RHException;
import util.ServiceLocator;

/**
 *
 * @author AndreStereo
 */
public class SolicitudDAO {

    public SolicitudDAO() {
    }

    public void registrarsolicitud(Solicitud solicitud) throws RHException {

        try {
            String strSQL = "INSERT INTO solicitud (k_solicitud, k_estudiante, "
                    +" k_convocatoria, k_funcionario, n_estadosolicitud, f_solicitud) "
                    +"VALUES(?,?,?,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, solicitud.getId_solicitud());
            prepStmt.setString(2, solicitud.getFk_estudiante());
            prepStmt.setString(3, solicitud.getFk_convocatoria());
            prepStmt.setString(4, solicitud.getFk_funcionario());
            prepStmt.setString(5, solicitud.getEstado_solicitud());
            prepStmt.setDate(6, java.sql.Date.valueOf(solicitud.getFecha_solicitud()));
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo crear el empleado" + e.getMessage());
        }

    }

    public void actualizarsolicitud(Solicitud solicitud) throws RHException {

        try {
            String strSQL = "UPDATE solicitud SET n_estadosolicitud=" + solicitud.getEstado_solicitud() + " WHERE k_solicitud=" + solicitud.getId_solicitud();
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo actualizar el estado" + e.getMessage());
        }
    }
    
    public void consultarestadosolicitud(Solicitud solicitud) throws RHException{
try {
            String strSQL = "SELECT k_solicitud, k_estudiante, n_estadosolicitud FROM solicitud S, estud_convo C, estudiante E where E.k_estudiante=C.k_estudiante AND C.k_estudiante=S.k_estudiante and S.k_estudiante=" + solicitud.getFk_estudiante();
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo actualizar el estado" + e.getMessage());
        }
    }
}
