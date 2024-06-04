public class Main extends Solution3{

public static void main(String[] args) {
    char[] s = {'h', 'e', 'l', 'l', 'o'};
    System.out.println("Original array: " + String.valueOf(s));

    reverseString(s);

    System.out.println("Reversed array: " + String.valueOf(s));

    String[] restaurants1 = {"mudurnu", "napcaz", "misirli", "abdo", "caglayan", "kebo"};
    String[] restaurants2 = {"ulus kofte", "tadim doner", "misirli", "kebo"};
    FindRestaurant.findRestaurant(restaurants1, restaurants2);


}



}
