/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxfastfood;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author jim-t
 */





public class FXMLDocumentController implements Initializable {
    
    
    //Drinks and price values
    String drinks[] = { "Πορτοκαλάδα", "ΚόκαΚόλα", "Νερό",
    "Λεμονάδα"};int drinksprice[] = {2, 3, 1, 2};
    String drinksP[] = {"drinksImages/drinksPortokalada.jpg","drinksImages/drinksCocaCola.jpg",
        "drinksImages/drinksNero.jpg","drinksImages/drinksLemonada.jpg"
    };
    
    
    //Food and price values
    String foods[] = {"Γύρος", "Σουτζουκάκι", "Σουβλάκι",
    "Χωριάτικη", "Πράσινη", "Γεμιστά" };int foodsprice[] = {6, 5, 4, 3, 2, 7};
    String foodsP[]={"foodImages/foodGyros.jpg","./foodImages/foodSoutzoukaki.jpg","./foodImages/foodSouvlaki.jpg","foodImages/foodChoriatiki.jpg","./foodImages/foodPrasini.jpg","./foodImages/foodGemista.jpg"};
    //-------OBJECTS------------
    
    int cost=0;
    @FXML private ListView foodList;
    @FXML private Spinner foodSpinner;
    @FXML private Label totalCost;
    @FXML private ImageView foodImage;
    @FXML private ComboBox drinkCombo;
    @FXML private Spinner drinkSpinner;
    @FXML private ImageView drinksImage;
    
    //---------METHODS-------------
    public void calcFood(){
        int index=foodList.getSelectionModel().getSelectedIndex();
        int value = (Integer) foodSpinner.getValue();
        cost=cost+foodsprice[index]*value;
        totalCost.setText("Συνολικό κόστος: "+cost);
        foodSpinner.getValueFactory().setValue(1);
    }
    
    public void calcDrink(){
        int index=drinkCombo.getSelectionModel().getSelectedIndex();
        int value = (Integer) drinkSpinner.getValue();
        cost=cost+drinksprice[index]*value;
        totalCost.setText("Συνολικό κόστος: "+cost);
        drinkSpinner.getValueFactory().setValue(1);
    }
    
    public void setPicture(){
        int index=foodList.getSelectionModel().getSelectedIndex();
        File file = new File("src/javafxfastfood/"+foodsP[index]);
        Image image = new Image(file.toURI().toString());
        foodImage.setImage(image);
    }
    
    public void setPicture2(){
        int index=drinkCombo.getSelectionModel().getSelectedIndex();
        File file2 = new File("src/javafxfastfood/"+drinksP[index]);
        Image image2 = new Image(file2.toURI().toString());
        drinksImage.setImage(image2);
    }
    
    public void addFood(){
        for (int i=0;i<6;i++){
            foodList.getItems().add(foods[i]);
        }
    }
    
    public void addDrink(){
        for (int i=0;i<4;i++){
            drinkCombo.getItems().add(drinks[i]);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addFood();
        //Set the spinner
        SpinnerValueFactory<Integer> QuantityValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99,1);
        foodSpinner.setValueFactory(QuantityValueFactory);
        addDrink();
        drinkCombo.getSelectionModel().selectFirst();
        SpinnerValueFactory<Integer> QuantityValueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99,1);
        drinkSpinner.setValueFactory(QuantityValueFactory2);

        
    }    

}
