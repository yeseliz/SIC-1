/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontable;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mario
 */
public class CatalogoController implements Initializable {

   // ControlledScreen 
//atributo de conexion a la base de datos

    private Connection connection;
//finalizacion de atributo para conexion de la base de datos

    @FXML
    BorderPane home;
    @FXML
    Button btnBuscar;
    @FXML
    TextField txtnombre;
    @FXML
    TextField txtCodigo;
    

    private void conetar() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Catalogo de cuentas", "catalogo", "sic");

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
        /*
        @FXML
    public void btnBuscar() {
        btnBuscar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Stage stage = new Stage();
                    stage.setTitle("Sistema Contable");
                    home = FXMLLoader.load(getClass().getResource("vistas/HOME.fxml"));
                    Scene scene = new Scene(home);
                    stage.setScene(scene);
                    stage.show();

                } catch (IOException ex) {
                     Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
        });

        
        
        
    }    

  
}
*/
