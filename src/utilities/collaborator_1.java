package utilities;

import java.util.Scanner;

public class collaborator_1 {

    // write a main method to reverse String
    // JAVA => AVAJ

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Type the string you need reversed");
String str = sc.nextLine();
String res = "";
if ( str.length() > 0) {
 res = revStr(str);
}
        System.out.println(res);
    }

    public static String revStr(String str) {
        
String reversed = "";
for (int i = str.length() - 1; i >= 0; i--) {
reversed += str.charAt(i);
}

        return reversed;
    }
}