import java.util.*;

public class om {
   
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                b = b%10;
                a = a%10;
            return b-a;        }
        };
         

        // Create a List to hold Strings
        List<Integer> lt = new ArrayList<>();
        
        // Add some strings to the list
        lt.add(12);
        lt.add(15);
        lt.add(51);

        // Sort the list using the Comparator
        Collections.sort(lt, com);

        // Print the sorted list
        System.out.println(lt);  // Output will be [ab, abc, abcdef]
    }
}
