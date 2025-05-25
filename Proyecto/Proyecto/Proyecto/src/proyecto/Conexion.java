/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.sql.*;
import org.postgresql.ds.PGSimpleDataSource;

// Se agrega la libreria al proyecto, lueso se importan las clases de arriba
public class Conexion {
    //
    
    private static PGSimpleDataSource ds = new PGSimpleDataSource();
        
    static{
        //Datos de la base de datos
        //nombre del servidor 
        ds.setServerNames(new String[]{"ep-wandering-violet-a8drak17-pooler.eastus2.azure.neon.tech"});
        //nombre de la base de datos
        ds.setDatabaseName("Proyecto");
        //usuario de la base de datos
        ds.setUser("Proyecto_owner");
        //contrasena de la base de datos
        ds.setPassword("npg_f6ytPDC2BVEZ");
    }
    
    public static Connection getConexion() throws SQLException{
        //lanzar el exception con throws SQLException
        return ds.getConnection();
    }
}
