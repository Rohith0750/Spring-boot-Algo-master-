import java.util.*;
public class LinkedHashmap {
    public static void main(String a []){
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("USA",50);

        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        System.out.println(hm);
        System.out.println(lhm);

        //In this linked hashmap it will store according to the insertion order
    }
}
