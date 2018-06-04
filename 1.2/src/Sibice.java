import java.util.Scanner;
public class Sibice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int w = input.nextInt();
		int h = input.nextInt();
		for(int i = 1; i <= n; i++) {
			int y = input.nextInt();
			if (	y <= (int)(Math.sqrt( (w*w)+(h*h) ))	) {
				System.out.println("DA"); 
			}else {
				System.out.println("NE");
			}
		}
		input.close();
	}
}