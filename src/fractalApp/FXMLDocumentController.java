package fractalApp;

import fractalApp.fractalGenerators.Dragon;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import fractalApp.fractalGenerators.KochSnowflake;
import fractalApp.fractalGenerators.LeviCurve;
import fractalApp.fractalGenerators.NFractal;
import fractalApp.fractalGenerators.SierpinsciTriangle;
import fractalApp.fractalGenerators.TSquare;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Canvas canvasC;
    @FXML
    private Button KochBtn;
    @FXML
    private Button NfracBtn;
    @FXML
    private Button TfracBtn;
    @FXML
    private Button serpBtn;
    @FXML
    private Button leviBtn;
    @FXML
    private Button pythagorBtn;
    @FXML
    private Button dragonBtn;
    
    
    @FXML
    private void  KochBtnHandler(ActionEvent event){
        KochSnowflake.draw(canvasC.getGraphicsContext2D());
       
    }
    @FXML
    private void NfracBtnHandler(ActionEvent event){
         NFractal.draw(canvasC.getGraphicsContext2D());
    }
    @FXML
    private void TfracBtnHandler(ActionEvent event){
        TSquare.draw(canvasC.getGraphicsContext2D());
    }
    @FXML
    private void  serpBtnHandler(ActionEvent event){
        SierpinsciTriangle.draw(canvasC.getGraphicsContext2D());
    }
    @FXML
    private void  leviBtnHandler(ActionEvent event){
        LeviCurve.draw(canvasC.getGraphicsContext2D());
    }

    @FXML
    private void dragonBtnHandler(ActionEvent event){
        Dragon.draw(canvasC.getGraphicsContext2D());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    

    

     
 
    
}
