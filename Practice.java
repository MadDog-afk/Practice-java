import java.util.Scanner;
public class lbRecActTwo_Jimenez {
    public static int Strlen(String s){
        if (s.equals("")) 
            return 0; 
        else
            return Strlen(s.substring(1)) + 1; 
 
    }
}