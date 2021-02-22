import java.util.Scanner;
public class lbRecActTwo_Jimenez {
    public static int Strlen(String l){
        if (l.equals("")) 
            return 0; 
        else
            return Strlen(l.substring(1)) + 1; 
    }
    public static void main(String[] args)  
    { 
 
        System.out.print("Enter a String: ");
        Scanner scan = new Scanner(System.in);
        String l = scan.nextLine();
        scan.close();
        System.out.println("Length of the string is: " + Strlen(l));
    } 
}