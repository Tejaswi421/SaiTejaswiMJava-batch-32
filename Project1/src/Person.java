public class Person {
    int height;
    int weight;
    public void calculateBMI()
    {
        float BMI= weight/(height*height);
        System.out.println(BMI);
    }
    public void walk()
    {
        System.out.println("Person is walking");
    }
}
