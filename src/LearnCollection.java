import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class LearnCollection {

    public static void main(String[] args) {
        List <Integer> l1= new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(5);
        l1.add(5);
        l1.add(2);
        l1.add(8);
        l1.add(5);
        System.out.println("Maximum element from list is " + Collections.max(l1));
        System.out.println("Minimum element from the list is "+Collections.min(l1));
        System.out.println("Number of occurances of the numer is "+ Collections.frequency(l1,5));

    }
}
