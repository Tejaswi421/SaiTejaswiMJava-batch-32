package Day8;
import java.io.*;
import java.util.Scanner;
public class Read
{
    public static void main(String[] args) throws Exception

    {
        Scanner sc = new Scanner(new File("C:\\Users\\Sai Tejaswi\\Documents\\names.csv"));
        //String[] elements=.split();
       sc.useDelimiter(" , ");
        while (sc.hasNext())
        {
            System.out.print(sc.next());
           // List <String> myList = Arrays.asList(myArray);
        }
        sc.close();
    }
}


