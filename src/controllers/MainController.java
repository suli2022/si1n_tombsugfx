package controllers;

import javafx.scene.control.Button;
import models.MainModel;
import views.MainPanel;

public class MainController {

    MainPanel mainPanel;
    MainModel mainModel;
    public MainController() {
        this.mainPanel = new MainPanel();
        this.mainModel = new MainModel();
        this.handleEvent();
    }
    public MainPanel getMainPanel() {
        return this.mainPanel;
    }
    public void handleEvent() {
        Button calcButton = this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> {
            
            String sideStr = this.mainPanel.getSidePanel().getValue();
            String alphaStr = this.mainPanel.getAlphaPanel().getValue();
            double side = Double.parseDouble(sideStr);
            double alpha = Double.parseDouble(alphaStr);
            Double radius = this.mainModel.calcRadius(side, alpha);
            
            this.mainPanel.getRadiusPanel().setValue(radius.toString());
        });
    }
}
