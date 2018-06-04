import java.util.Scanner;
public class Trik {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String L = input.nextLine();
		input.close();
		int ball = 1;
		for(int i = 0; i < L.length(); i++) {
			ball = switchCups(ball, L.substring(i, i+1));
		}
		System.out.println(ball);
	}
	public static int switchCups(int ball, String move) {
		if (move.equals("A")){
			if(ball == 1) {
				return 2;
			}else if(ball == 2) {
				return 1;
			}else {
				return 3;
			}
		}else if(move.equals("B")){
			if(ball == 2) {
				return 3;
			}else if(ball == 3) {
				return 2;
			}else {
				return 1;
			}
		}else {
			if(ball == 1) {
				return 3;
			}else if(ball == 3) {
				return 1;
			}else {
				return 2;
			}
		}
	}
}