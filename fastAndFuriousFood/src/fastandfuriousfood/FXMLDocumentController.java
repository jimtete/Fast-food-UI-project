/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastandfuriousfood;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

/**
 *
 * @author jim-t
 */
public class FXMLDocumentController implements Initializable {
    
    String foods[]={"Γύρος","Σουζουκάκι","Σουβλάκι","Χωριάτικη","Πράσινη","Γεμιστά"};
    int foodsPrice[]={6,5,4,3,2,7};
    int foodCounter[]={0,0,0,0,0,0};
    
    @FXML
    private Label label;
    //These items are for the listview
    @FXML ListView listView;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        for (String test : foods){
            listView.getItems().add(test);
            
        }
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
    }    
    
}
