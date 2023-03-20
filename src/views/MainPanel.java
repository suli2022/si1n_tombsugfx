package views;

import com.github.suli2022.inputlib.ButtonPanel;
import com.github.suli2022.inputlib.InputPanel;
import com.github.suli2022.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox {
    TitlePanel titlePanel;
    InputPanel sidePanel;
    InputPanel alphaPanel;
    ButtonPanel buttonPanel;
    InputPanel radiusPanel;
    public MainPanel() {
        this.titlePanel = new TitlePanel();
        this.sidePanel = new InputPanel();
        this.alphaPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.radiusPanel = new InputPanel();

        this.titlePanel.setText("Rombuszba írható kör sugara");
        this.sidePanel.setText("Oldal");
        this.alphaPanel.setText("Alfa szög");
        this.buttonPanel.setCalcButtonText("Számít");
        this.radiusPanel.setText("Sugár");

        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.sidePanel);
        this.getChildren().add(this.alphaPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.radiusPanel);
    }
    public ButtonPanel getButtonPanel() {
        return this.buttonPanel;
    }
    public InputPanel getSidePanel() {
        return this.sidePanel;
    }
    public InputPanel getAlphaPanel() {
        return this.alphaPanel;
    }
    public InputPanel getRadiusPanel() {
        return this.radiusPanel;
    }
}
