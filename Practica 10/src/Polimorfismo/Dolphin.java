package Polimorfismo;

public class Dolphin extends Animal2{
	public Dolphin (String name, int age, boolean vaccinated){
		super(name, age, vaccinated);
		setType("Dolphin");
		setWeight(200);
	}
	public void jump(){
	System.out.println(name + " Jumped constantly");
	}
	@Override
	public void eat(){
	System.out.println(name + " hit the victim with his tail, to make her dizzi and eat her");
	}
}


