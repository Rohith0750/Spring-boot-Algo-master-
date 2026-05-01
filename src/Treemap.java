import java.util.*;
public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tlhm = new TreeMap<>();

        tlhm.put("India",100);
        tlhm.put("China",150);
        tlhm.put("USA",50);

        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        System.out.println(hm);
        System.out.println(tlhm);

        //It will be stored in a sorted order of the Keys not values

    }
}
