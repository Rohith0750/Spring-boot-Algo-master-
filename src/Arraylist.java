import java.util.ArrayList;
public class Arraylist {
    public static ArrayList<Integer> intrersection(int one[] , int two[]){
        //if you font elemnt at the 6th index there is no point of looking the 0-4index next time beacuse it is sorted

        /* now i is at 10 and j is at 15 now if i want to seee the same i==j i want to move the i pointer which should be
         greater than the j value, now i is at 19 and j is at 15 i is greater if i want to match it i want to move the
         j pointer it will be now 16 , and now i  value is at 19 and j value is at 16 ,now i want to move the j pointer
         beacuse i is greater than the j and j will be now 17 , same repaet j will be at 18 , same repeat j will be at
         20 now j is greater than the i now we should move the i it will be ponting at the 20 and now move the j it is
         also now at 20 ,now we got same now add the elemt to the new arraylist 20 ,when we find both are match move the
        both pointer i++ , j++ ,,same logic follows  if any one array is completed stop it .*/
        ArrayList<Integer> ans = new ArrayList<>(); //store the value here
        int i=0;int j=0;
        while(i<one.length && j<two.length){
            if(one[i]<two[j]){
                i++;
            }
            else if(two[j]<one[i]){
                j++;
            }else {
                ans.add(one[i]);
                i++;
                j++;
            }
        }
        return ans;

    }
    //Question 2 --> add two arrays
    //

    //-------------------------------------------------------------------------------------------------------------------

    public static void main(String a[]){
   // ArrayList<Type> variable name=new ArrayList<>() ;
//        ArrayList <Integer> list = new ArrayList<>();
//      //Add Elemnts --> We will use arraylist name .add() .add()Function USed to add the elemnts
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.remove(2);
//        System.out.println(list);
//        int res = list.get(1);  // this is used to accss the element in the array
//        System.out.println(res);
//        //how to replace an elemnt here --> we  use set(index , value);
//        list.set(1,10);
//        System.out.println(list);
//        // remove an elelmt from the array list
//        list.remove(2);
//        System.out.println(list);
//        for(int li:list){
//            System.out.println(li);
//        }
//
//
//        list.add(1,10);
//        System.out.println(list);
//        System.out.println(list.size()); //it will tell the size of an elemnt
        int one[]={10,19,20,30,40,40,40,50}; // in this i is pointed at 1st
        int two[]={15,16,17,18,20,25,30,30,40};//j is pointed at 1st
        System.out.println(intrersection(one,two));
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
   list.add --> This is for adding
   list.set --> This is for replacing
 */

// Question --> Intersection of arrays  arr [10 ,19,20,30,40,40,40,50] arr2 [15,16,17,18,20,25,30,30,40] output [20,30,40]