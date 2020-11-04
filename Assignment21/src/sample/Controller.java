package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField PrincipaldollaramountField;
    @FXML
    private TextField InterestrateField;
    @FXML
    private TextField NumberofyearsField;


    public void onSubmit(ActionEvent actionEvent) {



        if (PrincipaldollaramountField.getText().isEmpty() || PrincipaldollaramountField.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR,"Error","Error","please enter your dollormount");

      //      Alert alert = new Alert(Alert.AlertType.ERROR);
      //      alert.setTitle("Error");
      //      alert.setContentText("Please enter your dolloramount");
      //      alert.setHeaderText(null);
      //      alert.show();

        } else if (InterestrateField.getText().isEmpty() || InterestrateField.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR,"Error","Error","please enter your InterestrateField");
       //     Alert alert = new Alert(Alert.AlertType.ERROR);
        //         alert.setTitle("Error");
       //     alert.setContentText("Please enter your InterestrateField");
       //     alert.setHeaderText(null);
       //     alert.show();

        } else if (NumberofyearsField.getText().isEmpty() || NumberofyearsField.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR,"Error","Error","please enter your Numberofyears");
        //    Alert alert = new Alert(Alert.AlertType.ERROR);
       //     alert.setTitle("Error");
        //    alert.setContentText("Please enter your Numberofyears");
        //    alert.setHeaderText(null);
        //    alert.show();
        }
        else {



            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Loan Created");

            double principalAmount = Double.parseDouble(PrincipaldollaramountField.getText());
            double interest = Double.parseDouble(InterestrateField.getText());
            double numberOfYear = Double.parseDouble(NumberofyearsField.getText());
            double monthlyAmount = principalAmount * interest / (1 - (Math.pow(1 / (1 + interest), (numberOfYear * 12))));
            alert.setContentText("Monthly Payment is: " + monthlyAmount  );
            alert.setHeaderText(null);
            alert.show();
            System.out.println(PrincipaldollaramountField.getText());
            System.out.println(InterestrateField.getText());
            System.out.println(NumberofyearsField.getText());








        }
    }
}
