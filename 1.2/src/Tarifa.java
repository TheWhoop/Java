import java.util.Scanner;
public class Tarifa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int n = input.nextInt();
		int left = x;
		for(int i = 1; i <= n; i++) {
			int y = input.nextInt();
			left += (x-y);
		}
		System.out.println(left);
		input.close();
	}
}
