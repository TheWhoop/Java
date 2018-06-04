import java.util.Scanner;
public class ColdputerScience {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int count = 0;
		for(int i = 1; i <= x; i++) {
			int y = input.nextInt();
			if(y<0) {
				count++;
			}
		}
		input.close();
		System.out.println(count);
	}
}
