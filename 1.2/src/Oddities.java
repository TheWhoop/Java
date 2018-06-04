import java.util.Scanner;
public class Oddities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		for(int i = 1; i <= x; i++) {
			int y = input.nextInt();
			System.out.println(isOdd(y));
		}
		input.close();
	}
	public static String isOdd (int num) {
		if(num%2==0){
			return num+" is even";
		}else {
			return num+" is odd";
		}
	}
}

