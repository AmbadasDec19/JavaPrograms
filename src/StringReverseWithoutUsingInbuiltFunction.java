public class StringReverseWithoutUsingInbuiltFunction {

    public static void main(String[] args) {
        String str = "Darshan";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
    }
}

