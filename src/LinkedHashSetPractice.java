//LINKED HASH SET AVOIDS DUPLICATE ELEMENTS

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {

        public static void main(String[] args)
        {
            Set<Integer> set = new LinkedHashSet();
            set.add(10);
            set.add(20);
            set.add(40);
            set.add(50);
            set.add(20);
            System.out.println(set.isEmpty());
            // System.out.println(set.remove(20));
            System.out.println(set);

            Set<String> s2 = new LinkedHashSet<>();
            s2.add("Ravi");
            s2.add("sham");
            s2.add("Hari");
            s2.add("avi");
            System.out.println(s2);
        }
    }


