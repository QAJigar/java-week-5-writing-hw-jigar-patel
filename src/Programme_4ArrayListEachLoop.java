import java.util.AbstractList;
import java.util.ArrayList;
    /**
     * Write a Java program to create a new array list, add some colours (string) and
     * printout the collection using for each loop.
     */
    public class Programme_4ArrayListEachLoop {
        int[] a = new int[7];

        public static void main(String[] args) {
            AbstractList<String> coloursList = new ArrayList<>();
            coloursList.add("Red");
            coloursList.add("Orange");
            coloursList.add("Yellow");
            coloursList.add("Green");
            coloursList.add("Blue");
            coloursList.add("Indigo");
            coloursList.add("Violet");

//            System.out.println(coloursList.size());
//            System.out.println(coloursList.get(1));
//            System.out.println(coloursList.contains("Blue"));

            for (String colours : coloursList) {
                System.out.print(colours + ", ");
            }
        }
    }