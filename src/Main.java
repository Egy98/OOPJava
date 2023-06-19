import Models.Inventory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        Inventory mvagusta = new Inventory
                (
                        "00",
                        "Brutale",
                        15.950
                );
        Inventory ducati = new Inventory
                (
                        "01",
                        "Monster",
                        11.290
                );
        Inventory triumph = new Inventory
                (
                        "02",
                        "StreetTriple",
                        9.995
                );


        Map<String, String> map = new HashMap<>();

        map.put("00","Brutale");
        map.put("01","Monster");
        map.put("02","StreetTriple");

        System.out.println("\n" + map + "\n");
        System.out.println("\n L'inventario e' composto da " + map.size() + " MOTO\n");

        double somPrice = mvagusta.som() + ducati.som() + triumph.som();
        System.out.println("\n La somma dell'inventario  e' : " + somPrice);

        

    }
}