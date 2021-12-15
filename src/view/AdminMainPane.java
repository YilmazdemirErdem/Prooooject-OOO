package view;


import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import model.database.BroodjesDatabase;
import model.database.loadSaveStrategies.LoadSaveStrategy;
import model.database.loadSaveStrategies.LoadSaveStrategyEnum;
import view.panels.BroodjesOverviewPane;

import java.io.IOException;

/**
 * @Author: Mattias Waem, Erdem Yilmazdemir, Yannic Freson
 */

public class AdminMainPane extends BorderPane {

    public AdminMainPane() {
        BroodjesDatabase broodjesDatabase = new BroodjesDatabase(LoadSaveStrategyEnum.EXCEL);

        TabPane tabPane = new TabPane();
        BroodjesOverviewPane broodjesOverviewPane = new BroodjesOverviewPane(broodjesDatabase);
        Tab broodjesTab = new Tab("Broodjes/Beleg", broodjesOverviewPane);
        Tab instellingTab = new Tab("Instellingen");
        Tab statistiekTab = new Tab("Statistieken");
        tabPane.getTabs().add(broodjesTab);
        tabPane.getTabs().add(statistiekTab);
        tabPane.getTabs().add(instellingTab);
        this.setCenter(tabPane);
    }
}

