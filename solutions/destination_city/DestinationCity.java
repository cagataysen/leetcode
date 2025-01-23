package solutions.destination_city;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Map<String, String> cityMap = new HashMap<>();

        for (List<String> path: paths){
            cityMap.put(path.get(0), path.get(1));
        }

        for(String destination: cityMap.values()){
            if(!cityMap.containsKey(destination)){
                return destination;
            }
        }

        return null;
    }
}
