public class DuplicateArray {

    public static void main(String[] args) {
        int no[] = {10, 20, 30, 40,20,10};
        System.out.println("Length: " + no.length);
        for (int i = 0; i < no.length; i++) {
            int counter = 0;
            int tmp = no[i];
            for (int j = 0; j < no.length; j++)
            {
                if (tmp == no[j])
                    counter++;
            }
            if (counter >=2)
                System.out.println("number is duplicate:    " + tmp);
        }
    }
}
/*  public static void main(String arcp[]){
        int no[] = {10,50,20,30,40,50};
        System.out.println("Length : "+no.length);
        for(int i=0;i<no.length;i++){
            int counter=0;
            int tmp = no[i];
            for(int j=0;j<no.length;j++){
                if(tmp==no[j])
                    counter++;
            }
            if(counter>=2)
                System.out.println("Number is duplicate: "+tmp);
  */

