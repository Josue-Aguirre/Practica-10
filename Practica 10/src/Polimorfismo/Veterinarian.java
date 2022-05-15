package Polimorfismo;

public class Veterinarian {
	String name;
	double salary;
	public Veterinarian (String name, double salary) {
	this.name = name;
	this.salary = salary;
	}
	public void vaccinate (Animal2 animal){
	if(!animal.getVaccinated()){
	animal.setVaccinated (true);
	System.out.println(" > " + animal.getName() + "\n" + "   was vaccinated  ");
	}else{
	System.out.println(" > " + animal.getName() + "\n" + "   was already vaccinated!  ");
	}
	}
	public void WeighAnimal (Animal2 animal){
	System.out.println("   was weighed!!");
	System.out.println("   It weighs " + animal.getWeight() +" pounds!");
	System.out.print("--------------------------------\n");
	}
}
