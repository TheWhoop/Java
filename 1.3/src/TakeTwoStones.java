import java.util.Scanner;
public class TakeTwoStones {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();
		if (x%2 == 0) {
			System.out.println("Bob");
		}else {
			System.out.println("Alice");
		}
	}
}
