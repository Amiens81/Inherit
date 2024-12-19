public class Main {
	public static void main(String [] args){
       Footballer footballer = new Footballer("Луис Диас", "Ливерпуль", 1992);
	   Footballer footballer2 = new Footballer("Джуд Беллингем", "Реал", 2003);
	   HockeyPlayer hockeyPlayer = new HockeyPlayer("Нико Хишир", "Нью-Джерси Дэвилз", 1999);
	   HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Кайл Коннор", "Виннипег Джетс", 1996);
	   Skier skier = new Skier("Фрида Карлссон", "сборная Швеции", 1999);
	   Skier skier2 = new Skier("Терезе Йохауг", "сборная Норвегии", 1988);
	   footballer.info();
	   footballer.scoringGoals(5);
	   footballer2.info();
	   footballer2.scoringGoals(6);
	   hockeyPlayer.info();
	   hockeyPlayer.scoringGoals(16);
	   hockeyPlayer2.info();
	   hockeyPlayer2.scoringGoals(19);
	   skier.info();
	   skier.skiDistance(10);
	   skier2.info();
	   skier2.skiDistance(20);
	}
}
