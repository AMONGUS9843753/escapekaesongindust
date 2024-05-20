//actual game itself
import java.util.*;
public class Game {
	boolean gameEnded;
	public Game() {
		gameEnded=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to: ESCAPE KAESONG INDUSTRIAL REGION");
		System.out.println("What would you like to name your character?");
		Player myPlayer = new Player(sc.next());
		System.out.println(myPlayer.getMoney());
		System.out.println(myPlayer.work());
		System.out.println(myPlayer.getMoney());
	}
	public static void main(String[]args) {
		Game s = new Game();
	}
}
