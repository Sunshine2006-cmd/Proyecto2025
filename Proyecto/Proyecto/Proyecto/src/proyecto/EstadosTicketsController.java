/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Personal
 */
public class EstadosTicketsController implements Initializable {

    @FXML
    private Button OK;
    @FXML
    private Button regresar;
    @FXML
    private TextField txt_nom_est;
    @FXML
    private TextField txt_desc_est;
    @FXML
    private CheckBox estado_final;
    
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
    private void crearEstados(ActionEvent event){
        String nombre = txt_nom_est.getText();
        String descripcion = txt_desc_est.getText();
        boolean estadoFinal = estado_final.isSelected();
        
        if(nombre.isEmpty()|| nombre.length()<3||nombre.length()>50){
            System.out.println("Ingrese la información de acuerdo a los parametros");
            return;
        }
        
        EstadosTickets nuevoEstado = new EstadosTickets(nombre,descripcion, estadoFinal);
        
        try{
            EstadosTicketsDAO.CrearEstados(nuevoEstado);
            txt_nom_est.clear();
            txt_desc_est.clear();
            System.out.println("Estado guardado");
        }catch(SQLException ex){
            System.out.println("Ha ocurrido un error al guardar el estado");
        }
        
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
