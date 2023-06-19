package Day1415;

import java.util.Arrays;
import java.util.List;

public class Second
{
    public static void main(String[] args)
    {
        String[] strArray = {"tejaswi", "hello", "hi ", "dbc", "njk"};

        Arrays.stream(strArray)
                .filter(s -> s.matches(".*[aeiouAEIOU].*"))
                .forEach(s -> {
                    long vowelCount = s.chars()
                            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                            .count();
                    System.out.println(s + " (Number of vowels: " + vowelCount + ")");
                });

    }
    }

