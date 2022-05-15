package Polimorfismo;

import java.util.ArrayList;
public class Zoo {
	public static void main(String[] args){
		Veterinarian vet = new Veterinarian("Josue", 100000);
		ArrayList<Animal2> animals= new ArrayList<Animal2>(3);
		Animal2 dolphin = new Dolphin("Pepe", 60, true);
		Animal2 spider = new Spider("Lucas", 5, false);
		Animal2 crab = new Crab("Jerry", 3, false);
		addAnimal(dolphin, animals);
		addAnimal(spider, animals);
		addAnimal(crab, animals);
		showAnimals(animals);
		vet.vaccinate(dolphin);
		vet.WeighAnimal(dolphin);
		vet.vaccinate(spider);
		vet.WeighAnimal(spider);
		vet.vaccinate(crab);
		vet.WeighAnimal(crab);
		}
		public static void addAnimal(Animal2 animal, ArrayList<Animal2>animals){
		animals.add(animal);
		}
		public static void removeAnimal(Animal2 animal, ArrayList<Animal2>animals){
		animals.remove(animal);
		}
		public static void showAnimals(ArrayList<Animal2> animals){
		System.out.println("------------DIAGNOSIS-----------");
		for(int i=0; i<animals.size(); i++){
			System.out.printf(" > Type: %s\n", animals.get(i).getType());
			System.out.printf(" > Name: %s\n", animals.get(i).getName());
			System.out.printf(" > Age:  %d\n--------------------------------\n",
					animals.get(i).getAge());
					}
		System.out.println("\n-------------RESULTS------------");
		}
}
