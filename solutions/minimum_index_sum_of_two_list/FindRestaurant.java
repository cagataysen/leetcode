import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindRestaurant {

        public static String[] findRestaurant(String[] list1, String[] list2) {

            HashMap<String, Integer> list1map = new HashMap<>();

            for(int i=0; i < list1.length; i++){
                list1map.put(list1[i], i);
            }

            int minSum = Integer.MAX_VALUE;
            int indexSum = 0;

            List<String> result = new ArrayList<>();

            for(int j = 0; j < list2.length; j++){
                if(list1map.containsKey(list2[j])){
                    indexSum = j + list1map.get(list2[j]);
                    if(indexSum < minSum){
                        minSum = indexSum;
                        result.clear();
                        result.add(list2[j]);
                    }
                    else if(indexSum == minSum){
                        result.add(list2[j]);
                    }
                }
            }

            return result.toArray(new String[0]);


        }
    }

