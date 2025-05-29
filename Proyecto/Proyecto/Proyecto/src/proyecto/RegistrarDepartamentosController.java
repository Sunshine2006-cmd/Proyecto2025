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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Personal
 */
public class RegistrarDepartamentosController implements Initializable {

    
    @FXML
    private Button guardar;
    @FXML
    private Button regresar;
    @FXML
    private TextField txt_nom_dept;
    @FXML
    private TextField txt_descr_dept;
    @FXML
    private ListView <Rol> lista_roles;
    
    @FXML
    private void back(ActionEvent event)throws IOException{
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
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
