import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApi {
    public static  void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(33);
        list.add(44);
        list.add(5);
        list.add(61);
        list.add(7);
        list.add(18);
        System.out.println(list);
        Stream<Integer> std1=list.stream();
        Stream<Integer> sortedstream = std1.sorted();
        sortedstream.forEach(n->System.out.println(n));
    }
}

//streams is used when you want to use the data which is already there without effecting the original data

