/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
/*
import static javafx.application.Application.launch;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
*/

/**
 *
 * Esta clase representa la implementación de la interfaz View para mostrar un saludo utilizando una interfaz gráfica de usuario basada en JavaFX.
 * El método 'showGreeting' lanza una aplicación JavaFX que muestra el saludo proporcionado en una ventana de GUI.
 * Para mostrar el saludo, utiliza un archivo FXML llamado "View.fxml" que contiene la estructura de la interfaz de usuario.
 * Esta clase extiende 'javafx.application.Application' para permitir la creación de la GUI.
 * 
 * @author Iñigo Eguskiza
 */
/*public class ViewImplementation extends javafx.application.Application implements View {

    @FXML
    private Label labelSaludo;
    
    @Override
    public void showGreeting(String greeting) {
        String[] args = new String[1];
        args[0] = greeting;
        launch(args);
    }

    public void start(Stage primaryStage)throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));

            Parent root = loader.load();
            ViewImplementation viewController = loader.getController();
            
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            
            viewController.labelSaludo.setText(getParameters().getRaw().get(0));
            
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();    
        }
    }
}
*/
