import java.util.Arrays;
public class LearnArrays {
    public static void main(String[] args)
    {
        int [] numbers = {1,23,3,5,5,6,7,8};
        int [] numbers1 = {1,2,3,4,5,6,8,3};

        for(int i=0;i<numbers.length;i++){
           int no = numbers[i];
           boolean flag=true;
           for(int j=0;j<numbers1.length;j++) {

               if(no==numbers1[j]) {
                   flag = false;
                   break;
               }
           }

           if(flag)
               System.out.println("Difference : "+no);
        }

        System.out.println(Arrays.toString(numbers));

    }
}
