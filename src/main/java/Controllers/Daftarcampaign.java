/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import static Controllers.Berandaseeker.getCompany;
import com.jobportal.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Daftarcampaign implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    double cardY = 0.0;
    for (var data : App.campaigns) {
            if(App.company.getId() == data.getId_comp()){

            Text name = new Text(data.getName());
            name.setLayoutX(50);
            name.setLayoutY(cardY + 30);
            name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
            name.setFill(Color.NAVY);

            Text companyName = new Text(App.company.getName());
            companyName.setLayoutX(50);
            companyName.setLayoutY(cardY + 50);
            companyName.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            companyName.setFill(Color.BLACK);

            Text alamat = new Text(data.getLocation());
            alamat.setLayoutX(50);
            alamat.setLayoutY(cardY + 70);
            alamat.setFont(Font.font(10));

            Text gaji = new Text(data.getSalary());
            gaji.setLayoutX(50);
            gaji.setLayoutY(cardY + 90);
            gaji.setFont(Font.font(10));

            anchorPane.getChildren().addAll(name, companyName, alamat, gaji);

            cardY += 100.0;
        }
}
    }    

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("berandapt");
    }
    
}
