public class Skier extends Sportsman{
	public Skier(String name, String team, int age){
		super(name, team, age);
	}

	public void info() {
		System.out.println("Лыжница " + getName() + " из команды " + getTeam() + ", год рождения: " + getAge());
	}
	public void skiDistance(int distance){
		System.out.println(getName() + " прошла дистанцию в " + distance + " километров на лыжах.");
	}
}
