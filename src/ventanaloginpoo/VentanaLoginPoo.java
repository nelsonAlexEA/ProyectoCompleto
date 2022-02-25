
package ventanaloginpoo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class VentanaLoginPoo extends Application {
    
    @Override
    public void start(Stage stage) {
        
        //etiqueta
        Label lbUser = new Label("Username:");
        lbUser.setFont(new Font(15));
        VBox.setMargin(lbUser, new Insets(20, 0, 0, 30));
        
        Label lbPassword = new Label("Password:");
        lbPassword.setFont(new Font(15));
        VBox.setMargin(lbPassword, new Insets(5, 0, 0, 30));
        
        //texto
        TextField txtUser = new TextField();
        txtUser.setPromptText("Nombre de usuario");
        lbPassword.setFont(new Font(15));
        txtUser.setMaxWidth(200);
        VBox.setMargin(txtUser, new Insets(5, 20, 0, 30));
        
        PasswordField PassworContraseña = new PasswordField();
        PassworContraseña.setPromptText("Contraseña");
        lbPassword.setFont(new Font(15));
        PassworContraseña.setMaxWidth(200);
        VBox.setMargin(PassworContraseña, new Insets(5, 0, 0, 30));
        
        //Boton
        Button btnIngresar = new Button("Iniciar Seccion");
        btnIngresar.setCursor(Cursor.HAND);
        btnIngresar.setFont(new Font(15));
        VBox.setMargin(btnIngresar, new Insets(10, 0, 50, 90));
        
        
        VBox root = new VBox();
        root.getChildren().addAll(lbUser, txtUser, lbPassword, PassworContraseña, btnIngresar);
        root.setAlignment(Pos.TOP_LEFT);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        stage.setTitle("Interfaz Login");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
