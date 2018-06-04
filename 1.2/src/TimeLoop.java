import java.util.Scanner;
public class TimeLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();
		String output = "";
		for (int i = 1; i <= x; i++) {
			output += i+" Abracadabra\n";
		}
		System.out.print(output);
	}
}
