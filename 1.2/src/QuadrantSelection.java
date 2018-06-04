import java.util.Scanner;
public class QuadrantSelection {
    public static void main(String[] args){
        //Setup a Scan for keyboard input
        Scanner input = new Scanner(System.in);
        //Input
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.print("    ");
        //QuadrantSelection
        if (x > 0 && y > 0) {
            System.out.println("1");
        }else if (x < 0 && y > 0) {
            System.out.println("2");
        }else if (x < 0 && y < 0) {
            System.out.println("3");
        }else if (x > 0 && y < 0) {
            System.out.println("4");
        }
        //Closes the Scanner
        input.close();
    }
}
