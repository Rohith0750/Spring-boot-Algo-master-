import java.util.ArrayList;
public class Arraylist {
    public static void main(String a[]){
   // ArrayList<Type> variable name=new ArrayList<>() ;
        ArrayList <Integer> list = new ArrayList<>();
      //Add Elemnts --> We will use arraylist name .add() .add()Function USed to add the elemnts
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.remove(2);
        System.out.println(list);
    }
}
//Theorey
/* The limitation in an array
Fixed size , mention size at the start
Store the same data type
 */

// To overcome this we came to Arraylist
/*
It is used to solve the disadvantage of an array i.e
It allows us to create an resizwable array , it can automtically adjust their capacity to add or remove an elements
It automatcally increase the size if an add an elememnts , and decrase the size if we delete the elements
That is why arraylist is known as the dynamic array.
 */

/* How to we create an array list
1. Import the library java.util.ArrayList;
 */
//Syntax
/*
  ArrayList<Type> variable name=new ArrayList<>();
   ArrayList <Integer> list = new ArrayList<>();
 */