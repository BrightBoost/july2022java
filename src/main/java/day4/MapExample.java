package day4;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> hobbiesCursisten = new HashMap<>();
        hobbiesCursisten.put("geert", "voetballen");
        hobbiesCursisten.put("rik", "zwemmen");
        hobbiesCursisten.put("xandra", "wandelen");
        hobbiesCursisten.put("julius", "python");
        hobbiesCursisten.put("ted", "boulderen");
        hobbiesCursisten.put("hub", "lego");
        hobbiesCursisten.put("miranda", "psychologie");

        System.out.println(hobbiesCursisten.get("ted"));
        System.out.println(hobbiesCursisten.get("m"));
        System.out.println(hobbiesCursisten.getOrDefault("maaike", "coderen"));

        // if present
        if(hobbiesCursisten.containsKey("rik")) {
            System.out.println("hij is er! " + hobbiesCursisten.get("rik"));
        }

        System.out.println("keyset: " + hobbiesCursisten.keySet());
        // loopen over maps
        for(String key : hobbiesCursisten.keySet()) {
            System.out.println(hobbiesCursisten.get(key));
        }

        System.out.println(hobbiesCursisten.entrySet());
        // entryset
        for(Map.Entry<String, String> entry : hobbiesCursisten.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }


}
