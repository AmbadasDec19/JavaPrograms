import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers= new HashMap<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two",2);
        numbers.put("three",3);

        //if(numbers.containsKey("three"))
        //{
          //  numbers.put("three", 4);
        //}
        System.out.println(numbers);
        for(Map.Entry<String, Integer> e: numbers.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
