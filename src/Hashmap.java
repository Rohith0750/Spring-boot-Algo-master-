import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String,Integer>hm = new HashMap<>();
        //Insert

        hm.put("India",120);
        hm.put("USA",130);
        hm.put("China",140);
        System.out.println(hm);
        //get operation
        int population=hm.get("India");
        System.out.println(population);
        //if key not fould it return null

        //containsKey
        System.out.println(hm.containsKey("India"));
        //to iterate over the map
        //we use keySet();
        //we use set collection
        Set<String>keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key +" =" +hm.get(key ));
        }
    }
}
