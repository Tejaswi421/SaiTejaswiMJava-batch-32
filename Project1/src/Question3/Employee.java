package Question3;

public class Employee
{
    private static int Employee_number;

    public static int printNumber()
    {
        return Employee_number;
    }
    static
    {
        Employee_number=10;
    }
    public static void main( String[] args)
    {
        System.out.println("The Question3.Employee number using static block is: "  +Employee.printNumber());
    }
}
