/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Personal
 */
public class EstadosTicketsDAO {
    public static void CrearEstados(EstadosTickets estado) throws SQLException{
        String sql = "INSERT INTO estadostickets(nombre, descripcion, estado_final) VALUES (?,?,?)";        
        
        
        try{
            //Coneccion con base de datos
            Connection conn = Conexion.getConexion();
            
            //Instrucciones SQL,contenido se guarda en psRol
            PreparedStatement ps = conn.prepareStatement(sql);
            
            //Insertar rol en rs
            ps.setString(1,estado.getNombre());
            ps.setString(2, estado.getDescripcion());
            ps.setBoolean(3, estado.getEstado_final());
            ps.executeUpdate();
            
            //Mensaje de exito
            System.out.println("El estado se guardó correctamente");
            
        }catch(SQLException ex){
            System.out.println("Error al guardar el estado");
            ex.printStackTrace();
        }
               
    }
    
}
