package Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("A", "c", "d", "e"));
        int lastIndex = names.size()-1;
        names.remove(lastIndex);
        System.out.println(names);
    }
}

