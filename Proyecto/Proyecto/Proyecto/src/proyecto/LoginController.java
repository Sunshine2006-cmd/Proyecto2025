/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Personal
 */
public class LoginController implements Initializable {
    
    @FXML
    private Button ingresar;
    @FXML 
    private ComboBox <String> ingresarRol;
    @FXML
    private PasswordField password;
    
    
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
            
            ingresarRol.setItems(listaRoles);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    @FXML
    private void ingresar(ActionEvent event)throws IOException{
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
        
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mostrarRoles();
    }    
    
}
