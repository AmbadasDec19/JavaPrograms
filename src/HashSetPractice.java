import java.util.HashSet;
import java.util.Set;

public class HashSetPractice
{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(30);
        System.out.println(set.isEmpty());
       // System.out.println(set.remove(20));
        System.out.println(set);

        Set<String> set1 = new HashSet<>();
        set1.add("Darshan");
        set1.add("Ishant");
        set1.add("Ishu");
        set1.add("Darshan");
        System.out.println(set1);
    }
}
