package Polimorfismo;

public class Cat extends Animal{
    
    public Cat (String name, String breed, int age){
        super(name, age);
    }

    @Override 
    public void eat () {
        System.out.println(name + " is eating Whiskas.");
    }
    public void meow () {
    	System.out.println(name + ": MEOW!");
    }
}
