import java.util.Scanner;
public class Pot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			int y = input.nextInt();
			int p = y%10;
				y = y/10;
			int powerSum = y;
			for(int j = 1; j < p; j++) {
				powerSum =  powerSum * y;
			}
			if (p == 0) {
				sum += 1;
			}else {
				sum += powerSum;
			}
		}
		input.close();
		System.out.println(sum);
	}
}
