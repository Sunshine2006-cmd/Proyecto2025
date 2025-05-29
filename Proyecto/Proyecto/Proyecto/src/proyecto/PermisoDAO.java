package proyecto;
import java.sql.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class PermisoDAO {
    
    public static void CrearPermisos(Permiso permiso)throws SQLException{
        String sql = "INSERT INTO permiso(nombre, descripcion) VALUES (?,?)";        
        
        
        try{
            //Coneccion con base de datos
            Connection conn = Conexion.getConexion();
            
            //Instrucciones SQL,contenido se guarda en psRol
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1,permiso.getNombre());
            ps.setString(2, permiso.getDescripcion());
            ps.executeUpdate();
            
            //Mensaje de exito
            System.out.println("El permiso se guardó correctamente");
            
        }catch(SQLException ex){
            System.out.println("Error al guardar el permiso");
            ex.printStackTrace();
        }           
    }
    
}
