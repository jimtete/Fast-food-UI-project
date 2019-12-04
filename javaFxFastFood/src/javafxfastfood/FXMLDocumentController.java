/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxfastfood;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

/**
 *
 * @author jim-t
 */





public class FXMLDocumentController implements Initializable {
    
    //Food and price values
    String foods[] = {"Γύρος", "Σουτζουκάκι", "Σουβλάκι",
    "Χωριάτικη", "Πράσινη", "Γεμιστά" };int foodsprice[] = {6, 5, 4, 3, 2, 7};

    //-------OBJECTS------------
    
    int cost=0;
    @FXML private ListView foodList;
    @FXML private Spinner foodSpinner;
    @FXML private Label totalCost;
    
    //---------METHODS-------------
    public void calcFood(){
        int index=foodList.getSelectionModel().getSelectedIndex();
        int value = (Integer) foodSpinner.getValue();
        cost=cost+foodsprice[index]*value;
        totalCost.setText("Total cost: "+cost);
        foodSpinner.getValueFactory().setValue(1);
    }
    
    public void addFood(){
        for (int i=0;i<6;i++){
            foodList.getItems().add(foods[i]);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addFood();
        //Set the spinner
        SpinnerValueFactory<Integer> QuantityValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99,1);
        foodSpinner.setValueFactory(QuantityValueFactory);
        
        
    }    

}
