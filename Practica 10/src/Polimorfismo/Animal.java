package Polimorfismo;

public class Animal {
	String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat () {
        System.out.println(name + " is eating");
    }

    public void sleep () { 
        System.out.println(name + " is sleeping");
    }
    
    public void play () { 
        System.out.println(name + " is playing with the ball");
    }
}
