import java.util.Scanner;

public class StringReverseUsingScannerClass //USING SCANNER CLASS//
{
    public static void main(String[] args) {

        String str1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        str1 = in.nextLine();
        String[] token = str1.split("");    //used split method to print in reverse order
        for (int i = token.length - 1; i >= 0; i--) {
            System.out.print(token[i] + "");
        }
    }
}