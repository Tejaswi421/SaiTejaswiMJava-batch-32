package Day16;

import java.util.Arrays;
import java.util.List;

public class Fourth
{
    public static void main(String[] args)
    {
        List<String> names= Arrays.asList("tejaswi","ramya","swathi");
        String[] arr =names.toArray(new String[0]);
        for(Object obj:arr)
        {
            System.out.print(obj+" ");
        }

    }
}
