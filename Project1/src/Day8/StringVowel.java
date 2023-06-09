package Day8;
import java.util.*;
public class StringVowel
{
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        int count=0;
        for (int i = 0; i <name.length(); i++)
        {
            if(name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U'||
            name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
                count++;
        }
        System.out.println(count);
    }
}
