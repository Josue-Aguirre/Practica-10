package Polimorfismo;

public class Dog extends Animal{
    
    public Dog (String name, String breed, int age){
        super(name, age);
    }

    @Override 
    public void eat () {
        System.out.println(name + " is eating Pedigree.");
    }
    public void sleep () { 
        System.out.println(name + " is sleeping");
    }
    public void bark () {
    	System.out.println(name + ": WOOF!");
    }
}
