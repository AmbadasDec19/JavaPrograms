
import java.util.HashMap;

public class CountnoofwordsusingHashmap
{
    public static void main(String[] args)
    {
        String str = "Hello welcome welcome to the Hash Hash map";
        String[] split = str.split(" ");

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++)
        {
            if (map.containsKey(split[i]))
            {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }

}

