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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Personal
 */
public class AdministradorController implements Initializable {
    
    @FXML
    private Button rolesPermisos;
    
    @FXML
    private Button departamentos;
    
    @FXML
    private Button usuariosIniciales;
    
    @FXML
    private Button estadoTickets;
    
    @FXML
    private Button regresar;
    
    //Boton que redirige a Gestionar roles y servicios
    
    @FXML
    private void irAMenu1(ActionEvent event)throws IOException{
        try{
            //Carga la nueva escena
             Parent root = FXMLLoader.load(getClass().getResource("GestionarRolesPermisos.fxml"));
             Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();
             Scene GestionarRolesPermisos = new Scene(root);
             stage.setScene(GestionarRolesPermisos);
             stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //BOton que redirige a Registrar Departamentos
    @FXML
    private void irAMenu2(ActionEvent event)throws IOException{
        try{
            //Carga la nueva escena
             Parent root = FXMLLoader.load(getClass().getResource("RegistrarDepartamentos.fxml"));
             Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();
             Scene RegistrarDepartamentos = new Scene(root);
             stage.setScene(RegistrarDepartamentos);
             stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Boton que redirige a Registrar Usuarios Iniciales
    @FXML
    private void irAMenu3(ActionEvent event)throws IOException{
        try{
            //Carga la nueva escena
             Parent root = FXMLLoader.load(getClass().getResource("UsuariosIniciales.fxml"));
             Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();
             Scene UsuariosIniciales = new Scene(root);
             stage.setScene(UsuariosIniciales);
             stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //Boton que redirige a Estados Tickets
    @FXML
    private void irAMenu4(ActionEvent event)throws IOException{
        try{
            //Carga la nueva escena
             Parent root = FXMLLoader.load(getClass().getResource("EstadosTickets.fxml"));
             Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();
             Scene EstadosTickets = new Scene(root);
             stage.setScene(EstadosTickets);
             stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //Regresar a menu principal
    @FXML
    private void regresar(ActionEvent event)throws IOException{
        try{
            //Carga la nueva escena
             Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
             Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();
             Scene Login = new Scene(root);
             stage.setScene(Login);
             stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
