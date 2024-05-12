import java.util.*;

public class Programme_5Iterator {
    /**
     *  Write a Java program to iterate through all elements in an array list using Iterator.
      */
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();

        List<String> list_Strings = new ArrayList();
        list_Strings.add("Hello");
        list_Strings.add("Prime");
        list_Strings.add("Testing");
        list_Strings.add("Good");
        list_Strings.add("Morning");


        ListIterator<String> list_String = list_Strings.listIterator();
        while (list_String.hasNext()) {
            System.out.print(list_String.next() + " ");
}
}
    }

