public class Footballer extends Sportsman {
	public Footballer(String name, String team, int age){
		super(name, team, age);
	}
	public void info() {
		System.out.println("Футболист " + getName() + " из команды " + getTeam() + ", год рождения: " + getAge());
	}
	public void scoringGoals(int goals){
		System.out.println(getName() + " забил " + goals + " голов.");
	}
}
