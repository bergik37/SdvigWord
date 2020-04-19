package sample;

import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;
import static java.lang.String.valueOf;

public class View {



    @FXML
    private TextField myTextField6;
    @FXML
    private TextField myTextField7;

    // выводит текст в
  /*  void displayLabel(Double s) {

        LabelResult.setText(String.valueOf(s));
    }*/

    void myTextField6(Double s) {

        myTextField6.setText(String.valueOf(s));

    }

    void myTextField7(Double s) {
        if(myTextField6.getText().equals("")){
            myTextField7.setPromptText("Ввести действующие напряжения");
            myTextField7.clear();
        }
        else
        {
            myTextField7.setText(String.valueOf(s));
        }


    }
}
