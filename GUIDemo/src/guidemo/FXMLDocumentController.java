/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author jim-t
 */
public class FXMLDocumentController implements Initializable {
    
    //These items were for the checkbox || part 1;
    @FXML private Label pizzaOrderLabel;
    @FXML private CheckBox pepperoniCheckBox;
    @FXML private CheckBox pineappleCheckBox;
    @FXML private CheckBox baconCheckBox;
    
    //These items were for the choicebox || part 2;
    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;
    
    //These items are for the combobox || part 3;
    @FXML private ComboBox comboBox;
    @FXML private Label comboBoxLabel;
    
    
    
    /*
    This will update the label for the choicebox || part 2
    */
    
    public void choiceBoxButtonPressed(){
        choiceBoxLabel.setText("My favourite fruit is:\n"+choiceBox.getValue().toString());
    }
    
    /*
    This is for the checkbox example || part 1
    */
    public void pizzaOrderButtonPushed(){
        String order = "Toppings are: ";
        
        if (pineappleCheckBox.isSelected()) order+="\npineapple";
        if (pepperoniCheckBox.isSelected()) order+="\npepperoni";
        if (baconCheckBox.isSelected()) order+="\nbacon";
        
        this.pizzaOrderLabel.setText(order);
    }
    
    /*
    This will update the comboBoxLabel when the box is changed
    */
    
    public void comboBoxedWasUpdated(){
        comboBoxLabel.setText("Course selected: \n"+ comboBox.getValue().toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pizzaOrderLabel.setText("");
        
        //These items are for configuring the choiceBox example
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().addAll("oranges","pears","strawberries");
        choiceBox.setValue("apples");
        
        //These items are for configuiring the comboBox example
        comboBoxLabel.setText("");
        comboBox.getItems().addAll("COMP1030","COMP1080","COMP2003","EMU8086");
    }   
    
}
