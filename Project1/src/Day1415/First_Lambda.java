package Day1415;
import java.util.*;

public class First_Lambda
{
public static void main(String[] args)
{
    List<String> names= Arrays.asList("tejaswi","ramya","ananya");
    names.sort((s,t)->s.compareTo(t));
    names.forEach((n)->System.out.println(n.substring(0,1).toUpperCase()+n.substring(1).toLowerCase()));
}
}
