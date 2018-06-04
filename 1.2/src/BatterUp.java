import java.util.Scanner;

public class BatterUp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		double count = 0;
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			int y = input.nextInt();
			if(y>-1) {
				count++;
				sum += y;
			}
		}
		input.close();
		System.out.println(sum/count);
	}
}
