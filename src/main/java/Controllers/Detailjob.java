/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import static Controllers.Berandaseeker.getCompany;
import Entity.Campaign;
import Model.JobSeekerDAO;
import com.jobportal.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Detailjob implements Initializable {

    @FXML
    private AnchorPane judul;
    @FXML
    private VBox deskripsi;
    private static Campaign data = App.campaign;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {        
        
         var comp = getCompany(data.getId_comp());
            Text name = new Text(data.getName());
            name.setLayoutX(10);
            name.setLayoutY(20);
            name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
            name.setFill(Color.NAVY);

            Text companyName = new Text(comp.getName());
            companyName.setLayoutX(10);
            companyName.setLayoutY(40);
            companyName.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            companyName.setFill(Color.BLACK);

            Text alamat = new Text(data.getLocation());
            alamat.setLayoutX(10);
            alamat.setLayoutY(60);
            alamat.setFont(Font.font(10));

            Text gaji = new Text(data.getSalary());
            gaji.setLayoutX(10);
            gaji.setLayoutY(80);
            gaji.setFont(Font.font(10));
            
            judul.getChildren().addAll(name, companyName, alamat,gaji);
            
            Text desk = new Text(data.getDescription());
            desk.setFont(Font.font("Arial", 12));
            
            Text edu = new Text(data.getEducation());
            edu.setFont(Font.font("Arial", 12));
            
            Text work = new Text(data.getWork());
            work.setFont(Font.font("Arial",12));
            
            TextFlow textflow = new TextFlow();
            textflow.setLayoutX(10);
            textflow.setLayoutY(10);
            textflow.setPrefWidth(277);
            textflow.getChildren().addAll(desk);
                                            
            deskripsi.getChildren().addAll(textflow,edu,work);
    }    

    @FXML
    private void simpancampaign(MouseEvent event) {
    }

    @FXML
    private void tentangpt(MouseEvent event) throws IOException {
        App.setRoot("tentangpt");
    }

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("berandaseeker");
    }

    @FXML
    private void registercampaign(MouseEvent event) {
        JobSeekerDAO.registCampaign(App.jobseeker.getId(), data.getId());
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Pendaftaran Campaign");
        alert.setHeaderText(null);
        alert.setContentText("Anda berhasil mendaftar di campaign ini!");
        alert.showAndWait();
    }
    
}
