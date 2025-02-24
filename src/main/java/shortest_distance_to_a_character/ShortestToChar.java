package shortest_distance_to_a_character;

public class ShortestToChar {
    public int[] shortestToChar(String s, char c) {

        int size = s.length();
        int[] result = new int[size];
        int c_position = -size; //character has to be in the string

        //forward
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == c){
                c_position = i;
            }
            result[i] = i - c_position;
        }

        //backwards now
        for(int i = size - 1; i >= 0; i--){
            if(s.charAt(i) == c){
                c_position = i;
            }

            result[i] = Math.min(result[i], Math.abs(i-c_position));
        }

        return result;
    }
}
