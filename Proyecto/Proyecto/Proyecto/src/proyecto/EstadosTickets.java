package proyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
public class EstadosTickets {
    
    private String nombre;
    private String descripcion;
    private Boolean estado_final;

    public EstadosTickets(String nombre, String descripcion, Boolean estado_final) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado_final = estado_final;
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

    public Boolean getEstado_final() {
        return estado_final;
    }

    public void setEstado_final(Boolean estado_final) {
        this.estado_final = estado_final;
    }
    
    
    
    
    
}
