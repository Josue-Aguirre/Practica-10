package Polimorfismo;

public class Spider extends Animal2{
	public Spider (String name, int age, boolean vaccinated){
		super(name, age, vaccinated);
		setType("Spider");
		setWeight(130);
		}
		public void climb(){
		System.out.println(name + " climbed into his web");
		}
		@Override
		public void eat(){
		System.out.println(name + " ran quickly to his victim and began to antangle him with his web.");
		}

}
