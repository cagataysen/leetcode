import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        //frequency map
        //<number, frequency>
        for (int n: nums){
                map.put(n, map.getOrDefault(n,0) + 1);
        }

        //Tree map is sorted map, so we can put frequencies in order
        // <frequency, number list with that frequency>
        TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        for(int num: map.keySet()){
            int freq = map.get(num);
            if (!freqMap.containsKey(freq)) {
                freqMap.put(freq, new LinkedList<>());
            }
            freqMap.get(freq).add(num);
        }

        //extract top k elements
        List<Integer> result = new ArrayList<>();
        while (result.size() < k) {
            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry(); // highest frequency
            result.addAll(entry.getValue());
        }

        return result.stream().mapToInt(i -> i).toArray();


    }




}
