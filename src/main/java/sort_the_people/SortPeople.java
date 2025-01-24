package sort_the_people;

import java.util.*;

public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> peopleMap = new HashMap<>();

        int index = 0;
        for(String name: names){
            peopleMap.put(heights[index++], name);
        }

        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int count = 0;
        for(int i = heights.length - 1; i >= 0; i--){
            result[count] = peopleMap.get(heights[i]);
            count++;
        }

        return result;

    }
}
