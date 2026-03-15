import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class twodarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        MainList.add(list);
        MainList.add(list1);

        for (int i = 0; i < MainList.size(); i++) {
            System.out.print(MainList.get(i) + " ");
            ArrayList<Integer> curr = MainList.get(i);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
               }
    }
}