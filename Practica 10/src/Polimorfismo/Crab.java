package Polimorfismo;

public class Crab extends Animal2{
	public Crab (String name, int age, boolean vaccinated){
		super(name, age, vaccinated);
		setType("Crab");
		setWeight(1);
		}
		public void run(){
		System.out.println(name + " runned faster between the rocks");
		}
		@Override
		public void eat(){
		System.out.println(name + " runned fast to catch his victim with his tongs and eat him");
		}
		
}
