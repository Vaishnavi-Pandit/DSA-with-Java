/*
 Creating username using the string before @ in mail id
 */
import java.util.Scanner;
public class print_value_before_char_in_mail{
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@'){
                System.out.print(str.substring(0,i));
            }
        }

    }
}
