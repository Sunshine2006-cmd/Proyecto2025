/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.ArrayList;


/**
 *
 * @author Personal
 */
public class Rol {
    
    private String nombre;
    private String descripcion;
    private ArrayList <String> permisos = new ArrayList<>();

    public Rol(String nombre, String descripcion, ArrayList<String> Permisos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.permisos = Permisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void modificar(){
        
    }
    public void crear(){
        
    }
    public void eliminar(){
        
    }
    
    
    
}
