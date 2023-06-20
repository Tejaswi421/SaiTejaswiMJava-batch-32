package Day16;

import java.util.Arrays;
import java.util.List;

public class Fourth
{
    public static void main(String[] args)
    {
        List<String> names= Arrays.asList("tejaswi","ramya","swathi");
        Object[] arr =names.toArray();
        for(Object obj:arr)
        {
            System.out.print(obj+" ");
        }

    }
}
