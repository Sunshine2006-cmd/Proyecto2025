/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.sql.*;
/**
 *
 * @author Personal
 */
public class RolDAO {
    
    public static void CrearRol(Rol rol) throws SQLException{
        String sql = "INSERT INTO rol(nombre, descripcion) VALUES (?,?)";        
        
        
        try{
            //Coneccion con base de datos
            Connection conn = Conexion.getConexion();
            
            //Instrucciones SQL,contenido se guarda en psRol
            PreparedStatement ps = conn.prepareStatement(sql);
            
            //Insertar rol en rs
            ps.setString(1,rol.getNombre());
            ps.setString(2, rol.getDescripcion());
            ps.executeUpdate();
            
            //Mensaje de exito
            System.out.println("El rol se guardo correctamente");
            
        }catch(SQLException ex){
            System.out.println("Error al guardar el rol");
            ex.printStackTrace();
        }
               
    }
        
}
