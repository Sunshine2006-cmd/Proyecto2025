/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;

/**
 * FXML Controller class
 *
 * @author Personal
 */
public class GestionarRolesPermisosController implements Initializable {

    @FXML
    private Button boton1;
    @FXML
    private Button boton2;
    @FXML
    private Button boton3;
    @FXML
    private Button regresar;
    @FXML
    private RadioButton eliminarPermiso;
    @FXML
    private RadioButton crearPermisos;
    /*@FXML
    private ComboBox eliminacion;*/
    @FXML
    private ComboBox<String>mostrarRol;
    /*@FXML
    private ComboBox permiso;*/
    @FXML
    private TextField txt_nombre_rol;
    @FXML
    private TextField txt_Descr_rol;
    @FXML
    private TextField txt_nom_Permiso;
    @FXML
    private TextField txt_descr_Permiso;
    
    
    @FXML
    private void regresar(ActionEvent event)throws IOException{
        try{
            //Carga la nueva escena
             Parent root = FXMLLoader.load(getClass().getResource("Administrador.fxml"));
             Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();
             Scene Administrador = new Scene(root);
             stage.setScene(Administrador);
             stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @FXML
    private void crearRol(ActionEvent event){
        String nombre = txt_nombre_rol.getText();
        String descripcion = txt_Descr_rol.getText();
        
        if(nombre.isEmpty()|| nombre.length()<3||nombre.length()>50){
            System.out.println("Ingrese la información de acuerdo a los parametros");
            return;
        }
        
        Rol nuevoRol = new Rol(nombre,descripcion);
        
        try{
            RolDAO.CrearRol(nuevoRol);
            txt_nombre_rol.clear();
            txt_Descr_rol.clear();
            System.out.println("Rol guardado");
        }catch(SQLException ex){
            System.out.println("Ha ocurrido un error al guardar el rol");
        }
        
    }
    
    
    @FXML
    private void crearPermiso(ActionEvent event){
        String nombre = txt_nom_Permiso.getText();
        String descripcion = txt_descr_Permiso.getText();
        
        if(nombre.isEmpty()|| nombre.length()<3||nombre.length()>50){
            System.out.println("Ingrese la información de acuerdo a los parametros");
            return;
        }
        
        Permiso nuevoPermiso = new Permiso(nombre,descripcion);
        
        try{
            PermisoDAO.CrearPermisos(nuevoPermiso);
            txt_nom_Permiso.clear();
            txt_descr_Permiso.clear();
            System.out.println("Permiso guardado");
        }catch(SQLException ex){
            System.out.println("Ha ocurrido un error al guardar el rol");
        }
        
    }
    
    @FXML
    private void mostrarRoles(){
        //declaracion de lista
        ObservableList<String> listaRoles = FXCollections.observableArrayList();
        
        try{
            Connection conn = Conexion.getConexion();
            //Instruccion sql a java
                String sql = 
                        """
                        SELECT nombre FROM rol
                        """;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                listaRoles.add(rs.getString("nombre"));
            }
            
            mostrarRol.setItems(listaRoles);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
        
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
}
