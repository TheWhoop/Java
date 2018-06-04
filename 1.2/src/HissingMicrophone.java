import java.util.Scanner;
public class HissingMicrophone {
    public static void main(String[] args){
        //Setup a Scan for keyboard input
        Scanner input = new Scanner(System.in);  
        String test = input.next();
        System.out.println(Findss(test));
        //Closes the Scanner
        input.close();
    }
    public static String Findss(String str) {
          for(int index = 0; index <= str.length()-2 ;index++){
            String target = str.substring(index, index+2);
            if (target.equals("ss")){
                return "hiss";
            }
          }
          return "no hiss";
    }
}