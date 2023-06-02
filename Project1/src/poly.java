class Animal{
    void bark()
    {
        System.out.println("Barking");
    }
}
class  Dog extends Animal{
    void bark()
    {
        System.out.println("Dog barks Bow Bow");
    }

    public static void main(String args[]){
        Animal a = new Dog();
        a.bark();
    }
}
