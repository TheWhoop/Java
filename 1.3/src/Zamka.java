import java.util.Scanner;
public class Zamka {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int L = input.nextInt();
		int D = input.nextInt();
		int X = input.nextInt();
		input.close();
		int N = D;
		int M = L;
		for(int i = L; i <= D; i++) {
			if(sumDigits(i) == X) {
				if( i < N ) {
					N = i;
				}
				if( i > M ) {
					M = i;
				}
			}
		}
		System.out.println(N);
		System.out.println(M);
	}
	public static int sumDigits(int n) {
		if (n<10){
			return n;
		}else{
			return sumDigits(n/10)+sumDigits(n%10);
		}
	}
}