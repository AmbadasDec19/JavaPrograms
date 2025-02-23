import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LearnList {


    public static void main(String[] args)
    {

        //LIST example
         List <String> mylist = new ArrayList();
         mylist.add("Darshan");
         mylist.add("Ishant");
         mylist.add("Ishant");
         mylist.add("Ishu");
         mylist.set(0,"Mayuri");
         System.out.println(mylist);

        List <Integer> l1 = new ArrayList<>();
        List<Objects> l2 = new ArrayList<>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        System.out.println(l1);
// SET example
        System.out.println(l1.get(1)); // This will print value of Index2
        l1.set(2,555); // set - will update the value of index 2 so 30 is replaced by 555
        System.out.println(l1);
        System.out.println(l1.contains(55)); // this will check the element present in the list
        System.out.println(l1.contains(20)); //this will return true as 20 is present

        System.out.println("min elemnet" + Collections.min(l1)); // this will shows min element from list
    }
}
