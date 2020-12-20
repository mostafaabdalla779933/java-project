package xoxo;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FXMLDocumentBase extends BorderPane {

    protected final FlowPane flowPane;
    protected final Button x1;
    protected final Button x2;
    protected final Button x3;
    protected final Button x4;
    protected final Button x5;
    protected final Button x6;
    protected final Button x7;
    protected final Button x8;
    protected final Button x9;
    protected final Button bnew;
    protected final Button bb;
    protected Stage stage;
    boolean flag=true;
    public int chech_win(){
      if((x1.getText()==x2.getText()&&x2.getText()==x3.getText())||(x4.getText()==x5.getText()&&x5.getText()==x6.getText())||(x7.getText()==x8.getText()&&x8.getText()==x9.getText())||(x1.getText()==x4.getText()&&x4.getText()==x7.getText())||(x2.getText()==x5.getText()&&x5.getText()==x8.getText())||(x3.getText()==x6.getText()&&x6.getText()==x9.getText())||(x1.getText()==x5.getText()&&x5.getText()==x9.getText())||(x3.getText()==x5.getText()&&x5.getText()==x7.getText())){
          if(flag){
          
          Alert a=new Alert(AlertType.INFORMATION);
             a.setTitle("winner");
             a.setContentText("o");
             a.show();
          }else{
          Alert d=new Alert(AlertType.INFORMATION);
          d.setTitle("winner");
          d.setContentText("x");
          d.show();
          
          
          }
          x1.setDisable(true);
          x2.setDisable(true);
          x3.setDisable(true);
          x4.setDisable(true);
          x5.setDisable(true);
          x6.setDisable(true);
          x7.setDisable(true);
          x8.setDisable(true);
          x9.setDisable(true);        
          return 1;
      }else{
      return 0;
      }
    
    }
    
    public FXMLDocumentBase(Stage s) {
        stage=s;
        flowPane = new FlowPane();
        x1 = new Button();
        x2 = new Button();
        x3 = new Button();
        x4 = new Button();
        x5 = new Button();
        x6 = new Button();
        x7 = new Button();
        x8 = new Button();
        x9 = new Button();
        bnew = new Button();
        bb = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(flowPane, javafx.geometry.Pos.CENTER);
        flowPane.setPrefHeight(200.0);
        flowPane.setPrefWidth(200.0);

        x1.setMnemonicParsing(false);
        x1.setPrefHeight(102.0);
        x1.setPrefWidth(194.0);
        x1.setFont(new Font(48.0));
        x1.setText(" ");
        x1.setOnAction(e->{
            if(flag){
             x1.setText("x");
            }else{
            x1.setText("o");
            }
            flag=!flag;
            x1.setDisable(true);
            chech_win();
        });
        
        x2.setMnemonicParsing(false);
        x2.setPrefHeight(100.0);
        x2.setPrefWidth(198.0);
        x2.setFont(new Font(45.0));
        x2.setOnAction(e->{
            if(flag){
             x2.setText("x");
            }else{
            x2.setText("o");
            }
            flag=!flag;
            x2.setDisable(true);
            chech_win();
        });

        x3.setMnemonicParsing(false);
        x3.setPrefHeight(96.0);
        x3.setPrefWidth(197.0);
        x3.setFont(new Font(45.0));
        x3.setText("  ");
        x3.setOnAction(e->{
            if(flag){
             x3.setText("x");
            }else{
            x3.setText("o");
            }
            flag=!flag;
            x3.setDisable(true);
            chech_win();
        });

        x4.setMnemonicParsing(false);
        x4.setPrefHeight(96.0);
        x4.setPrefWidth(193.0);
        x4.setFont(new Font(45.0));
        x4.setOnAction(e->{
            if(flag){
             x4.setText("x");
            }else{
            x4.setText("o");
            }
            flag=!flag;
            x4.setDisable(true);
            chech_win();
        });

        x5.setMnemonicParsing(false);
        x5.setPrefHeight(96.0);
        x5.setPrefWidth(199.0);
        x5.setFont(new Font(45.0));
        x5.setText("   ");
        x5.setOnAction(e->{
            if(flag){
             x5.setText("x");
            }else{
            x5.setText("o");
            }
            flag=!flag;
            x5.setDisable(true);
            chech_win();
        });

        x6.setMnemonicParsing(false);
        x6.setPrefHeight(96.0);
        x6.setPrefWidth(192.0);
        x6.setFont(new Font(45.0));
        x6.setOnAction(e->{
            if(flag){
             x6.setText("x");
            }else{
            x6.setText("o");
            }
            flag=!flag;
            x6.setDisable(true);
            chech_win();
        });

        x7.setMnemonicParsing(false);
        x7.setPrefHeight(96.0);
        x7.setPrefWidth(192.0);
        x7.setFont(new Font(45.0));
        x7.setText("    ");
        x7.setOnAction(e->{
            if(flag){
             x7.setText("x");
            }else{
            x7.setText("o");
            }
            flag=!flag;
            x7.setDisable(true);
            chech_win();
        });

        x8.setMnemonicParsing(false);
        x8.setPrefHeight(96.0);
        x8.setPrefWidth(202.0);
        x8.setFont(new Font(45.0));
        x8.setOnAction(e->{
            if(flag){
             x8.setText("x");
            }else{
            x8.setText("o");
            }
            flag=!flag;
            x8.setDisable(true);
            chech_win();
        });

        x9.setMnemonicParsing(false);
        x9.setPrefHeight(96.0);
        x9.setPrefWidth(190.0);
        x9.setFont(new Font(45.0));
        x9.setText("     ");
        x9.setOnAction(e->{
            if(flag){
             x9.setText("x");
            }else{
            x9.setText("o");
            }
            flag=!flag;
            x9.setDisable(true);
            chech_win();
        });

        bnew.setMnemonicParsing(false);
        bnew.setText("new");
        bnew.setOnAction(e->{
        
        x1.setDisable(false);
        x2.setDisable(false);
        x3.setDisable(false);
        x4.setDisable(false);
        x5.setDisable(false);
        x6.setDisable(false);
        x7.setDisable(false);
        x8.setDisable(false);
        x9.setDisable(false); 
        x1.setText(" ");
        x2.setText("");
        x3.setText("  ");
        x4.setText("");
        x5.setText("   ");
        x6.setText("");
        x7.setText("    ");
        x8.setText("");
        x9.setText("     ");
        });
        
        bb.setMnemonicParsing(false);
        bb.setText("exit");
        setCenter(flowPane);

        flowPane.getChildren().add(x1);
        flowPane.getChildren().add(x2);
        flowPane.getChildren().add(x3);
        flowPane.getChildren().add(x4);
        flowPane.getChildren().add(x5);
        flowPane.getChildren().add(x6);
        flowPane.getChildren().add(x7);
        flowPane.getChildren().add(x8);
        flowPane.getChildren().add(x9);
        flowPane.getChildren().add(bnew);
        flowPane.getChildren().add(bb);
        

    }
}
