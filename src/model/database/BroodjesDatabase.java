package model.database;

import model.Broodje;
import model.database.loadSaveStrategies.LoadSaveStrategy;
import model.database.loadSaveStrategies.LoadSaveStrategyEnum;

import java.util.*;

/**
 * @Author: Mattias Waem, Erdem Yilmazdemir, Yannic Freson
 */

public class BroodjesDatabase {
    private TreeMap<String, Broodje> broodjesMap;

    public BroodjesDatabase(LoadSaveStrategyEnum loadSaveStrategyEnum){
        setBroodjesMap(loadSaveStrategyEnum);
    }

    public void setBroodjesMap(LoadSaveStrategyEnum loadSaveStrategyEnum) {
        this.broodjesMap = LoadSaveStrategy.load(loadSaveStrategyEnum);
    }

    /*public TreeMap<String, Broodje> load(){
        TreeMap<String, Broodje>broodjesMap = new TreeMap<String, Broodje>();
        File broodjesFile = new File("src/bestanden/broodjes.txt");
        try {
            Scanner scannerFile = new Scanner(broodjesFile);
            while (scannerFile.hasNextLine()) {
                String s = scannerFile.nextLine();
                String[] delen = s.split(",");
                String broodjesNaam = delen[0];
                double broodjesPrijs = Double.parseDouble(delen[1]);
                int broodjeStock = Integer.parseInt(delen[2]);
                int aantalBroosjesVerkocht = Integer.parseInt(delen[3]);
                Broodje broodje = new Broodje(broodjesNaam, broodjesPrijs, broodjeStock, aantalBroosjesVerkocht);
                broodjesMap.put(broodjesNaam, broodje);
            }
        }  catch (FileNotFoundException ex) {
            System.out.println("fout bij inlezen");
        }
        catch(NumberFormatException e){
            System.out.println("data niet numeriek");
        }
        return broodjesMap;
    }*/

    public void save(){

    }

    public List<Broodje> broodjesMapToList(){
        return new ArrayList<>(this.broodjesMap.values());
    }
}
