import java.util.HashSet;

public class Programme_8HashSet {
    /**
     * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
     * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
     */
    public static void main(String[] args) {

        HashSet<Integer> storeNumber = new HashSet<>();
        storeNumber.add(4);
        storeNumber.add(7);
        storeNumber.add(8);
        storeNumber.add(11);


        System.out.println("numbers between 1 to 10 in set is: ");
        for (Integer number : storeNumber) {
            if (number >= 1 && number <= 10) {
                System.out.println(number + ", ");
            } else {
                System.out.println("Numbers between 1 to 10 is not in set ");
            }
        }
    }
}