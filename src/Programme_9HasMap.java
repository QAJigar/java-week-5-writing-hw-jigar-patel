import java.util.HashMap;
import java.util.Map;

public class Programme_9HasMap {
    /**
     * Create a HashMap object called people that will store String keys and Integer
     * values: And use for each loop to iterate the value from Map.
     */

    public static void main(String[] args) {
        Map<String, Integer> mapList = new HashMap();
        mapList.put("Dhwani", 23);
        mapList.put("Manish", 35);
        mapList.put("Vrunda", 32);
        mapList.put("Soniya", 31);
        mapList.put("Varshben", 35);
        mapList.put("Jigar", 27);

        System.out.print("People Age: ");
        for (Integer value : mapList.values()) {
            System.out.print(value + ", ");
        }

    }
}
