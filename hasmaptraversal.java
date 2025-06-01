import java.util.*;
public class hasmaptraversal {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"c");
        map.put(2, "i");

        Set<Integer> keys = map.keySet();
        for(Integer key: keys){
            System.out.println(map.get(key));
        }
    }
}
