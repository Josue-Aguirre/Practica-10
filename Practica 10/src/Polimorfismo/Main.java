package Polimorfismo;

public class Main{
	public static void main(String[] args) {
        Animal Animal = new Animal("> Animal", 7);
        Dog dog = new Dog("> Keyra", "Husky", 3);
        Cat cat = new Cat("> Floppa", "Caracal", 6);
        Animal.eat();
        Animal.sleep();
        System.out.print("\n");
        dog.eat();
        dog.sleep();
        System.out.print("\n");
        cat.eat();
        cat.sleep();
        System.out.print("\n--------------------------\n\n");
        Animal Animal_2 = new Dog("> Dog","German Shepherd", 5);
        Animal_2.play();
        Animal_2.eat();
        Animal_2.play();
        System.out.print("\n--------------------------\n\n");
        Animal [] animalArray = new Animal[3];
        animalArray[0] = new Dog("> Pancho", "Pomerania", 4);
        animalArray[1] = new Cat("> Roger", "Kinkalow", 8);
        animalArray[2] = new Cat("> Cesar", "Bombay", 2);
        for(Animal animal: animalArray) {
        	animal.eat();
        	if(animal instanceof Dog){
            	((Dog) animal).bark();
            }
        	if(animal instanceof Cat){
            	((Cat) animal).meow();
            }
        }
	}
}
