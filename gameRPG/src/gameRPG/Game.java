
package gameRPG;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int progress = 0;
		welcome();
		progress ++;
		Story.prologue();
		*/
		Player player = new Player(100,50);
		player.playerTurn(Battles.battle0());

	}
	public static Integer getInput() {
		Scanner input = new Scanner(System.in);
		String command = input.next();
		return Integer.valueOf(command);
	}
	public static void print(String print) {
		System.out.println(print);
	}
	public static void print(int print) {
		System.out.println(Integer.toString(print));
	}
	public static Integer printOptions(String[] options) {
		int i;
		for(i=0;i<options.length;i++) {
			print((i+1) + ") " + options[i]);
		}
		int choice = 0;
		print("Enter the number of the option you wanna choose.");
		try {
			choice = getInput();
		}
		catch (Error e) {
			choice = 0;
		}
		if ((choice < 1) || (choice > i)) {
			print("Not a valid option");
			choice = printOptions(options);
		}
		return choice;
	}
	private static void welcome() {
		print("---------------------------------");
		print("This is a small RPG made in Java.");
		print("---------------------------------");
		String[] options = {"Tutorial", "Skip Tutorial"};
		int choice = printOptions(options);
		print(choice);
		if (choice == 1) {
			Story.tutorial();
		}
	}
}

