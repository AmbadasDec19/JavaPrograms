import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(50);
        s1.add(10);
        s1.add(20);
        System.out.println("Number of Elements in the list are ---> "+ s1.size());

        System.out.println(s1);
        s1.clear();


    }
}
