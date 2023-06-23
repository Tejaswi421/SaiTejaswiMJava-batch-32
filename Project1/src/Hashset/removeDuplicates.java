package Hashset;
import java.util.HashSet;
import java.util.stream.Collectors;

public class removeDuplicates
{
    public static void main(String[] args)
    {
        String name="Niharika";
        HashSet<Character> set = name.chars().mapToObj(e->(char) e).collect(Collectors.toCollection(HashSet::new));
        System.out.println(set);
    }
}
