
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    public static Account account;
    @Autowired
    public static Address address;
public static void main(String[] args)
{
    account.setAccount("Java");
    System.out.println(account.getAccount());
}


}
