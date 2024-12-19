public class HockeyPlayer extends Sportsman{
	public HockeyPlayer(String name, String team, int age){
		super(name, team, age);
	}
	public void info(){
		System.out.println("Хоккеист " + getName() + " из команды " + getTeam() + ", год рождения: " + getAge() );
	}
	public void scoringGoals(int goals){
		System.out.println(getName() + " забросил " + goals + " шайб.");
	}
}
