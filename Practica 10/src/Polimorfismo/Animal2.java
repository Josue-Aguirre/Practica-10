package Polimorfismo;

public class Animal2 {
	String name, type;
	int age, weight;
	boolean vaccinated;
	public Animal2(String name, int age, boolean vaccinated){
		setName(name);
		setAge(age);
		setVaccinated(vaccinated);
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public String getType() {
		return this.type;
		}
		public void setType(String type) {
		this.type = type;
		}
		public int getAge() {
		return age;
		}
		public void setAge(int age) {
		this.age = age;
		}
		public int getWeight() {
		return weight;
		}
		public void setWeight(int weight) {
		this.weight = weight;
		}
		public boolean getVaccinated(){
		return vaccinated;
		}
		public void setVaccinated(boolean bool){
		vaccinated = bool;
		}
		public void eat(){
		System.out.println(name + " is eating.");
		}
}
