package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Double.NaN;
import static java.lang.Double.parseDouble;
import static java.lang.String.valueOf;


public class Controller extends TextField implements Initializable  {



    @FXML
    public TextField myTextField4;
    @FXML
    public TextField myTextField1;
    @FXML
    public TextField myTextField2;
    @FXML
    public TextField myTextField3;
    @FXML
    public TextField myTextField5;
    @FXML
    public TextField myTextField6;
    @FXML
    public TextField myTextField7;
    @FXML
    public CheckBox checkbox1;
    @FXML
    public CheckBox checkbox2;
    @FXML
    public CheckBox checkbox3;
    @FXML
    public CheckBox checkbox4;

    public double k;
    public double krit;
    public double zapas;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myTextField1.setTextFormatter(new AlphaNumericTextFormatter());
        myTextField2.setTextFormatter(new AlphaNumericTextFormatter());
        myTextField3.setTextFormatter(new AlphaNumericTextFormatter());
        myTextField4.setTextFormatter(new AlphaNumericTextFormatter());
        //myTextField6.setTextFormatter(new AlphaNumericTextFormatter());
    }






    public void showDateTime() throws Exception {



        Double a = parseDouble(myTextField1.getText());
        Double b = parseDouble(myTextField2.getText());
        Double t = parseDouble(myTextField3.getText());
        Double e = parseDouble(myTextField4.getText());
        Double c = b / a;

        if (checkbox1.isSelected()) {
            if (c <= 0.1) {
                k = 8;
            } else if ((c > 0.1) && (c <= 0.15)) {
                k = 8.5;
            } else if ((c > 0.15) && (c <= 0.2)) {
                k = 8.8;
            } else if ((c > 0.2) && (c <= 0.25)) {
                k = 9;
            } else if ((c > 0.25) && (c <= 0.30)) {
                k = 9.2;
            } else if ((c > 0.3) && (c <= 0.35)) {
                k = 9.5;
            } else if ((c > 0.35) && (c <= 0.40)) {
                k = 9.8;
            } else if ((c > 0.40) && (c <= 0.45)) {
                k = 10.3;
            } else if ((c > 0.45) && (c <= 0.50)) {
                k = 10.5;
            } else if ((c > 0.5) && (c <= 0.55)) {
                k = 10.8;
            } else if ((c > 0.55) && (c <= 0.6)) {
                k = 11;
            } else if ((c > 0.6) && (c <= 0.65)) {
                k = 11.5;
            } else if ((c > 0.65) && (c <= 0.7)) {
                k = 11.8;
            } else if ((c > 0.7) && (c <= 0.75)) {
                k = 12;
            } else if ((c > 0.75) && (c <= 0.8)) {
                k = 12.5;
            } else if ((c > 0.8) && (c <= 0.85)) {
                k = 12.8;
            } else if ((c > 0.85) && (c <= 0.9)) {
                k = 13;
            } else if ((c > 0.9) && (c <= 0.95)) {
                k = 13.5;
            } else if ((c > 0.95) && (c <= 1)) {
                k = 14;
            }
            krit = (k * e) / (Math.pow((b / t), 2));

            String d = valueOf(krit);
            myTextField5.setText(d);
            }
            else if (checkbox2.isSelected()) {
                if (c <= 0.1) {
                    k = 8;
                } else if ((c > 0.1) && (c <= 0.15)) {
                    k = 8.2;
                } else if ((c > 0.15) && (c <= 0.2)) {
                    k = 8.4;
                } else if ((c > 0.2) && (c <= 0.25)) {
                    k = 8.5;
                } else if ((c > 0.25) && (c <= 0.30)) {
                    k = 8.6;
                } else if ((c > 0.3) && (c <= 0.35)) {
                    k = 8.7;
                } else if ((c > 0.35) && (c <= 0.40)) {
                    k = 8.9;
                } else if ((c > 0.40) && (c <= 0.45)) {
                    k = 9;
                } else if ((c > 0.45) && (c <= 0.50)) {
                    k = 9.2;
                } else if ((c > 0.5) && (c <= 0.55)) {
                    k = 9.4;
                } else if ((c > 0.55) && (c <= 0.6)) {
                    k = 9.5;
                } else if ((c > 0.6) && (c <= 0.65)) {
                    k = 9.7;
                } else if ((c > 0.65) && (c <= 0.7)) {
                    k = 10;
                } else if ((c > 0.7) && (c <= 0.75)) {
                    k = 10;
                } else if ((c > 0.75) && (c <= 0.8)) {
                    k = 10.2;
                } else if ((c > 0.8) && (c <= 0.85)) {
                    k = 10.5;
                } else if ((c > 0.85) && (c <= 0.9)) {
                    k = 10.6;
                } else if ((c > 0.9) && (c <= 0.95)) {
                    k = 11;
                } else if ((c > 0.95) && (c <= 1)) {
                    k = 11;
                }
            krit = (k * e) / (Math.pow((b / t), 2));

            String d = valueOf(krit);
            myTextField5.setText(d);
            }

        else if (checkbox3.isSelected()) {
            if (c <= 0.1) {
                k = 4.9;
            } else if ((c > 0.1) && (c <= 0.15)) {
                k = 5.1;
            } else if ((c > 0.15) && (c <= 0.2)) {
                k = 5.2;
            } else if ((c > 0.2) && (c <= 0.25)) {
                k = 5.5;
            } else if ((c > 0.25) && (c <= 0.30)) {
                k = 5.8;
            } else if ((c > 0.3) && (c <= 0.35)) {
                k = 6;
            } else if ((c > 0.35) && (c <= 0.40)) {
                k = 6.2;
            } else if ((c > 0.40) && (c <= 0.45)) {
                k = 6.5;
            } else if ((c > 0.45) && (c <= 0.50)) {
                k = 6.9;
            } else if ((c > 0.5) && (c <= 0.55)) {
                k = 7;
            } else if ((c > 0.55) && (c <= 0.6)) {
                k = 7.5;
            } else if ((c > 0.6) && (c <= 0.65)) {
                k = 8;
            } else if ((c > 0.65) && (c <= 0.7)) {
                k = 8.2;
            } else if ((c > 0.7) && (c <= 0.75)) {
                k = 8.5;
            } else if ((c > 0.75) && (c <= 0.8)) {
                k = 9.1;
            } else if ((c > 0.8) && (c <= 0.85)) {
                k = 9.5;
            } else if ((c > 0.85) && (c <= 0.9)) {
                k = 10;
            } else if ((c > 0.9) && (c <= 0.95)) {
                k = 10.5;
            } else if ((c > 0.95) && (c <= 1)) {
                k = 11;
            }
            krit = (k * e) / (Math.pow((b / t), 2));

            String d = valueOf(krit);
            myTextField5.setText(d);
        }
        else if (checkbox4.isSelected()) {
            if (c <= 0.1) {
                k = 4.8;
            } else if ((c > 0.1) && (c <= 0.15)) {
                k = 5;
            } else if ((c > 0.15) && (c <= 0.2)) {
                k = 5;
            } else if ((c > 0.2) && (c <= 0.25)) {
                k = 5.1;
            } else if ((c > 0.25) && (c <= 0.30)) {
                k = 5.2;
            } else if ((c > 0.3) && (c <= 0.35)) {
                k = 5.4;
            } else if ((c > 0.35) && (c <= 0.40)) {
                k = 5.5;
            } else if ((c > 0.40) && (c <= 0.45)) {
                k = 5.6;
            } else if ((c > 0.45) && (c <= 0.50)) {
                k = 5.9;
            } else if ((c > 0.5) && (c <= 0.55)) {
                k = 6;
            } else if ((c > 0.55) && (c <= 0.6)) {
                k = 6.2;
            } else if ((c > 0.6) && (c <= 0.65)) {
                k = 6.5;
            } else if ((c > 0.65) && (c <= 0.7)) {
                k = 6.7;
            } else if ((c > 0.7) && (c <= 0.75)) {
                k = 7;
            } else if ((c > 0.75) && (c <= 0.8)) {
                k = 7.1;
            } else if ((c > 0.8) && (c <= 0.85)) {
                k = 7.4;
            } else if ((c > 0.85) && (c <= 0.9)) {
                k = 7.8;
            } else if ((c > 0.9) && (c <= 0.95)) {
                k = 8;
            } else if ((c > 0.95) && (c <= 1)) {
                k = 8.3;
            }

            krit = (k * e) / (Math.pow((b / t), 2));
            String d = valueOf(krit);
            myTextField5.setText(d);

        }
        Double f = parseDouble(myTextField6.getText());
            zapas = krit/f;
            String g = valueOf(zapas);
            myTextField7.setText(g);
        }
        }




